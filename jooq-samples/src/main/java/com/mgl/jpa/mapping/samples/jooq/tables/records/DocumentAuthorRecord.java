/**
 * This class is generated by jOOQ
 */
package com.mgl.jpa.mapping.samples.jooq.tables.records;


import com.mgl.jpa.mapping.samples.jooq.tables.DocumentAuthor;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


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
public class DocumentAuthorRecord extends TableRecordImpl<DocumentAuthorRecord> implements Record2<Long, Long> {

    private static final long serialVersionUID = -934505944;

    /**
     * Setter for <code>jpa.Document_Author.documentId</code>.
     */
    public void setDocumentid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>jpa.Document_Author.documentId</code>.
     */
    public Long getDocumentid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>jpa.Document_Author.authorId</code>.
     */
    public void setAuthorid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>jpa.Document_Author.authorId</code>.
     */
    public Long getAuthorid() {
        return (Long) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, Long> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return DocumentAuthor.DOCUMENT_AUTHOR.DOCUMENTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return DocumentAuthor.DOCUMENT_AUTHOR.AUTHORID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getDocumentid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getAuthorid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentAuthorRecord value1(Long value) {
        setDocumentid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentAuthorRecord value2(Long value) {
        setAuthorid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentAuthorRecord values(Long value1, Long value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DocumentAuthorRecord
     */
    public DocumentAuthorRecord() {
        super(DocumentAuthor.DOCUMENT_AUTHOR);
    }

    /**
     * Create a detached, initialised DocumentAuthorRecord
     */
    public DocumentAuthorRecord(Long documentid, Long authorid) {
        super(DocumentAuthor.DOCUMENT_AUTHOR);

        set(0, documentid);
        set(1, authorid);
    }
}