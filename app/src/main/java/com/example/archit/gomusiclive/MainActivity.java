package com.example.archit.gomusiclive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        login();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "Welcome User", Toast.LENGTH_SHORT).show();
        Button go_live =( Button ) findViewById(R.id.goLive);
        Button check_music=(Button)findViewById(R.id.checkMusic);




    }
    public void login()
    {
        Intent i = new Intent();
        i.setClass(getApplicationContext(),LoginActivity.class);
        startActivity(i);

    }
   public void ClickMusic (View view)
    {
        Log.d("Tag", "ClickMusic");
        Intent i = new Intent();
        i.setClass(getApplicationContext(),Cmusic.class);
        startActivity(i);
    }
    public void ClickGoLive(View view)
    {Intent i = new Intent();
        i.setClass(getApplicationContext(),Golive.class);
        startActivity(i);
    }
}
