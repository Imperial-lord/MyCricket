package com.news.abhishek.newsapp;


import com.example.android.cricket.R;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Pageofoptions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pageofoptions);

        Bundle bundle=getIntent().getExtras();
        String user=bundle.getString("String_I_need");
        final String country=bundle.getString("Country_I_need");

        displayuser(user);
        displayteam(country);


        Button about=(Button)findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                Intent intent=new Intent(Pageofoptions.this, Webview.class);
                intent.putExtra("Country",country);
                startActivity(intent);
            }
        });


    }




    public void displayuser(String string)
    {
        TextView textView=(TextView) findViewById(R.id.name);
        textView.setText(string);
    }

    public void displayteam(String string)
    {
        TextView textView=(TextView)findViewById(R.id.team);
        textView.setText(string);
    }
}
