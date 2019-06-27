package com.news.abhishek.newsapp;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.android.cricket.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main3Activity extends AppCompatActivity {

    private WebView mywebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);



        Calendar c = Calendar.getInstance();

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = df.format(c.getTime());

        String date=formattedDate.substring(8,10);
        String month=formattedDate.substring(5,7);

        int date1=Integer.parseInt(date);
        int month1=Integer.parseInt(month);

        int val=8221;

        if(month1==6)
        {

            if(date1==30)
                val++;

            val=val+(date1-23);


        }

        else if(month1==7)
        {
            val=val+8+(date1);

            if(date1>=6)
                val++;

            if(date1==9)
                val=val-2;

            if(date1==11)
                val=val-3;

            if(date1==14)
                val=val-5;
        }

        mywebView=(WebView) findViewById(R.id.webView);

        WebSettings webSettings=mywebView.getSettings();

        webSettings.setJavaScriptEnabled(true);

        mywebView.loadUrl("https://www.icc-cricket.com/match/"+val+"#overview");
        mywebView.setWebViewClient(new WebViewClient());



        mywebView.setWebViewClient(new WebViewClient() {
            //if app crash on before lolipop check this
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request)
            {
                if (Uri.parse("https://www.icc-cricket.com/match/8221#scorecard").getHost().equals("https://www.icc-cricket.com/match/8221#scorecard")) {
                    // This is my web site, so do not override; let my WebView load the page
                    return false;
                }

                // reject anything other
                return true;
            }
        });

    }

    @Override
    public void onBackPressed() {

        if(mywebView.canGoBack())
        {
            mywebView.goBack();
        }

        else {
            super.onBackPressed();
        }
    }
}
