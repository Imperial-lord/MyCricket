package com.news.abhishek.newsapp;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.android.cricket.R;

import java.util.List;

public class QuizAdapter extends RecyclerView.Adapter<QuizAdapter.QuizViewHolder>
{

    private Context mCtx;
    private List<Quiz> quizlist;

    public QuizAdapter(Context mCtx, List<Quiz> quizlist) {
        this.mCtx = mCtx;
        this.quizlist = quizlist;
    }

    @NonNull
    @Override
    public QuizViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(mCtx);
        View view= (View) inflater.inflate(R.layout.cardview_layout, null);
        QuizViewHolder holder= new QuizViewHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull QuizViewHolder holder, int position) {
        Quiz quiz= quizlist.get(position);

        holder.ques.setText(quiz.getQues());
        holder.answer.setText(quiz.getOption1());
        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(quiz.getImage()));
    }

    @Override
    public int getItemCount() {
        return quizlist.size();
    }

    class QuizViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imageView;
        TextView ques,answer,option2,option3,option4;

        public QuizViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.image);
            ques=itemView.findViewById(R.id.question);
            answer=itemView.findViewById(R.id.answer);


        }
    }
}
