package com.esoft.smartstudentmanagement;

import static com.esoft.smartstudentmanagement.Util.Utils.log;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
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

public class RoleActivity extends BaseAppCompatActivity {

    private static final LogFactory.Log Log = LogFactory.getLog(LoginActivity.class);

    MaterialButton roleButton;

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
            setContentView(R.layout.activity_role);

            roleButton = findViewById(R.id.roleButton);

            sharedpreferences = getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);

            roleButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.verbose("onLoginButtonClicked");
                   // postLoginData(editTextUserName.getText().toString(), editTextPassword.getText().toString());

        }

});
        } else {
        alert.showAlertDialog(RoleActivity.this, "Connection failed..", "Please Check Your Internet Connectivity", false);
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

                startActivity(new Intent(RoleActivity.this, SchoolSelectActivity.class));
            }
        }
    }

    @Override
    public void onErrorListener(String error) {
        Toast.makeText(this, "onErrorListener : " + error, Toast.LENGTH_SHORT).show();
    }

}