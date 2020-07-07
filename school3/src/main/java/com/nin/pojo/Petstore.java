package com.nin.pojo;

import javax.persistence.*;

public class Petstore {
    @Id
    private Integer id;

    private String name;

    private String password;

    private Integer balance;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * @return balance
     */
    public Integer getBalance() {
        return balance;
    }

    /**
     * @param balance
     */
    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}