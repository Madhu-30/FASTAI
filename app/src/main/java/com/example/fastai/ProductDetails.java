package com.example.fastai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ProductDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        Button addbtn = findViewById(R.id.addbtn);
        Button addedbtn = findViewById(R.id.addedbtn);
        ImageView imageView = findViewById(R.id.image);
        TextView textView = findViewById(R.id.name);

        String i = getIntent().getStringExtra("item");

        SharedPref sharedPref = new SharedPref(ProductDetails.this);

        if(i != null) {

            if (i.matches("one")) {
                imageView.setImageResource(R.drawable.cakeone);
                textView.setText("Rainbow Cake");

                if (SharedPref.getOne().matches("yes")) {
                    addbtn.setVisibility(View.GONE);
                    addedbtn.setVisibility(View.VISIBLE);
                }
            }
            if (i.matches("two")) {
                imageView.setImageResource(R.drawable.caketwo);
                textView.setText("Rich Chocolate Cake");
                if (SharedPref.getTwo().matches("yes")) {
                    addbtn.setVisibility(View.GONE);
                    addedbtn.setVisibility(View.VISIBLE);
                }
            }
            if (i.matches("three")) {
                imageView.setImageResource(R.drawable.cakethree);
                textView.setText("Vanilla Cake");
                if (SharedPref.getThree().matches("yes")) {
                    addbtn.setVisibility(View.GONE);
                    addedbtn.setVisibility(View.VISIBLE);
                }
            }
            if (i.matches("four")) {
                imageView.setImageResource(R.drawable.cakefour);
                textView.setText("Gems Cake");
                if (SharedPref.getFour().matches("yes")) {
                    addbtn.setVisibility(View.GONE);
                    addedbtn.setVisibility(View.VISIBLE);
                }
            }

            if (i.matches("five")) {
                imageView.setImageResource(R.drawable.cakefive);
                textView.setText("Rose Cake");
                if (SharedPref.getFive().matches("yes")) {
                    addbtn.setVisibility(View.GONE);
                    addedbtn.setVisibility(View.VISIBLE);
                }
            }
            if (i.matches("six")) {
                imageView.setImageResource(R.drawable.cakesix);
                textView.setText("Strawberry Chocolate Cake");
                if (SharedPref.getSix().matches("yes")) {
                    addbtn.setVisibility(View.GONE);
                    addedbtn.setVisibility(View.VISIBLE);
                }
            }
            if (i.matches("seven")) {
                imageView.setImageResource(R.drawable.cakeseven);
                textView.setText("Colourful Cake");
                if (SharedPref.getSeven().matches("yes")) {
                    addbtn.setVisibility(View.GONE);
                    addedbtn.setVisibility(View.VISIBLE);
                }
            }
            if (i.matches("eight")) {
                imageView.setImageResource(R.drawable.cakeeight);
                textView.setText("Two in One Cake");

                if (SharedPref.getEight().matches("yes")) {
                    addbtn.setVisibility(View.GONE);
                    addedbtn.setVisibility(View.VISIBLE);
                }
            }

        }

        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(i.matches("one")){
                    sharedPref.setOne("yes");
                    Log.i("Hii" , i);
//                    if(sharedPref.getOne().matches("yes"));
                    addbtn.setVisibility(View.GONE);
                    addedbtn.setVisibility(View.VISIBLE);
                }

                if(i.matches("two")){
//                    imageView.setImageResource(R.drawable.caketwo);
//                    textView.setText("Rich Chocolate Cake");
                    sharedPref.setTwo("yes");
                    Log.i("Hii" , i);
                    addbtn.setVisibility(View.GONE);
                    addedbtn.setVisibility(View.VISIBLE);
                }
                if(i.matches("three")){
//                    imageView.setImageResource(R.drawable.cakethree);
//                    textView.setText("Vanilla Cake");
                    sharedPref.setThree("yes");
                    Log.i("Hii" , i);
                    addbtn.setVisibility(View.GONE);
                    addedbtn.setVisibility(View.VISIBLE);
                }
                if(i.matches("four")){
//                    imageView.setImageResource(R.drawable.cakefour);
//                    textView.setText("Gems Cake");
                    sharedPref.setFour("yes");
                    Log.i("Hii" , i);
                    addbtn.setVisibility(View.GONE);
                    addedbtn.setVisibility(View.VISIBLE);
                }

                if(i.matches("five")){
                    sharedPref.setFive("yes");
                    Log.i("Hii" , i);
//                    if(sharedPref.getOne().matches("yes"));
                    addbtn.setVisibility(View.GONE);
                    addedbtn.setVisibility(View.VISIBLE);
                }
                if(i.matches("six")){
                    sharedPref.setSix("yes");
                    Log.i("Hii" , i);
//                    if(sharedPref.getOne().matches("yes"));
                    addbtn.setVisibility(View.GONE);
                    addedbtn.setVisibility(View.VISIBLE);
                }
                if(i.matches("seven")){
                    sharedPref.setSeven("yes");
                    Log.i("Hii" , "*");
//                    if(sharedPref.getOne().matches("yes"));
                    addbtn.setVisibility(View.GONE);
                    addedbtn.setVisibility(View.VISIBLE);
                }
                if(i.matches("eight")){
                    sharedPref.setEight("yes");
                    Log.i("Hii" , i);
//                    if(sharedPref.getOne().matches("yes"));
//                    addbtn.setVisibility(View.GONE);
//                    addedbtn.setVisibility(View.VISIBLE);
                }

            }
        });
    }
}