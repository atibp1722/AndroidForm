package com.first.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txt, txt2;
    private Button bt, bt1, bt2;
    private Animation txtMove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        txt2 = findViewById(R.id.textView);
        bt = findViewById(R.id.button);
        bt1 = findViewById(R.id.button2);
        bt2 = findViewById(R.id.button5);
        //Animation
        txtMove = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
        txt.startAnimation(txtMove);
        txt2.startAnimation(txtMove);
        bt.startAnimation(txtMove);
        bt1.startAnimation(txtMove);
        bt2.startAnimation(txtMove);
        //Redirect to register activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Register.class);
                startActivity(intent);
                finish();
            }
        }, 5000);
    }
}