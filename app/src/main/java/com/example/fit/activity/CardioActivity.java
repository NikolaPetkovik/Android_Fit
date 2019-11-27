package com.example.fit.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import com.example.fit.R;
import com.example.fit.singleton.DetailsSingleton;


public class CardioActivity extends AppCompatActivity {


        CheckBox    cardioType1,    cardioType2,    cardioType3,
                    cardioType4,    cardioType5;

        ImageView   cardioBack,     cardioCheck;

        String      valueCardio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardio);

            initComponents();
            setComponents();
    }


    private void initComponents() {
        cardioType1   = findViewById(R.id.checkBoxCardioWalk2Km);
        cardioType2   = findViewById(R.id.checkBoxCardioRun5Km);
        cardioType3   = findViewById(R.id.checkBoxCardioSprint200m);
        cardioType4   = findViewById(R.id.checkBoxCardioSprint400m);
        cardioType5   = findViewById(R.id.checkBoxCardioBike15min);

        cardioBack    = findViewById(R.id.imageViewCardioBack);
        cardioCheck   = findViewById(R.id.imageViewCardioCheck);

        valueCardio   = DetailsSingleton.getInstance(CardioActivity.this).getValueCardio();
    }

    private void setComponents() {

        cardioType1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardioType1.isChecked()) {
                    CheckBoxType1();
                }
                else{
                    CheckBoksReset();
                }
            }
        });

        cardioType2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardioType2.isChecked()) {
                    CheckBoxType2();
                }
                else{
                    CheckBoksReset();
                }
            }
        });

        cardioType3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardioType3.isChecked()) {
                    CheckBoxType3();
                }
                else{
                    CheckBoksReset();
                }
            }
        });

        cardioType4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardioType4.isChecked()) {
                    CheckBoxType4();
                }
                else{
                    CheckBoksReset();
                }
            }
        });

        cardioType5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardioType5.isChecked()) {
                    CheckBoxType5();
                }
                else{
                    CheckBoksReset();
                }
            }
        });


        cardioBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        cardioCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DetailsSingleton.getInstance(CardioActivity.this).setValueCardio(valueCardio);
                onBackPressed();
            }
        });


        if (valueCardio.equalsIgnoreCase("Walk 2Km")) {
            UnCheckBoxType1();
        }

        if (valueCardio.equalsIgnoreCase("Walk 5Km")) {
            UnCheckBoxType2();
        }

        if (valueCardio.equalsIgnoreCase("Sprint 200m")) {
            UnCheckBoxType3();
        }

        if (valueCardio.equalsIgnoreCase("Sprint 400m")) {
            UnCheckBoxType4();
        }

        if (valueCardio.equalsIgnoreCase("Bike 15min")) {
            UnCheckBoxType5();
        }

    }


    private void CheckBoksReset(){
        cardioType1.setChecked(false);
        cardioType2.setChecked(false);
        cardioType3.setChecked(false);
        cardioType4.setChecked(false);
        cardioType5.setChecked(false);

        valueCardio           = "Run";
    }

    private void CheckBoxType1() {
        cardioType2.setChecked(false);
        cardioType3.setChecked(false);
        cardioType4.setChecked(false);
        cardioType5.setChecked(false);

        valueCardio           = "Walk 2Km";
    }

    private void CheckBoxType2() {
        cardioType1.setChecked(false);
        cardioType3.setChecked(false);
        cardioType4.setChecked(false);
        cardioType5.setChecked(false);

        valueCardio           = "Walk 5Km";
    }

    private void CheckBoxType3() {
        cardioType1.setChecked(false);
        cardioType2.setChecked(false);
        cardioType4.setChecked(false);
        cardioType5.setChecked(false);

        valueCardio           = "Sprint 200m";
    }

    private void CheckBoxType4() {
        cardioType1.setChecked(false);
        cardioType2.setChecked(false);
        cardioType3.setChecked(false);
        cardioType5.setChecked(false);

        valueCardio           = "Sprint 400m";
    }

    private void CheckBoxType5() {
        cardioType1.setChecked(false);
        cardioType2.setChecked(false);
        cardioType3.setChecked(false);
        cardioType4.setChecked(false);

        valueCardio           = "Bike 15min";
    }


    private void UnCheckBoxType1() {
        cardioType1.setChecked(true);
        cardioType2.setChecked(false);
        cardioType3.setChecked(false);
        cardioType4.setChecked(false);
        cardioType4.setChecked(false);
    }

    private void UnCheckBoxType2() {
        cardioType1.setChecked(false);
        cardioType2.setChecked(true);
        cardioType3.setChecked(false);
        cardioType4.setChecked(false);
        cardioType4.setChecked(false);
    }

    private void UnCheckBoxType3() {
        cardioType1.setChecked(false);
        cardioType2.setChecked(false);
        cardioType3.setChecked(true);
        cardioType4.setChecked(false);
        cardioType4.setChecked(false);
    }

    private void UnCheckBoxType4() {
        cardioType1.setChecked(false);
        cardioType2.setChecked(false);
        cardioType3.setChecked(false);
        cardioType4.setChecked(true);
        cardioType4.setChecked(false);
    }

    private void UnCheckBoxType5() {
        cardioType1.setChecked(false);
        cardioType2.setChecked(false);
        cardioType3.setChecked(false);
        cardioType4.setChecked(false);
        cardioType5.setChecked(true);
    }

}
