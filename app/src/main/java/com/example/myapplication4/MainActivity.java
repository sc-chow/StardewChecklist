package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //function of onclick button to move to the main menu
    public void MovetoMM(View view){
        Intent mainmenuintent = new Intent(this,MainMenuActivity.class);
        startActivity(mainmenuintent);
    }
}
