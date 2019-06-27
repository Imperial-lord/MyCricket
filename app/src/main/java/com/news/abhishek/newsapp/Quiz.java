package com.news.abhishek.newsapp;

public class Quiz
{
    private int image;
    private String ques,answer;

    public Quiz(int image, String ques, String answer) {
        this.image = image;
        this.ques = ques;
        this.answer = answer;
    }


    public int getImage() {
        return image;
    }

    public String getQues() {
        return ques;
    }

    public String getOption1() {
        return answer;
    }
}
