package com.esoft.smartstudentmanagement.network;

import com.esoft.smartstudentmanagement.model.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface NetworkInterface {
    @Headers({"Content-Type:  application/x-www-form-urlencoded"})
    @FormUrlEncoded
    @POST("ws_app_login")
    Call<LoginResponse> postLogin(@Field("eml") String username, @Field("psd") String password);
    // Call<LoginResponse> postLogin(@Body LoginRequest loginRequest);
}
