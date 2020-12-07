package com.example.fastai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ViewCart extends AppCompatActivity {

    CardView card1, card2, card3, card4, card5, card6 , card7, card8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_cart);

        card1 = findViewById(R.id.one);
        card2 = findViewById(R.id.two);
        card3 = findViewById(R.id.three);
        card4 = findViewById(R.id.four);
        card5 = findViewById(R.id.five);
        card6 = findViewById(R.id.six);
        card7 = findViewById(R.id.seven);
        card8 = findViewById(R.id.eight);

        TextView textView = findViewById(R.id.noitem);

        if(SharedPref.getOne()!= null && SharedPref.getTwo() != null && SharedPref.getThree() != null &&
                SharedPref.getFour()!= null && SharedPref.getFive() != null && SharedPref.getSix() != null &&
                SharedPref.getSeven()!= null && SharedPref.getEight() != null) {

            if (SharedPref.getOne().matches("yes") || SharedPref.getTwo().matches("yes") || SharedPref.getThree().matches("yes") || SharedPref.getFour().matches("yes") ||
                    SharedPref.getFive().matches("yes") || SharedPref.getSix().matches("yes") || SharedPref.getSeven().matches("yes") || SharedPref.getEight().matches("yes")) {
                textView.setVisibility(View.GONE);
                if (SharedPref.getOne().matches("yes")) {
                    card1.setVisibility(View.VISIBLE);
                }
                if (SharedPref.getTwo().matches("yes")) {
                    card2.setVisibility(View.VISIBLE);
                }
                if (SharedPref.getThree().matches("yes")) {
                    card3.setVisibility(View.VISIBLE);
                }
                if (SharedPref.getFour().matches("yes")) {
                    card4.setVisibility(View.VISIBLE);
                }
                if (SharedPref.getFive().matches("yes")) {
                    card5.setVisibility(View.VISIBLE);
                }
                if (SharedPref.getSix().matches("yes")) {
                    card6.setVisibility(View.VISIBLE);
                }
                if (SharedPref.getSeven().matches("yes")) {
                    card7.setVisibility(View.VISIBLE);
                }
                if (SharedPref.getEight().matches("yes")) {
                    card8.setVisibility(View.VISIBLE);
                }
            }
            else {
                textView.setVisibility(View.VISIBLE);
            }
        }
        else {
            textView.setVisibility(View.VISIBLE);
        }
    }
}