package com.freezejk.chat.bean;

import com.freezejk.chat.util.DateTimeUtil;

import java.io.Serializable;

/**
 * Created by sjk on 16-11-28.
 */
public class User implements Serializable {

    // necessary fields
    private String name;
    private String createdDateTime;
    private String account;     // unique --> id
    private String password;

    // optional fields
    private boolean isFemale;   // true if female
    private String selfIntroduction;

    /* User factory .*/
    public static User newInstance(String account, String password, String name, boolean isFemale) {
        User user = new User();
        user.account = account;
        user.password = password;
        user.name = name;
        user.isFemale = isFemale;
        user.createdDateTime = DateTimeUtil.getCurrentDateTime();   // Automatically generates the date & time.
        return user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public void setFemale(boolean female) {
        isFemale = female;
    }

    public String getSelfIntroduction() {
        return selfIntroduction;
    }

    public void setSelfIntroduction(String selfIntroduction) {
        this.selfIntroduction = selfIntroduction;
    }

    public String getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
    }
}
