package com.esoft.smartstudentmanagement.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AllUsers {
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("user_img")
    @Expose
    private String userImg;
    @SerializedName("role")
    @Expose
    private List<String> role = null;

    public AllUsers() {
    }

//    public Data(int anInt, String string, String string1, String string2, String string3, String string4, String string5) {
//        return ;
//    }

    public AllUsers(String name, String email, String userImg, List<String> role) {
        this.username = name;
        this.email = email;
        this.userImg = userImg;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public List<String> getRole() {
        return role;
    }

    public void setRole(List<String> role) {
        this.role = role;
    }

}
