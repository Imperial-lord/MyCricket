package com.example.android.cricket;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.news.abhishek.newsapp.PointsTable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button=(Button) findViewById(R.id.fixtures);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, FixturesActivity.class);
                startActivity(intent);
            }
        });



        Button news=(Button) findViewById(R.id.news);

        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);


            }
        });


        Button points=(Button) findViewById(R.id.pts);

        points.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this, PointsTable.class);
                startActivity(intent);


            }
        });



    }
}
