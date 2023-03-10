/*
 * This file is generated by jOOQ.
 */
package com.tej.JooQDemo.jooq.sample.model.tables.records;


import com.tej.JooQDemo.jooq.sample.model.tables.Customers;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CustomersRecord extends UpdatableRecordImpl<CustomersRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>customerdb.customers.customer_id</code>.
     */
    public CustomersRecord setCustomerId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>customerdb.customers.customer_id</code>.
     */
    public Integer getCustomerId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>customerdb.customers.address</code>.
     */
    public CustomersRecord setAddress(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>customerdb.customers.address</code>.
     */
    public String getAddress() {
        return (String) get(1);
    }

    /**
     * Setter for <code>customerdb.customers.name</code>.
     */
    public CustomersRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>customerdb.customers.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Customers.CUSTOMERS.CUSTOMER_ID;
    }

    @Override
    public Field<String> field2() {
        return Customers.CUSTOMERS.ADDRESS;
    }

    @Override
    public Field<String> field3() {
        return Customers.CUSTOMERS.NAME;
    }

    @Override
    public Integer component1() {
        return getCustomerId();
    }

    @Override
    public String component2() {
        return getAddress();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public Integer value1() {
        return getCustomerId();
    }

    @Override
    public String value2() {
        return getAddress();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public CustomersRecord value1(Integer value) {
        setCustomerId(value);
        return this;
    }

    @Override
    public CustomersRecord value2(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public CustomersRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public CustomersRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CustomersRecord
     */
    public CustomersRecord() {
        super(Customers.CUSTOMERS);
    }

    /**
     * Create a detached, initialised CustomersRecord
     */
    public CustomersRecord(Integer customerId, String address, String name) {
        super(Customers.CUSTOMERS);

        setCustomerId(customerId);
        setAddress(address);
        setName(name);
    }
}
