package com.first.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private EditText edt, edt1;
    private ImageView img;
    private Animation fade_anim;
    private Button btn, btn1;
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edt = findViewById(R.id.editTextTextEmailAddress);
        edt1 = findViewById(R.id.editTextTextPassword);
        img = findViewById(R.id.imageView2);
        btn = findViewById(R.id.button3);
        btn1 = findViewById(R.id.button4);
        txt=findViewById(R.id.textView7);
        //Animation
        fade_anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        img.startAnimation(fade_anim);
        edt.startAnimation(fade_anim);
        edt1.startAnimation(fade_anim);
        //Click Listeners
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( edt.getText()==null && edt1.getText()==null ){
                    Toast.makeText(getApplicationContext(), "Fields can't be empty!!", Toast.LENGTH_LONG).show();
                }else if( !"admin".equals(edt.getText()) || !"admin".equals(edt1.getText()) ){
                    Toast.makeText(getApplicationContext(), "Username and/or Password invalid!!!!", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Welcome "+edt, Toast.LENGTH_SHORT).show();
                }
            }
        });
        //Redirect to registration activity
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login.this, Register.class));
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText("");
                edt1.setText("");
                edt.requestFocus();
            }
        });

    }
}