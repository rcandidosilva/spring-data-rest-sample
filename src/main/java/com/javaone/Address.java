package com.javaone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by rodrigo on 6/30/16.
 */
@Entity
public class Address implements Serializable {

    @Id @GeneratedValue
    private Long id;

    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Address(String address) {
        this.address = address;
    }

    public Address() {
    }
}
