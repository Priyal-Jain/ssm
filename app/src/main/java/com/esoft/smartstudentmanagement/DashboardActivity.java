package com.esoft.smartstudentmanagement;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {
//
//    private WebView mWebView;
//    private String webUrl;
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        getIntentData();
//        setUp();
//        //setListners();
//    }
//    private void getIntentData() {
//        webUrl = getIntent().getStringExtra(IntentParams.PaymentsParams.WEB_URL);
//    }
//
//    @Override
//    protected void setUp() {
//        mWebView = findViewById(R.id.webview);
//        // Configure related browser settings
//
//        // mWebView.getSettings().setLoadsImagesAutomatically(true);
//        mWebView.getSettings().setLoadWithOverviewMode(true);
//        mWebView.getSettings().setUseWideViewPort(true);
//
//        mWebView.getSettings().setJavaScriptEnabled(true);
//
//        /*mWebView.getSettings().setAllowContentAccess(true);
//        mWebView.setScrollbarFadingEnabled(false);*/
//
//        mWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
//
//        mWebView.getSettings().setAllowFileAccess(true);
//        mWebView.getSettings().setAllowContentAccess(true);
//        mWebView.setScrollbarFadingEnabled(false);
//
//        mWebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
//        // Configure the client to use when opening URLs
//        mWebView.setWebViewClient(WebViewClientClass());
//
//       /* if (Build.VERSION.SDK_INT >= 21) {
//            mWebView.getSettings().setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
//        }*/
//
//        // Load the initial URL
//        mWebView.loadUrl(webUrl);
//    }
//
//    private WebViewClient WebViewClientClass() {
//        WebViewClient webViewClient = new WebViewClient() {
//            ProgressDialog progressDialog = new ProgressDialog(DashboardActivity.this);
//
//            @Override
//            public boolean shouldOverrideUrlLoading(WebView view, String url) {
//
//                if (!url.equals(webUrl)) {
//                    view.loadUrl(url);
//                    return true;
//                } else {
//                    view.loadUrl(url);
//                    return true;
//                }
//
//            }
//
//            @Override
//            public void onPageStarted(WebView view, String url, Bitmap favicon) {
//                super.onPageStarted(view, url, favicon);
//                if (!isFinishing()) {
//                    progressDialog.setTitle("Loading...");
//                    progressDialog.setMessage("Please wait...");
//                    progressDialog.setCancelable(false);
//                    progressDialog.show();
//                }
//            }
//
//            @Override
//            public void onPageCommitVisible(WebView view, String url) {
//                super.onPageCommitVisible(view, url);
//                if (progressDialog != null) {
//                    progressDialog.dismiss();
//
//                    if (url.contains("Status=S")) {
//                        callActivitiFinish("Payment Successful", "success");
//                    } else if (url.contains("Status=F")) {
//                        callActivitiFinish("Payment failed", "fail");
//                    }
//
//                }
//            }
//
//        };
//        return webViewClient;
//    }
//
//    private void callActivitiFinish(String paymentMsg, String paymentStatus) {
//        showToast(paymentMsg);
//
//        Intent resultIntent = new Intent();
//        resultIntent.putExtra(IntentParams.PaymentsParams.PAY_RETURN_URL, paymentStatus);
//        setResult(RESULT_OK, resultIntent);
//        finish();
//
//    }
//
//    @Override
//    public void openActivityOnTokenExpire() {
//
//    }
//
//    @Override
//    public void onError(int resId, String message) {
//
   }
}
