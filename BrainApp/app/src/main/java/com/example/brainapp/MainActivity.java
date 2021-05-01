package com.example.brainapp;

import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button goButton;
    ArrayList<Integer> answers = new ArrayList<Integer>();
    int locationOfCorrectAnswer;
    TextView result;
    int score = 0;
    int numberOfQuestions = 0;
    TextView scoreText;
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    TextView sumTextView;
    TextView timerText;
    Button restart;
    ConstraintLayout gameLayout;

    public void start(View view) {
        goButton.setVisibility(View.INVISIBLE);
        gameLayout.setVisibility(View.VISIBLE);
        restart(findViewById(R.id.timerText));
    }

    public void choseAnswer(View view) {

        if (Integer.toString(locationOfCorrectAnswer).equals(view.getTag().toString())) {
            result.setText("Correct :)");
            score++;
        } else {
            result.setText("Wrong :(");
        }
        numberOfQuestions++;
        scoreText.setText(Integer.toString(score) + "/" + Integer.toString(numberOfQuestions));
        newQuestion();
    }

    public void newQuestion() {
        Random random = new Random();

        int a = random.nextInt(31); //random ide od 0 do 31
        int b = random.nextInt(31);

        sumTextView.setText(Integer.toString(a) + " + " + Integer.toString(b)); //brojevi na labeli

        locationOfCorrectAnswer = random.nextInt(4); //1 od 4 dugmeta ima tacan odg

        answers.clear();

        for (int i = 0; i < 4; i++) {
            if (i == locationOfCorrectAnswer) { //proverava koje dugme ima tacan odg
                answers.add(a + b);
            } else {

                int wrongAnswer = random.nextInt(51); //ukoliko jos jedno dugme ima tacan odg, kroz while petlju pravi novi odg
                while (wrongAnswer == a + b) {
                    wrongAnswer = random.nextInt(51);
                }
                answers.add(wrongAnswer);
            }

        }
        button0.setText(Integer.toString(answers.get(0))); //na svako drugme postavlja po jedan broj iz niza
        button1.setText(Integer.toString(answers.get(1)));
        button2.setText(Integer.toString(answers.get(2)));
        button3.setText(Integer.toString(answers.get(3)));
    }

    public void restart(View view) {
        score = 0;
        numberOfQuestions = 0;
        timerText.setText("30s");

        scoreText.setText(Integer.toString(score) + "/" + Integer.toString(numberOfQuestions));
        newQuestion();
        restart.setVisibility(View.INVISIBLE);
        result.setText("");

        new CountDownTimer(30100, 1000) {

            @Override
            public void onTick(long l) {

                timerText.setText(String.valueOf(l / 1000) + "s");
            }

            @Override
            public void onFinish() {
                result.setText("Done!");
                restart.setVisibility(View.VISIBLE);
            }
        }.start();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sumTextView = findViewById(R.id.sumText);

        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        result = findViewById(R.id.resultText);
        goButton = findViewById(R.id.goButton);
        goButton.setVisibility(View.VISIBLE);
        scoreText = findViewById(R.id.scoreText);

        timerText = findViewById(R.id.timerText);

        restart = findViewById(R.id.restart);

        gameLayout = findViewById(R.id.gameLayout);
        gameLayout.setVisibility(View.INVISIBLE);


    }
}