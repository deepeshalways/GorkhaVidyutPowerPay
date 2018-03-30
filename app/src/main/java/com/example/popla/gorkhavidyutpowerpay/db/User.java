package com.example.popla.gorkhavidyutpowerpay.db;

import org.greenrobot.greendao.annotation.*;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END

/**
 * Entity mapped to table "USER".
 */
@Entity
public class User {

    @Id(autoincrement = true)
    private Long user_id;
    private String user_name;
    private String user_type;
    private String user_email;
    private Integer user_mobile;
    private Long user_aadhar;
    private String user_password;
    private String user_kno;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    @Generated
    public User() {
    }

    public User(Long user_id) {
        this.user_id = user_id;
    }

    @Generated
    public User(Long user_id, String user_name, String user_type, String user_email, Integer user_mobile, Long user_aadhar, String user_password, String user_kno) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_type = user_type;
        this.user_email = user_email;
        this.user_mobile = user_mobile;
        this.user_aadhar = user_aadhar;
        this.user_password = user_password;
        this.user_kno = user_kno;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public Integer getUser_mobile() {
        return user_mobile;
    }

    public void setUser_mobile(Integer user_mobile) {
        this.user_mobile = user_mobile;
    }

    public Long getUser_aadhar() {
        return user_aadhar;
    }

    public void setUser_aadhar(Long user_aadhar) {
        this.user_aadhar = user_aadhar;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_kno() {
        return user_kno;
    }

    public void setUser_kno(String user_kno) {
        this.user_kno = user_kno;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
