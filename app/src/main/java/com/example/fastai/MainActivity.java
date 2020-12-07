package com.example.fastai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    CardView card1, card2, card3, card4, card5, card6 , card7, card8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card1 = findViewById(R.id.one);
        card2 = findViewById(R.id.two);
        card3 = findViewById(R.id.three);
        card4 = findViewById(R.id.four);
        card5 = findViewById(R.id.five);
        card6 = findViewById(R.id.six);
        card7 = findViewById(R.id.seven);
        card8 = findViewById(R.id.eight);

        Button viewbtn = findViewById(R.id.viewbtn);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this , ProductDetails.class);
                i.putExtra("item" , "one");
                startActivity(i);
            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this , ProductDetails.class);
                i.putExtra("item" , "two");
                startActivity(i);
            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this , ProductDetails.class);
                i.putExtra("item" , "three");
                startActivity(i);
            }
        });
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this , ProductDetails.class);
                i.putExtra("item" , "four");
                startActivity(i);
            }
        });

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this , ProductDetails.class);
                i.putExtra("item" , "five");
                startActivity(i);
            }
        });
        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this , ProductDetails.class);
                i.putExtra("item" , "six");
                startActivity(i);
            }
        });
        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this , ProductDetails.class);
                i.putExtra("item" , "seven");
                startActivity(i);
            }
        });
        card8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this , ProductDetails.class);
                i.putExtra("item" , "eight");
                startActivity(i);
            }
        });

        viewbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this , ViewCart.class));
            }
        });
    }
}