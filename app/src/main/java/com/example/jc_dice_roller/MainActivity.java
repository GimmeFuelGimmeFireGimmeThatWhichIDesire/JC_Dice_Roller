package com.example.jc_dice_roller;

import java.util.Random;
import androidx.appcompat.app.AppCompatActivity;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private TextView textViewMiss;
    private TextView textViewHit;
    private Random rng = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice();
            }
        });
        textViewMiss = findViewById(R.id.textViewCriticalMiss);
        textViewMiss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice();
            }
        });
        textViewHit = findViewById(R.id.textViewCriticalHit);
        textViewHit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice();
            }
        });



    }


    private void rollDice() {
        int randomNumber = rng.nextInt(20) + 1;
        final MediaPlayer rollSoundMP = MediaPlayer.create(this, R.raw.rollingdice);
        rollSoundMP.start();
        switch (randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.usa1);
                textViewMiss.setText("Critical Miss!");
                textViewHit.setText(" ");
                final MediaPlayer missSoundMP = MediaPlayer.create(this, R.raw.bummer);
                missSoundMP.start();
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.usa2);
                textViewMiss.setText(" ");
                textViewHit.setText(" ");
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.usa3);
                textViewMiss.setText(" ");
                textViewHit.setText(" ");
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.usa4);
                textViewMiss.setText(" ");
                textViewHit.setText(" ");
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.usa5);
                textViewMiss.setText(" ");
                textViewHit.setText(" ");
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.usa6);
                textViewMiss.setText(" ");
                textViewHit.setText(" ");
                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.usa7);
                textViewMiss.setText(" ");
                textViewHit.setText(" ");
                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.usa8);
                textViewMiss.setText(" ");
                textViewHit.setText(" ");
                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.usa9);
                textViewMiss.setText(" ");
                textViewHit.setText(" ");
                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.usa10);
                textViewMiss.setText(" ");
                textViewHit.setText(" ");
                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.usa11);
                textViewMiss.setText(" ");
                textViewHit.setText(" ");
                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.usa12);
                textViewMiss.setText(" ");
                textViewHit.setText(" ");
                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.usa13);
                textViewMiss.setText(" ");
                textViewHit.setText(" ");
                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.usa14);
                textViewMiss.setText(" ");
                textViewHit.setText(" ");
                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.usa15);
                textViewMiss.setText(" ");
                textViewHit.setText(" ");
                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.usa16);
                textViewMiss.setText(" ");
                textViewHit.setText(" ");
                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.usa17);
                textViewMiss.setText(" ");
                textViewHit.setText(" ");
                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.usa18);
                textViewMiss.setText(" ");
                textViewHit.setText(" ");
                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.usa19);
                textViewMiss.setText(" ");
                textViewHit.setText(" ");
                break;
            case 20:
                imageViewDice.setImageResource(R.drawable.usa20);
                textViewMiss.setText(" ");
                textViewHit.setText("Critical Hit!");
                final MediaPlayer hitSoundMP = MediaPlayer.create(this, R.raw.bell);
                hitSoundMP.start();
                break;

        }
    }
}