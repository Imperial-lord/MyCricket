package com.news.abhishek.newsapp;


import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.android.cricket.R;

public class Question1 extends AppCompatActivity {

    private RadioGroup radioSexGroup;
    private RadioButton radioSexButton;
    private Button btnDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        Bundle bundle=getIntent().getExtras();
        final int score=bundle.getInt("Score");

        addListenerOnButton(score);
    }

    public void addListenerOnButton(final int score) {

        radioSexGroup = (RadioGroup) findViewById(R.id.optgroup);
        btnDisplay = (Button) findViewById(R.id.btnDisplay);

        btnDisplay.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // get selected radio button from radioGroup
                int selectedId = radioSexGroup.getCheckedRadioButtonId();
                int score1=score;

                if(selectedId==R.id.opt3)
                {
                    score1=score+5;
                }

                Intent intent=new Intent(Question1.this, Question2.class);
                intent.putExtra("Score",score1);
                startActivity(intent);


            }

        });

    }






}
