package com.example.destinywalcott.destinysflashcards;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        findViewById(R.id.question).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Do something here
//                findViewById(R.id.answer).setVisibility(View.VISIBLE);
//                findViewById(R.id.question).setVisibility(View.INVISIBLE);
//
//            }
//        });
//
//        findViewById(R.id.answer).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Do something here
//                findViewById(R.id.question).setVisibility(View.VISIBLE);
//                findViewById(R.id.answer).setVisibility(View.INVISIBLE);
//
//            }
//        });

        findViewById(R.id.first_answer_choice).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.first_answer_choice).setBackgroundColor(getResources().getColor(R.color.Red, null));

            }
        });

        findViewById(R.id.second_answer_choice).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.second_answer_choice).setBackgroundColor(getResources().getColor(R.color.Red, null));

            }
        });

        findViewById(R.id.third_answer_choice).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.third_answer_choice).setBackgroundColor(getResources().getColor(R.color.Green, null));

            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.first_answer_choice).setBackgroundColor(getResources().getColor(R.color.Tan));
                findViewById(R.id.second_answer_choice).setBackgroundColor(getResources().getColor(R.color.Tan));
                findViewById(R.id.third_answer_choice).setBackgroundColor(getResources().getColor(R.color.Tan));
            }
        });

        findViewById(R.id.toggle_choices_visibility).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((ImageView) findViewById(R.id.toggle_choices_visibility)).setImageResource(R.drawable.show_icon);
                findViewById(R.id.first_answer_choice).setVisibility(View.VISIBLE);
                findViewById(R.id.second_answer_choice).setVisibility(View.VISIBLE);
                findViewById(R.id.third_answer_choice).setVisibility(View.VISIBLE);
                }
        });

    }
}
