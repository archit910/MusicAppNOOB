package com.example.archit.gomusiclive;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class Golive extends AppCompatActivity {

    boolean check= true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_golive);
        Toast.makeText(Golive.this, "PLease Rate My Application Ms Ginny", Toast.LENGTH_SHORT).show();
        RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                if(check){
                Toast.makeText(Golive.this, "Thankyou", Toast.LENGTH_SHORT).show(); check= false;}
                else
                    Toast.makeText(Golive.this, "Make Your mind Please", Toast.LENGTH_SHORT).show();



            }
        });

    }
    public void BMS(View view)
    {
        Intent i = new Intent();
        Uri uri = Uri.parse("https://in.bookmyshow.com");
        i.setAction(Intent.ACTION_VIEW);
        i.setData(uri);
        startActivity(i);


    }
    public void BMT(View view)
    {
        Intent i = new Intent();
        Uri uri = Uri.parse("http://www.bookmyevent.com/");

        i.setAction(Intent.ACTION_VIEW);
        i.setData(uri);
        startActivity(i);


    }
    public void TP(View view)
    {
        Intent i = new Intent();
        Uri uri = Uri.parse("http://www.ticketplease.com/");

        i.setAction(Intent.ACTION_VIEW);
        i.setData(uri);
        startActivity(i);


    }
}
