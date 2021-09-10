package com.esoft.smartstudentmanagement.helper;

import static com.esoft.smartstudentmanagement.helper.SharePreferenceKeyConstants.KEY_USER_EMAIL;
import static com.esoft.smartstudentmanagement.helper.SharePreferenceKeyConstants.KEY_USER_Img;
import static com.esoft.smartstudentmanagement.helper.SharePreferenceKeyConstants.KEY_USER_NAME;
import static com.esoft.smartstudentmanagement.helper.SharePreferenceKeyConstants.KEY_USER_Role;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

import com.esoft.smartstudentmanagement.model.AllUsers;

import java.util.Set;

public class SharedPrefManager {

    private static final String SHARED_PREF_NAME = "ssm_pref";
    @SuppressLint("StaticFieldLeak")
    private static SharedPrefManager mInstance;
    @SuppressLint("StaticFieldLeak")
    private static Context mCtx;

    private SharedPrefManager(Context context)
    {
        mCtx = context;
    }

    public static synchronized SharedPrefManager getInstance(Context context)
    {
        if (mInstance == null) {
            mInstance = new SharedPrefManager(context);
        }
        return mInstance;
    }

    //this method will checker whether user is already logged in or not
    public boolean isLoggedIn() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString(KEY_USER_EMAIL, null) != null;
    }

    public void userLogin(AllUsers user)
    {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
       editor.putString(KEY_USER_NAME, user.getUsername());
        editor.putString(KEY_USER_Img, (String) user.getUserImg());
        editor.putString(KEY_USER_EMAIL, user.getEmail());
        editor.putStringSet(KEY_USER_Role, (Set<String>) user.getRole());
        editor.apply();
    }
}
