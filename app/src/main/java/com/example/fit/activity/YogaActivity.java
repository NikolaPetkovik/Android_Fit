package com.example.fit.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import com.example.fit.R;
import com.example.fit.singleton.DetailsSingleton;


public class YogaActivity extends AppCompatActivity {

        CheckBox    yogaType1,  yogaType2,  yogaType3,
                    yogaType4,  yogaType5;

        ImageView   yogaBack,   yogaCheck;

        String      valueYoga,  valueYogaProcent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga);

            initComponents();
            setComponents();
    }


    private void initComponents() {
        yogaType1   = findViewById(R.id.checkBoxYoga5min);
        yogaType2   = findViewById(R.id.checkBoxYoga15min);
        yogaType3   = findViewById(R.id.checkBoxYoga30min);
        yogaType4   = findViewById(R.id.checkBoxYoga45min);
        yogaType5   = findViewById(R.id.checkBoxYoga1hou);

        yogaBack    = findViewById(R.id.imageViewBackYoga);
        yogaCheck   = findViewById(R.id.imageViewCheckYoga);

        valueYoga           = DetailsSingleton.getInstance(YogaActivity.this).getValueYoga();
        valueYogaProcent    = DetailsSingleton.getInstance(YogaActivity.this).getValueYogaProcent();
    }

    private void setComponents() {

        yogaType1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (yogaType1.isChecked()) {
                    CheckBoxType1();
                }
                else{
                    CheckBoksReset();
                }
            }
        });

        yogaType2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (yogaType2.isChecked()) {
                    CheckBoxType2();
                }
                else{
                    CheckBoksReset();
                }
            }
        });

        yogaType3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (yogaType3.isChecked()) {
                    CheckBoxType3();
                }
                else{
                    CheckBoksReset();
                }
            }
        });

        yogaType4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (yogaType4.isChecked()) {
                    CheckBoxType4();
                }
                else{
                    CheckBoksReset();
                }
            }
        });

        yogaType5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (yogaType5.isChecked()) {
                    CheckBoxType5();
                }
                else{
                    CheckBoksReset();
                }
            }
        });

        yogaBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        yogaCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DetailsSingleton.getInstance(YogaActivity.this).setValueYoga(valueYoga);
                DetailsSingleton.getInstance(YogaActivity.this).setValueYougaProcent(valueYogaProcent);

                onBackPressed();
            }
        });

        if (valueYoga.equalsIgnoreCase("5min")) {
            UnCheckBoxType1();
        }

        if (valueYoga.equalsIgnoreCase("15min")) {
            UnCheckBoxType2();
        }

        if (valueYoga.equalsIgnoreCase("30min")) {
            UnCheckBoxType3();
        }

        if (valueYoga.equalsIgnoreCase("45min")) {
            UnCheckBoxType4();
        }

        if (valueYoga.equalsIgnoreCase("1hour")) {
            UnCheckBoxType5();
        }
    }


    private void CheckBoksReset(){
        yogaType1.setChecked(false);
        yogaType2.setChecked(false);
        yogaType3.setChecked(false);
        yogaType4.setChecked(false);
        yogaType5.setChecked(false);

        valueYoga           = "hour";
        valueYogaProcent   = "%";
    }


    private void CheckBoxType1() {
        yogaType2.setChecked(false);
        yogaType3.setChecked(false);
        yogaType4.setChecked(false);
        yogaType5.setChecked(false);

        valueYoga           = "5min";
        valueYogaProcent   = "20%";
    }

    private void CheckBoxType2() {
        yogaType1.setChecked(false);
        yogaType3.setChecked(false);
        yogaType4.setChecked(false);
        yogaType5.setChecked(false);

        valueYoga           = "15min";
        valueYogaProcent   = "40%";
    }

    private void CheckBoxType3() {
        yogaType1.setChecked(false);
        yogaType2.setChecked(false);
        yogaType4.setChecked(false);
        yogaType5.setChecked(false);

        valueYoga           = "30min";
        valueYogaProcent   = "60%";
    }

    private void CheckBoxType4() {
        yogaType1.setChecked(false);
        yogaType2.setChecked(false);
        yogaType3.setChecked(false);
        yogaType5.setChecked(false);

        valueYoga           = "45min";
        valueYogaProcent   = "80%";
    }

    private void CheckBoxType5() {
        yogaType1.setChecked(false);
        yogaType2.setChecked(false);
        yogaType3.setChecked(false);
        yogaType4.setChecked(false);

        valueYoga           = "1hour";
        valueYogaProcent   = "100%";
    }


    private void UnCheckBoxType1() {
        yogaType1.setChecked(true);
        yogaType2.setChecked(false);
        yogaType3.setChecked(false);
        yogaType4.setChecked(false);
        yogaType5.setChecked(false);
    }

    private void UnCheckBoxType2() {
        yogaType1.setChecked(false);
        yogaType2.setChecked(true);
        yogaType3.setChecked(false);
        yogaType4.setChecked(false);
        yogaType5.setChecked(false);
    }

    private void UnCheckBoxType3() {
        yogaType1.setChecked(false);
        yogaType2.setChecked(false);
        yogaType3.setChecked(true);
        yogaType4.setChecked(false);
        yogaType5.setChecked(false);
    }

    private void UnCheckBoxType4() {
        yogaType1.setChecked(false);
        yogaType2.setChecked(false);
        yogaType3.setChecked(false);
        yogaType4.setChecked(true);
        yogaType5.setChecked(false);
    }

    private void UnCheckBoxType5() {
        yogaType1.setChecked(false);
        yogaType2.setChecked(false);
        yogaType3.setChecked(false);
        yogaType4.setChecked(false);
        yogaType5.setChecked(true);
    }
}
