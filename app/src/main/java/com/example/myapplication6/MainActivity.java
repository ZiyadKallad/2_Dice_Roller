package com.example.myapplication6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewdice1;
    private ImageView imageViewdice2;
    private Button buttondice;
    private Random myrandom_number1 = new Random();
    private Random myrandom_number2 = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

          imageViewdice1 = findViewById(R.id.imageView1);
          imageViewdice2 = findViewById(R.id.imageView2);
          buttondice = findViewById(R.id.button);

        buttondice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollOurDice();
            }
        });
    }

    private void rollOurDice(){
        int myrandom1 = myrandom_number1.nextInt(6)+1;
        int myrandom2 = myrandom_number2.nextInt(6)+1;

        switch (myrandom1){
            case 1:
                imageViewdice1.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewdice1.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewdice1.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewdice1.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewdice1.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewdice1.setImageResource(R.drawable.dice6);
                break;


        }

        switch (myrandom2) {
            case 1:
                imageViewdice2.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewdice2.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewdice2.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewdice2.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewdice2.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewdice2.setImageResource(R.drawable.dice6);
                break;
        }

    }
}
