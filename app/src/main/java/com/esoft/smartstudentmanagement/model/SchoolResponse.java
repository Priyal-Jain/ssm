package com.esoft.smartstudentmanagement.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SchoolResponse {
    @SerializedName("error_code")
    @Expose
    private String errorCode;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("school_list")
    @Expose
    private List<School> schoolList = null;

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

    public List<School> getSchoolList() {
        return schoolList;
    }

    public void setSchoolList(List<School> schoolList) {
        this.schoolList = schoolList;
    }

}
