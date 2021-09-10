package com.esoft.smartstudentmanagement.model;

import static com.esoft.smartstudentmanagement.Util.Utils.log;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LoginResponse {
    @SerializedName("error_code")
    @Expose
    private String errorCode;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("all_users_list")
    @Expose
    private List<AllUsers> allUsersList = null;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<AllUsers> getAllUsersList() {
        return allUsersList;
    }

    public void setAllUsersList(List<AllUsers> allUsersList) {
        this.allUsersList = allUsersList;
    }

}