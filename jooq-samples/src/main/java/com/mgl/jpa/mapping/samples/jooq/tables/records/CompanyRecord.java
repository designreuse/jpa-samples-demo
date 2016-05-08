/**
 * This class is generated by jOOQ
 */
package com.mgl.jpa.mapping.samples.jooq.tables.records;


import com.mgl.jpa.mapping.samples.jooq.tables.Company;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


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
public class CompanyRecord extends UpdatableRecordImpl<CompanyRecord> implements Record10<Long, Long, Timestamp, Timestamp, String, String, String, String, String, String> {

    private static final long serialVersionUID = 665493818;

    /**
     * Setter for <code>jpa.Company.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>jpa.Company.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>jpa.Company.version</code>.
     */
    public void setVersion(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>jpa.Company.version</code>.
     */
    public Long getVersion() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>jpa.Company.creationTs</code>.
     */
    public void setCreationts(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>jpa.Company.creationTs</code>.
     */
    public Timestamp getCreationts() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>jpa.Company.lastModificationTs</code>.
     */
    public void setLastmodificationts(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>jpa.Company.lastModificationTs</code>.
     */
    public Timestamp getLastmodificationts() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>jpa.Company.city</code>.
     */
    public void setCity(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>jpa.Company.city</code>.
     */
    public String getCity() {
        return (String) get(4);
    }

    /**
     * Setter for <code>jpa.Company.street</code>.
     */
    public void setStreet(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>jpa.Company.street</code>.
     */
    public String getStreet() {
        return (String) get(5);
    }

    /**
     * Setter for <code>jpa.Company.email</code>.
     */
    public void setEmail(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>jpa.Company.email</code>.
     */
    public String getEmail() {
        return (String) get(6);
    }

    /**
     * Setter for <code>jpa.Company.firstName</code>.
     */
    public void setFirstname(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>jpa.Company.firstName</code>.
     */
    public String getFirstname() {
        return (String) get(7);
    }

    /**
     * Setter for <code>jpa.Company.lastName</code>.
     */
    public void setLastname(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>jpa.Company.lastName</code>.
     */
    public String getLastname() {
        return (String) get(8);
    }

    /**
     * Setter for <code>jpa.Company.organisationName</code>.
     */
    public void setOrganisationname(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>jpa.Company.organisationName</code>.
     */
    public String getOrganisationname() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, Long, Timestamp, Timestamp, String, String, String, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, Long, Timestamp, Timestamp, String, String, String, String, String, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Company.COMPANY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Company.COMPANY.VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return Company.COMPANY.CREATIONTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Company.COMPANY.LASTMODIFICATIONTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Company.COMPANY.CITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Company.COMPANY.STREET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Company.COMPANY.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Company.COMPANY.FIRSTNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Company.COMPANY.LASTNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Company.COMPANY.ORGANISATIONNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getCreationts();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getLastmodificationts();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getStreet();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getFirstname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getLastname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getOrganisationname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyRecord value2(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyRecord value3(Timestamp value) {
        setCreationts(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyRecord value4(Timestamp value) {
        setLastmodificationts(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyRecord value5(String value) {
        setCity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyRecord value6(String value) {
        setStreet(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyRecord value7(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyRecord value8(String value) {
        setFirstname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyRecord value9(String value) {
        setLastname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyRecord value10(String value) {
        setOrganisationname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyRecord values(Long value1, Long value2, Timestamp value3, Timestamp value4, String value5, String value6, String value7, String value8, String value9, String value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CompanyRecord
     */
    public CompanyRecord() {
        super(Company.COMPANY);
    }

    /**
     * Create a detached, initialised CompanyRecord
     */
    public CompanyRecord(Long id, Long version, Timestamp creationts, Timestamp lastmodificationts, String city, String street, String email, String firstname, String lastname, String organisationname) {
        super(Company.COMPANY);

        set(0, id);
        set(1, version);
        set(2, creationts);
        set(3, lastmodificationts);
        set(4, city);
        set(5, street);
        set(6, email);
        set(7, firstname);
        set(8, lastname);
        set(9, organisationname);
    }
}