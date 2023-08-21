package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String selectedTopicName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout java = findViewById(R.id.javaLayout);
        final LinearLayout php = findViewById(R.id.phpLayout);
        final LinearLayout html = findViewById(R.id.htmlLayout);
        final LinearLayout python = findViewById(R.id.pythonLayout);

        final Button startBtn = findViewById(R.id.quizStartBtn);


        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName = "java";

                java.setBackgroundResource(R.drawable.round_black_stroke);
                php.setBackgroundResource(R.drawable.background_white);
                html.setBackgroundResource(R.drawable.background_white);
                python.setBackgroundResource(R.drawable.background_white);

            }
        });


        php.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName = "php";

                php.setBackgroundResource(R.drawable.round_black_stroke);

                java.setBackgroundResource(R.drawable.background_white);
                html.setBackgroundResource(R.drawable.background_white);
                python.setBackgroundResource(R.drawable.background_white);

            }
        });


        html.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName = "html";

                html.setBackgroundResource(R.drawable.round_black_stroke);

                php.setBackgroundResource(R.drawable.background_white);
                java.setBackgroundResource(R.drawable.background_white);
                python.setBackgroundResource(R.drawable.background_white);

            }
        });


        python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName = "python";

                python.setBackgroundResource(R.drawable.round_black_stroke);

                html.setBackgroundResource(R.drawable.background_white);
                php.setBackgroundResource(R.drawable.background_white);
                java.setBackgroundResource(R.drawable.background_white);
                html.setBackgroundResource(R.drawable.background_white);


            }
        });


        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectedTopicName.isEmpty()){

                    Toast.makeText(MainActivity.this, "Please select the Topic", Toast.LENGTH_SHORT).show();

                }else {
                    Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                    intent.putExtra("selectedTopic", selectedTopicName);
                    startActivity(intent);
                }
            }
        });


    }
}