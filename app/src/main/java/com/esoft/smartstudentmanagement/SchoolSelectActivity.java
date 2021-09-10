package com.esoft.smartstudentmanagement;

import static com.esoft.smartstudentmanagement.Util.Utils.log;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.esoft.smartstudentmanagement.Util.LogFactory;
import com.esoft.smartstudentmanagement.base.BaseAppCompatActivity;
import com.esoft.smartstudentmanagement.helper.AlertDialogManager;
import com.esoft.smartstudentmanagement.model.AllUsers;
import com.esoft.smartstudentmanagement.model.LoginResponse;
import com.esoft.smartstudentmanagement.network.NetworkCheck;
import com.google.android.material.button.MaterialButton;

import java.util.List;

public class SchoolSelectActivity extends BaseAppCompatActivity {

    private static final LogFactory.Log Log = LogFactory.getLog(LoginActivity.class);

    MaterialButton schoolButton;

    // Alert Dialog Manager
    AlertDialogManager alert = new AlertDialogManager();

    SharedPreferences sharedpreferences;
    public static final String SHARED_PREF_NAME = "ssm_pref";

    NetworkCheck networkCheck;
    Boolean isInternetPresent = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try{
            getActionBar().hide();
        }catch(Exception e){
            e.printStackTrace();
        }
        networkCheck = new NetworkCheck();
        isInternetPresent = networkCheck.isNetworkAvailable(this);
        if (isInternetPresent) {
            setContentView(R.layout.activity_select_school);

            schoolButton = findViewById(R.id.schoolButton);

            sharedpreferences = getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);

            schoolButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.verbose("onLoginButtonClicked");
                    // postLoginData(editTextUserName.getText().toString(), editTextPassword.getText().toString());

                }

            });
        } else {
            alert.showAlertDialog(SchoolSelectActivity.this, "Connection failed..", "Please Check Your Internet Connectivity", false);
        }
    }

    @Override
    public void onBackPressed() {
        finishAffinity();
    }

    @Override
    public void onResponseListener(Object responseModel) {

        if (responseModel != null) {
            LoginResponse loginResponse = (LoginResponse) responseModel;
            if (loginResponse != null && loginResponse.getAllUsersList() != null)
            {
                log.debug("Priyal Login onResponseListener......" );

                String msg = loginResponse.getMessage();
                log.debug("Priyal Login onResponseListener...msg..." + msg);

                List<AllUsers> data = loginResponse.getAllUsersList();
                log.debug("Priyal Login onResponseListener......data......" + data);





                //storing the user in shared preferences
                //SharedPrefManager.getInstance(getApplicationContext()).userLogin(data);
                // log.debug("Priyal Login onResponseListener......storing userLogin(data)......" +  SharedPrefManager.getInstance(getApplicationContext()).getData().getGender());


                //SharedPrefManager.getInstance(getApplicationContext()).setAccessToken(authToken);
                // log.debug("Priyal Login onResponseListener......storing AccessToken......" +  SharedPrefManager.getInstance(getApplicationContext()).getAccessToken());

                startActivity(new Intent(SchoolSelectActivity.this, BranchSelectActivity.class));
            }
        }
    }

    @Override
    public void onErrorListener(String error) {
        Toast.makeText(this, "onErrorListener : " + error, Toast.LENGTH_SHORT).show();
    }


}