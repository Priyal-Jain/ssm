package com.esoft.smartstudentmanagement.model;

import com.google.gson.annotations.SerializedName;

public class LoginRequest {
    @SerializedName("eml")
    private String eml;
    @SerializedName("psd")
    private String psd;

    public LoginRequest(String eml, String psd) {
        this.eml = eml;
        this.psd = psd;
    }

    public String getUsername()
    {
        return eml;
    }

    public void setUsername(String eml)
    {
        this.eml = eml;
    }

    public String getPassword()
    {
        return psd;
    }

    public void setPassword(String psd)
    {
        this.psd = psd;
    }
}
