/*
 * This file is generated by jOOQ.
 */
package com.tej.JooQDemo.jooq.sample.model.tables;


import com.tej.JooQDemo.jooq.sample.model.Customerdb;
import com.tej.JooQDemo.jooq.sample.model.Keys;
import com.tej.JooQDemo.jooq.sample.model.tables.records.TeachersRecord;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Teachers extends TableImpl<TeachersRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>customerdb.teachers</code>
     */
    public static final Teachers TEACHERS = new Teachers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TeachersRecord> getRecordType() {
        return TeachersRecord.class;
    }

    /**
     * The column <code>customerdb.teachers.id</code>.
     */
    public final TableField<TeachersRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>customerdb.teachers.name</code>.
     */
    public final TableField<TeachersRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>customerdb.teachers.birthday</code>.
     */
    public final TableField<TeachersRecord, LocalDate> BIRTHDAY = createField(DSL.name("birthday"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>customerdb.teachers.age</code>.
     */
    public final TableField<TeachersRecord, Integer> AGE = createField(DSL.name("age"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>customerdb.teachers.address</code>.
     */
    public final TableField<TeachersRecord, String> ADDRESS = createField(DSL.name("address"), SQLDataType.VARCHAR(255), this, "");

    private Teachers(Name alias, Table<TeachersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Teachers(Name alias, Table<TeachersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>customerdb.teachers</code> table reference
     */
    public Teachers(String alias) {
        this(DSL.name(alias), TEACHERS);
    }

    /**
     * Create an aliased <code>customerdb.teachers</code> table reference
     */
    public Teachers(Name alias) {
        this(alias, TEACHERS);
    }

    /**
     * Create a <code>customerdb.teachers</code> table reference
     */
    public Teachers() {
        this(DSL.name("teachers"), null);
    }

    public <O extends Record> Teachers(Table<O> child, ForeignKey<O, TeachersRecord> key) {
        super(child, key, TEACHERS);
    }

    @Override
    public Schema getSchema() {
        return Customerdb.CUSTOMERDB;
    }

    @Override
    public Identity<TeachersRecord, Integer> getIdentity() {
        return (Identity<TeachersRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<TeachersRecord> getPrimaryKey() {
        return Keys.KEY_TEACHERS_PRIMARY;
    }

    @Override
    public List<UniqueKey<TeachersRecord>> getKeys() {
        return Arrays.<UniqueKey<TeachersRecord>>asList(Keys.KEY_TEACHERS_PRIMARY);
    }

    @Override
    public Teachers as(String alias) {
        return new Teachers(DSL.name(alias), this);
    }

    @Override
    public Teachers as(Name alias) {
        return new Teachers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Teachers rename(String name) {
        return new Teachers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Teachers rename(Name name) {
        return new Teachers(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, LocalDate, Integer, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
