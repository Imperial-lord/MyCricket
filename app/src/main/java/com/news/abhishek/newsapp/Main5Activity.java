package com.news.abhishek.newsapp;


import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import com.example.android.cricket.R;

public class Main5Activity extends AppCompatActivity {

    int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }

    public void intentfunc(View view)
    {

        Intent intent=new Intent(Main5Activity.this,Question1.class);
        intent.putExtra("Score",score);
        startActivity(intent);




    }
}

