/*
 * This file is generated by jOOQ.
 */
package com.tej.JooQDemo.jooq.sample.model.tables.pojos;


import java.io.Serializable;
import java.time.LocalDate;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Teachers implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer   id;
    private String    name;
    private LocalDate birthday;
    private Integer   age;
    private String    address;

    public Teachers() {}

    public Teachers(Teachers value) {
        this.id = value.id;
        this.name = value.name;
        this.birthday = value.birthday;
        this.age = value.age;
        this.address = value.address;
    }

    public Teachers(
        Integer   id,
        String    name,
        LocalDate birthday,
        Integer   age,
        String    address
    ) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.age = age;
        this.address = address;
    }

    /**
     * Getter for <code>customerdb.teachers.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>customerdb.teachers.id</code>.
     */
    public Teachers setId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>customerdb.teachers.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>customerdb.teachers.name</code>.
     */
    public Teachers setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>customerdb.teachers.birthday</code>.
     */
    public LocalDate getBirthday() {
        return this.birthday;
    }

    /**
     * Setter for <code>customerdb.teachers.birthday</code>.
     */
    public Teachers setBirthday(LocalDate birthday) {
        this.birthday = birthday;
        return this;
    }

    /**
     * Getter for <code>customerdb.teachers.age</code>.
     */
    public Integer getAge() {
        return this.age;
    }

    /**
     * Setter for <code>customerdb.teachers.age</code>.
     */
    public Teachers setAge(Integer age) {
        this.age = age;
        return this;
    }

    /**
     * Getter for <code>customerdb.teachers.address</code>.
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Setter for <code>customerdb.teachers.address</code>.
     */
    public Teachers setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Teachers other = (Teachers) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        if (birthday == null) {
            if (other.birthday != null)
                return false;
        }
        else if (!birthday.equals(other.birthday))
            return false;
        if (age == null) {
            if (other.age != null)
                return false;
        }
        else if (!age.equals(other.age))
            return false;
        if (address == null) {
            if (other.address != null)
                return false;
        }
        else if (!address.equals(other.address))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.birthday == null) ? 0 : this.birthday.hashCode());
        result = prime * result + ((this.age == null) ? 0 : this.age.hashCode());
        result = prime * result + ((this.address == null) ? 0 : this.address.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Teachers (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(birthday);
        sb.append(", ").append(age);
        sb.append(", ").append(address);

        sb.append(")");
        return sb.toString();
    }
}