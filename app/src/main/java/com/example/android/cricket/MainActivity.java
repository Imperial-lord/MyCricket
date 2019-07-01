package com.example.android.cricket;


import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.news.abhishek.newsapp.About_app;
import com.news.abhishek.newsapp.About_dev;
import com.news.abhishek.newsapp.Main3Activity;
import com.news.abhishek.newsapp.Main4Activity;
import com.news.abhishek.newsapp.Main5Activity;
import com.news.abhishek.newsapp.PointsTable;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout dl;
    private ActionBarDrawerToggle abdt;

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


        Button scorecard=(Button) findViewById(R.id.scorecards);

        scorecard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this, Main3Activity.class);
                startActivity(intent);


            }
        });


        Button favorite=(Button) findViewById(R.id.favoriteteam);

        favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this, Main4Activity.class);
                startActivity(intent);

            }
        });



        Button quizzing=(Button) findViewById(R.id.quizgame);

        quizzing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this, Main5Activity.class);
                startActivity(intent);

            }
        });


        dl=(DrawerLayout)findViewById(R.id.dl);
        abdt=new ActionBarDrawerToggle(this, dl,R.string.Open,R.string.Close);
        abdt.setDrawerIndicatorEnabled(true);

        dl.addDrawerListener(abdt);
        abdt.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final NavigationView nav_view=(NavigationView)findViewById(R.id.nav_view);

        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id= menuItem.getItemId();

                if(id==R.id.aboutapp)
                {
                    Intent intent=new Intent(MainActivity.this, About_app.class);
                    startActivity(intent);
                }

                if(id==R.id.aboutdevelopers)
                {
                    Intent intent=new Intent(MainActivity.this, About_dev.class);
                    startActivity(intent);
                }
                return true;
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return abdt.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }





}
