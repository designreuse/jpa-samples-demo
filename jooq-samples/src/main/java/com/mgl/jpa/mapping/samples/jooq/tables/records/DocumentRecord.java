/**
 * This class is generated by jOOQ
 */
package com.mgl.jpa.mapping.samples.jooq.tables.records;


import com.mgl.jpa.mapping.samples.jooq.tables.Document;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class DocumentRecord extends UpdatableRecordImpl<DocumentRecord> implements Record7<String, Long, Long, Integer, String, String, String> {

    private static final long serialVersionUID = -84523063;

    /**
     * Setter for <code>jpa.Document.documentKind</code>.
     */
    public void setDocumentkind(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>jpa.Document.documentKind</code>.
     */
    public String getDocumentkind() {
        return (String) get(0);
    }

    /**
     * Setter for <code>jpa.Document.id</code>.
     */
    public void setId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>jpa.Document.id</code>.
     */
    public Long getId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>jpa.Document.version</code>.
     */
    public void setVersion(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>jpa.Document.version</code>.
     */
    public Long getVersion() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>jpa.Document.pagesCnt</code>.
     */
    public void setPagescnt(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>jpa.Document.pagesCnt</code>.
     */
    public Integer getPagescnt() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>jpa.Document.title</code>.
     */
    public void setTitle(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>jpa.Document.title</code>.
     */
    public String getTitle() {
        return (String) get(4);
    }

    /**
     * Setter for <code>jpa.Document.url</code>.
     */
    public void setUrl(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>jpa.Document.url</code>.
     */
    public String getUrl() {
        return (String) get(5);
    }

    /**
     * Setter for <code>jpa.Document.filePath</code>.
     */
    public void setFilepath(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>jpa.Document.filePath</code>.
     */
    public String getFilepath() {
        return (String) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, Long, Long, Integer, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, Long, Long, Integer, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Document.DOCUMENT.DOCUMENTKIND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Document.DOCUMENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return Document.DOCUMENT.VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Document.DOCUMENT.PAGESCNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Document.DOCUMENT.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Document.DOCUMENT.URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Document.DOCUMENT.FILEPATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getDocumentkind();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getPagescnt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getFilepath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentRecord value1(String value) {
        setDocumentkind(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentRecord value2(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentRecord value3(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentRecord value4(Integer value) {
        setPagescnt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentRecord value5(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentRecord value6(String value) {
        setUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentRecord value7(String value) {
        setFilepath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentRecord values(String value1, Long value2, Long value3, Integer value4, String value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DocumentRecord
     */
    public DocumentRecord() {
        super(Document.DOCUMENT);
    }

    /**
     * Create a detached, initialised DocumentRecord
     */
    public DocumentRecord(String documentkind, Long id, Long version, Integer pagescnt, String title, String url, String filepath) {
        super(Document.DOCUMENT);

        set(0, documentkind);
        set(1, id);
        set(2, version);
        set(3, pagescnt);
        set(4, title);
        set(5, url);
        set(6, filepath);
    }
}
