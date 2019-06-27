package com.example.android.cricket;


import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.news.abhishek.newsapp.Main3Activity;
import com.news.abhishek.newsapp.Main4Activity;
import com.news.abhishek.newsapp.Main5Activity;
import com.news.abhishek.newsapp.PointsTable;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.alan);
        mediaPlayer.start();


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

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mediaPlayer.release();
    }
}
