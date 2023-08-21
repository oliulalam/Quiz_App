package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class QuizResults extends AppCompatActivity {

    ImageView congratulationsIcon;
    TextView successText, correctAnswers, inCorrectAnswers;

    AppCompatButton startNewQuizBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_results);

        congratulationsIcon = findViewById(R.id.congratulationsIcon);
        successText = findViewById(R.id.successText);
        correctAnswers = findViewById(R.id.correctAnswers);
        inCorrectAnswers = findViewById(R.id.inCorrectAnswers);
        startNewQuizBtn = findViewById(R.id.startNewQuizBtn);


        final int getCorrectAnswers = getIntent().getIntExtra("correct", 0);
        final int getInCorrectAnswers = getIntent().getIntExtra("incorrect", 0);

        correctAnswers.setText(String.valueOf(getCorrectAnswers));
        inCorrectAnswers.setText(String.valueOf(getInCorrectAnswers));


        startNewQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(QuizResults.this, MainActivity.class));
                finish();

            }
        });



    }
}