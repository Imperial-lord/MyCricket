package com.news.abhishek.newsapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.cricket.R;

public class ScoreDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_display);


        Bundle bundle=getIntent().getExtras();
        final int score=bundle.getInt("Score");

        String message;
        ImageView imageView=(ImageView)findViewById(R.id.finalimage);


        if(score==25)
        {
            message="You just nailed it..... Awesome work!";
            imageView.setImageResource(R.drawable.congrats);
        }

        else if (score<25 && score>0)
        {
            message="Good work! But you could have done better...";
            imageView.setImageResource(R.drawable.welldone);
        }

        else
        {
            message="Oops! Don't be anrgy or sad! Give it another try...";
            imageView.setImageResource(R.drawable.betterluck);
        }

        String score1= Integer.toString(score);
        displayscore(score1);
        displaymessage(message);



    }


    public void displayscore(String string)
    {
        TextView textView=(TextView) findViewById(R.id.score);
        textView.setText(string);
    }

    public void displaymessage(String string)
    {
        TextView textView=(TextView)findViewById(R.id.message);
        textView.setText(string);
    }

    public void intentanswer(View view)
    {
        Intent intent=new Intent(ScoreDisplay.this, Main6Activity.class);
        startActivity(intent);
    }
}
