package com.news.abhishek.newsapp;

import java.util.Random;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;


import com.example.android.cricket.R;

import java.util.ArrayList;
import java.util.List;

public class Main6Activity extends AppCompatActivity {


    RecyclerView recyclerView;
    QuizAdapter adapter;
    Random random = new Random();


    private RadioGroup radioSexGroup;
    private RadioButton radioSexButton;
    private Button btnDisplay;


    List<Quiz> quizlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);


        quizlist = new ArrayList<>();
        recyclerView = (RecyclerView) findViewById(R.id.recycle);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        quizlist.add(
                new Quiz(
                        R.drawable.wc1983,
                        "How many runs did India make in its historic World Cup win over West Indies in 1983?",
                        "183"
                ));


        quizlist.add(
                new Quiz(
                        R.drawable.image1,
                        "Which country won the first two World Cups held in England in 1975 and 1979?",
                        "West Indies"
                ));



        quizlist.add(
                new Quiz(
                        R.drawable.image2,
                        "Which cricket team has won most ICC Cricket World Cup titles?",
                        "Australia"
                ));


        quizlist.add(
                new Quiz(
                        R.drawable.image3,
                        "Which of the following Indian player have got first “Man of the Tournament” Award in the ICC Cricket World Cup?",
                        "Sachin Tendulkar"));




        quizlist.add(
                new Quiz(
                        R.drawable.image5,
                        "Which Indian cricketer had won the “Man of the Match” award in the final of the ICC World Cup 1983? ",
                        "Mohinder Amarnath"));


        adapter = new QuizAdapter(this, quizlist);
        recyclerView.setAdapter(adapter);
    }











}

