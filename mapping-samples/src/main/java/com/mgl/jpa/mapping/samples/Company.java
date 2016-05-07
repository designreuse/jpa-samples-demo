package com.mgl.jpa.mapping.samples;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.mgl.jpa.mapping.samples.contact.ContactInformation;
import com.mgl.jpa.mapping.samples.contact.HasContactInformation;
import com.mgl.jpa.mapping.samples.logicaldelete.IsLogicallyDeletable;
import com.mgl.jpa.mapping.samples.logicaldelete.LogicalDeletion;
import com.mgl.jpa.mapping.samples.tscontrol.TsControlledEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Delegate;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Audited
@Table(
    indexes = {
        @Index(name = "company__firstName_lastName_idx", columnList = "firstName, lastName"),
        @Index(name = "company__deleted_idx", columnList = "deleted")
    },
    uniqueConstraints = {
        @UniqueConstraint(name = "company__email_uidx", columnNames = {"email"})
    }
)
@SQLDelete(sql =
        "update Company "
        + "set deleted = true, deletionTs = CURRENT_TIMESTAMP "
        + "where id = ? and version = ?")
@Where(clause = "not deleted")
@Getter @Setter @ToString(callSuper = true, exclude = {"userProfiles"}) @NoArgsConstructor
public class Company extends TsControlledEntity implements HasContactInformation, IsLogicallyDeletable {

    private static final long serialVersionUID = 1L;

    private static final int ORG_NAME_MIN_LEN = 1;
    private static final int ORG_NAME_MAX_LEN = 64;

    @NotNull @NotBlank @Size(min = ORG_NAME_MIN_LEN, max = ORG_NAME_MAX_LEN)
    @Column(nullable = false, length = ORG_NAME_MAX_LEN)
    private String organisationName;

    @Embedded @NotNull
    @Delegate(types = {HasContactInformation.class})
    private ContactInformation contactInformation = new ContactInformation();

    @Embedded @NotNull
    @Delegate(types = {IsLogicallyDeletable.class})
    private LogicalDeletion deleteSupport = new LogicalDeletion();

    @NotAudited
    @OneToMany(mappedBy = "company", cascade = {CascadeType.REMOVE}, orphanRemoval = true)
    @Where(clause = "not deleted")
    private List<UserProfile> userProfiles;

    public Company(String organisationName, String email) {
        this.organisationName = organisationName;
        this.contactInformation.setEmail(email);
    }

    @PrePersist
    @Override
    public void onPersist() {
        super.onPersist();
        getDeleteSupport().onPersistOrUpdate();
    }

    @PreUpdate
    @Override
    public void onUpdate() {
        super.onUpdate();
        getDeleteSupport().onPersistOrUpdate();
    }

}
