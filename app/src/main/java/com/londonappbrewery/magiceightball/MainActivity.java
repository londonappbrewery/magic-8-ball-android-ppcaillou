package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button answerButton = (Button) findViewById(R.id.answerButton);

        final  ImageView image_ball = (ImageView) findViewById(R.id.image_ball);

        final int [] magicBallsArray ={
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        answerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumberGenerator = new Random();
                int answer_number = randomNumberGenerator.nextInt(5);

                Log.d("Balls", "The random ball number is " + answer_number);

                image_ball.setImageResource(magicBallsArray[answer_number]);

            }
        });
    }
}
