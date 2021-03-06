/**
 * This class is generated by jOOQ
 */
package com.mgl.jpa.mapping.samples.jooq.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Avatar implements Serializable {

    private static final long serialVersionUID = -1887018959;

    private Long   id;
    private Long   version;
    private String url;
    private Long   userprofileId;

    public Avatar() {}

    public Avatar(Avatar value) {
        this.id = value.id;
        this.version = value.version;
        this.url = value.url;
        this.userprofileId = value.userprofileId;
    }

    public Avatar(
        Long   id,
        Long   version,
        String url,
        Long   userprofileId
    ) {
        this.id = id;
        this.version = version;
        this.url = url;
        this.userprofileId = userprofileId;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return this.version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getUserprofileId() {
        return this.userprofileId;
    }

    public void setUserprofileId(Long userprofileId) {
        this.userprofileId = userprofileId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Avatar (");

        sb.append(id);
        sb.append(", ").append(version);
        sb.append(", ").append(url);
        sb.append(", ").append(userprofileId);

        sb.append(")");
        return sb.toString();
    }
}
