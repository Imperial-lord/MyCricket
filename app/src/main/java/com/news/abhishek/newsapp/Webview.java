package com.news.abhishek.newsapp;

import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.android.cricket.R;

public class Webview extends AppCompatActivity
{
    private WebView mywebView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        Bundle bundle=getIntent().getExtras();
        String country = bundle.getString("Country");
        String url;

        switch(country)
        {
            case "India" :
            {
                url="https://www.cricketworldcup.com/teams/india";
                break;
            }

            case "Afghanistan" :
            {
                url="https://www.cricketworldcup.com/teams/afghanistan";
                break;
            }

            case "Australia" :
            {
                url="https://www.cricketworldcup.com/teams/australia";
                break;
            }

            case "South Africa" :
            {
                url="https://www.cricketworldcup.com/teams/south-africa";
                break;
            }

            case "New Zealand" :
            {
                url="https://www.cricketworldcup.com/teams/new-zealand";
                break;
            }

            case "Sri Lanka" :
            {
                url="https://www.cricketworldcup.com/teams/sri-lanka";
                break;
            }

            case "West Indies" :
            {
                url="https://www.cricketworldcup.com/teams/west-indies";
                break;
            }

            case "Pakistan" :
            {
                url="https://www.cricketworldcup.com/teams/pakistan";
                break;
            }

            case "England" :
            {
                url="https://www.cricketworldcup.com/teams/england";
                break;
            }

            case "Bangladesh" :
            {
                url="https://www.cricketworldcup.com/teams/bangladesh";
                break;
            }

            default:
            {
                url="https://www.cricketworldcup.com/";
            }

        }

        final String url1=url;

        mywebView=(WebView) findViewById(R.id.webView);
        WebSettings webSettings=mywebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        mywebView.loadUrl(url);
        mywebView.setWebViewClient(new WebViewClient());


        mywebView.setWebViewClient(new WebViewClient() {
            //if app crash on before lolipop check this
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request)
            {
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

