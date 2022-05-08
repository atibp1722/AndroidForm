package com.first.registration;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class Register extends AppCompatActivity {
    ConstraintLayout cLayout;
    Animation sequential_anime;
    AlertDialog.Builder alertDialog;
    private TextView txt;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        cLayout = findViewById(R.id.constLay);
        txt.findViewById(R.id.textView10);
        btn = findViewById(R.id.button7);
        //Animation
        sequential_anime = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.sequential);
        cLayout.startAnimation(sequential_anime);
        //Redirect to login activity
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Register.this, Login.class));
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                closeDialog();
            }
        });
    }
    //Close dialog button
    private void closeDialog() {
        alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("Close Application").setMessage("Are you sure you want to close the application?")
        .setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        }).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                System.exit(0);
            }
        }).show();
        alertDialog.create();
    }

}