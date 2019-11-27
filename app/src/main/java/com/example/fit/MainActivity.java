package com.example.fit;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.fit.activity.CardioActivity;
import com.example.fit.activity.WeightLiftingActivity;
import com.example.fit.activity.YogaActivity;
import com.example.fit.singleton.DetailsSingleton;


public class MainActivity extends AppCompatActivity {


        ConstraintLayout topLayout, middleLayout, bottomLayout;

        TextView    weithSet,   weithPocent,    yogahour,   yogaProcent,    cardioRun;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
        setComponents();
    }


    private void initComponents() {

        topLayout       = findViewById(R.id.LayoutTop);
        middleLayout    = findViewById(R.id.LayoutMiddle);
        bottomLayout    = findViewById(R.id.LayoutBottom);

        weithSet        = findViewById(R.id.textViewSets);
        weithPocent     = findViewById(R.id.textViewSetsProcent);

        yogahour        = findViewById(R.id.textViewhour);
        yogaProcent     = findViewById(R.id.textViewhourProcent);

        cardioRun       = findViewById(R.id.textViewRun);
    }

    private void setComponents() {

        topLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent weithlifting = new Intent (MainActivity.this, WeightLiftingActivity.class);
                startActivity(weithlifting);
            }
        });

        middleLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yoga = new Intent (MainActivity.this, YogaActivity.class);
                startActivity(yoga);
            }
        });

        bottomLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cadrio = new Intent (MainActivity.this, CardioActivity.class);
                startActivity(cadrio);
            }
        });
    }


    @Override
    protected void onResume() {

        weithSet    .setText(DetailsSingleton.getInstance(MainActivity.this).getValueWeith());
        weithPocent .setText(DetailsSingleton.getInstance(MainActivity.this).getValueWeithProcent());

        yogahour    .setText(DetailsSingleton.getInstance(MainActivity.this).getValueYoga());
        yogaProcent .setText(DetailsSingleton.getInstance(MainActivity.this).getValueYogaProcent());

        cardioRun   .setText(DetailsSingleton.getInstance(MainActivity.this).getValueCardio());

        super.onResume();
    }
}