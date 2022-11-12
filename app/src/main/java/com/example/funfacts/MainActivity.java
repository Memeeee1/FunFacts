package com.example.funfacts;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity  {


//    public static final String TAG= MainActivity.class.getSimpleName();

    private FactBook mFactBook=new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final  TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactbutton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout= (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = mFactBook.getFacts();
                factLabel.setText(fact);

                int color = mColorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showFactbutton.setTextColor(color);
            }
        };

        showFactbutton.setOnClickListener(listener);
//        Log.d(TAG,"we're logging from the onCreate() method ! ");

    }
}