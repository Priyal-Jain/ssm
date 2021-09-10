package com.esoft.smartstudentmanagement.base;

import static android.content.ContentValues.TAG;
import static com.esoft.smartstudentmanagement.Util.Utils.log;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.esoft.smartstudentmanagement.R;
import com.esoft.smartstudentmanagement.Util.LogFactory;
import com.esoft.smartstudentmanagement.model.AllUsers;
import com.esoft.smartstudentmanagement.model.LoginResponse;
import com.esoft.smartstudentmanagement.network.NetworkClient;
import com.esoft.smartstudentmanagement.network.NetworkInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public abstract class BaseAppCompatActivity extends AppCompatActivity {

    private final SparseArray<Long> viewClickTimeStampSparseArray = new SparseArray<>();
    private NetworkInterface mNetworkInterface;

    private View mTouchOutsideView; // view object for outside touch
    private OnTouchOutsideViewListener mOnTouchOutsideViewListener; // listener

    @SuppressLint({"ObsoleteSdkInt", "InflateParams"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_layout);
        LayoutInflater inflater = LayoutInflater.from(this);
        inflater.inflate(R.layout.activity_base_layout, null);
        mNetworkInterface = NetworkClient.getClient().create(NetworkInterface.class);

        //Setting theme in recent tasks
        ActivityManager.TaskDescription taskDesc;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            taskDesc = new ActivityManager.TaskDescription(getString(R.string.app_name), null, getResources().getColor(R.color.colorPrimary));
            setTaskDescription(taskDesc);
        }
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    /**
     * onOutsideTouchListener : listen touch outside of view
     */
    protected OnTouchOutsideViewListener onOutsideTouchListener = new OnTouchOutsideViewListener() {
        @Override
        public void onTouchOutside(View view, MotionEvent event) {
            view.setVisibility(View.GONE);
        }
    };
    /**
     * Interface definition for a callback to be invoked when a touch event has occurred outside a formerly specified
     * view. See {@link #setOnTouchOutsideViewListener(View, OnTouchOutsideViewListener).}
     */
    public interface OnTouchOutsideViewListener {
        /**
         * Called when a touch event has occurred outside a given view.
         *
         * @param view  The view that has not been touched.
         * @param event The MotionEvent object containing full information about the event.
         */
        void onTouchOutside(View view, MotionEvent event);
    }
    /**
     * Sets a listener that is being notified when the user has tapped outside a given view. To remove the listener,
     * <p/>
     * This is useful in scenarios where a view is in edit mode and when the user taps outside the edit mode shall be
     * stopped.
     *
     * @param view                       : view
     * @param onTouchOutsideViewListener : listener
     */
    protected void setOnTouchOutsideViewListener(View view, OnTouchOutsideViewListener onTouchOutsideViewListener) {
        mTouchOutsideView = view;
        mOnTouchOutsideViewListener = onTouchOutsideViewListener;
    }

    @Override
    public boolean dispatchTouchEvent(final MotionEvent ev) {
        if (ev.getAction() == MotionEvent.ACTION_DOWN) {
            // Notify touch outside listener if user tapped outside a given view
            if (mOnTouchOutsideViewListener != null && mTouchOutsideView != null
                    && mTouchOutsideView.getVisibility() == View.VISIBLE) {
                Rect viewRect = new Rect();
                mTouchOutsideView.getGlobalVisibleRect(viewRect);
                if (!viewRect.contains((int) ev.getRawX(), (int) ev.getRawY())) {
                    mOnTouchOutsideViewListener.onTouchOutside(mTouchOutsideView, ev);
                }
            }
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public void overridePendingTransition(int enterAnim, int exitAnim) {
        if (shouldOverrideActivityTransition()) {
            super.overridePendingTransition(enterAnim, exitAnim);
        }
    }

    public boolean shouldOverrideActivityTransition() {
        return true;
    }


    /**
     * Preventing multiple clicks. (validate within 1000 millis)
     *
     * @param view need to prevent multiple clicks on.
     */
    protected boolean isTooEarlyMultipleClicks(@NonNull View view) {
        return isTooEarlyMultipleClicks(view, 1000); //default 1 sec
    }
    /**
     * Preventing multiple clicks.
     *
     * @param view        need to prevent multiple clicks on.
     * @param delayMillis millis delta to validate multiple click events
     */
    protected boolean isTooEarlyMultipleClicks(@NonNull View view, int delayMillis) {
        long lastClickTime = viewClickTimeStampSparseArray.get(view.getId(), 0L);
        long timeStamp = System.currentTimeMillis();
        if (lastClickTime + delayMillis > timeStamp) {
            log.debug("View clicked too early" + view);
            return true;
        }
        viewClickTimeStampSparseArray.put(view.getId(), timeStamp);
        return false;
    }

    //public Call<LoginResponse> postLoginData(LoginRequest loginRequest) {
    public Call<LoginResponse> postLoginData(String loginID, String password) {
        LogFactory.Log.debug("Priyal on_postLoginData called........loginID - "+loginID +"...password..."+password);
        Call<LoginResponse> postRegistrationCall = mNetworkInterface.postLogin(loginID, password);
        //Call<LoginResponse> postRegistrationCall = mNetworkInterface.postLogin(loginRequest);
        postRegistrationCall.enqueue(new Callback<LoginResponse>() {

            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                try {
                    if (response.body() != null) {
                        log.debug("Priyal get response body status......" + response.body().getErrorCode());

                        List<AllUsers> users = response.body().getAllUsersList();
                        log.debug(TAG, "Priyal Number of users received: " + users.size() + users.get(0));

                        // if (response.body().getStatus() != null && response.body().getStatus().equals("1")) {
                       // Integer status = Integer.valueOf(response.body().getErrorCode());
//                        if (status.equals("0")){
                           // log.debug("Priyal get response body status......" + status + "..."+status.equals("0") );
                       // if (response.body().getErrorCode() == "0") {
                           onResponseListener(response.body());
//                        } else {
//                            Toast.makeText(BaseAppCompatActivity.this, "Invalid login ID or Password", Toast.LENGTH_SHORT).show();
//                        }
                    }
                } catch (Exception e) {
                    log.debug("Priyal get error msg......" +  e.getMessage());
                    e.printStackTrace();

                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                onErrorListener(t.toString());
            }
        });

        return postRegistrationCall;
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_enter_from_left, R.anim.anim_exit_to_right);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        overridePendingTransition(R.anim.anim_enter_from_left, R.anim.anim_exit_to_right);
    }

    public abstract void onResponseListener(Object responseModel);

    public abstract void onErrorListener(String error);


}
