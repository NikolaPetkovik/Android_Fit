package com.example.fit.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import com.example.fit.R;
import com.example.fit.singleton.DetailsSingleton;


public class WeightLiftingActivity extends AppCompatActivity {


        CheckBox    weightType1,    weightType2,    weightType3,
                    weightType4,    weightType5;

        ImageView   weightBack,     weightCheck;

        String      valueWeith,     valueWeithProccent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_lifting);

        initComponents();
        setComponents();
    }


    private void initComponents() {
        weightType1 = findViewById(R.id.checkBoxWeightType1);
        weightType2 = findViewById(R.id.checkBoxWeightType2);
        weightType3 = findViewById(R.id.checkBoxWeightType3);
        weightType4 = findViewById(R.id.checkBoxWeightType4);
        weightType5 = findViewById(R.id.checkBoxWeightType5);

        weightBack  = findViewById(R.id.imageViewWeightBack);
        weightCheck = findViewById(R.id.imageViewWeightCheck);

        weightType2.setEnabled(false);
        weightType3.setEnabled(false);
        weightType4.setEnabled(false);
        weightType5.setEnabled(false);

        valueWeith          = DetailsSingleton.getInstance(WeightLiftingActivity.this).getValueWeith();
        valueWeithProccent  = DetailsSingleton.getInstance(WeightLiftingActivity.this).getValueWeithProcent();
    }

    private void setComponents() {

        weightType1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (weightType1.isChecked()) {
                    CheckBoxType1();
                }
                if (!weightType1.isChecked()) {
                    UnCheckBoxType1();
                }
            }
        });

        weightType2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (weightType2.isChecked()) {
                    CheckBoxType2();
                }
                if (!weightType2.isChecked()) {
                    UnCheckBoxType2();
                }
            }
        });

        weightType3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (weightType3.isChecked()) {
                    CheckBoxType3();
                }
                if (!weightType3.isChecked()) {
                    UnCheckBoxType3();
                }
            }
        });

        weightType4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (weightType4.isChecked()) {
                    CheckBoxType4();
                }
                if (!weightType4.isChecked()) {
                    UnCheckBoxType4();
                }
            }
        });

        weightType5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (weightType5.isChecked()) {
                    CheckBoxType5();
                }
                if (!weightType5.isChecked()) {
                    UnCheckBoxType5();
                }
            }
        });

        weightBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        weightCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DetailsSingleton.getInstance(WeightLiftingActivity.this).setValueWeith(valueWeith);
                DetailsSingleton.getInstance(WeightLiftingActivity.this).setValueWeithProcent(valueWeithProccent);

                onBackPressed();
            }
        });


        if (valueWeith.equalsIgnoreCase("Set 1")) {
            CheckBoxType1();
        }

        if (valueWeith.equalsIgnoreCase("Set 2")) {
            CheckBoxType2();
        }

        if (valueWeith.equalsIgnoreCase("Set 3")) {
            CheckBoxType3();
        }

        if (valueWeith.equalsIgnoreCase("Set 4")) {
            CheckBoxType4();
        }

        if (valueWeith.equalsIgnoreCase("Set 5")) {
            CheckBoxType5();
        }
    }


    private void CheckBoxType1() {
        weightType1.setChecked(true);

        weightType2.setEnabled(true);
        weightType2.setChecked(false);

        weightType3.setEnabled(false);
        weightType3.setChecked(false);

        weightType4.setEnabled(false);
        weightType4.setChecked(false);

        weightType5.setEnabled(false);
        weightType5.setChecked(false);

        valueWeith = "Set 1";
        valueWeithProccent = "20%";
    }

    private void CheckBoxType2() {
        weightType1.setChecked(true);

        weightType2.setChecked(true);
        weightType2.setEnabled(true);

        weightType3.setChecked(false);
        weightType3.setEnabled(true);

        weightType4.setEnabled(false);
        weightType4.setChecked(false);

        weightType5.setEnabled(false);
        weightType5.setChecked(false);

        valueWeith = "Set 2";
        valueWeithProccent = "40%";
    }

    private void CheckBoxType3() {
        weightType1.setChecked(true);

        weightType2.setChecked(true);
        weightType2.setEnabled(true);

        weightType3.setChecked(true);
        weightType3.setEnabled(true);

        weightType4.setEnabled(true);
        weightType4.setChecked(false);

        weightType5.setEnabled(false);
        weightType5.setChecked(false);

        valueWeith = "Set 3";
        valueWeithProccent = "60%";
    }

    private void CheckBoxType4() {
        weightType1.setChecked(true);

        weightType2.setChecked(true);
        weightType2.setEnabled(true);

        weightType3.setChecked(true);
        weightType3.setEnabled(true);

        weightType4.setEnabled(true);
        weightType4.setChecked(true);

        weightType5.setEnabled(true);
        weightType5.setChecked(false);

        valueWeith = "Set 4";
        valueWeithProccent = "80%";
    }

    private void CheckBoxType5() {
        weightType1.setChecked(true);

        weightType2.setChecked(true);
        weightType2.setEnabled(true);

        weightType3.setChecked(true);
        weightType3.setEnabled(true);

        weightType4.setEnabled(true);
        weightType4.setChecked(true);

        weightType5.setEnabled(true);
        weightType5.setChecked(true);

        valueWeith = "Set 5";
        valueWeithProccent = "100%";
    }


    private void UnCheckBoxType1() {
        weightType2.setEnabled(false);
        weightType2.setChecked(false);

        weightType3.setEnabled(false);
        weightType3.setChecked(false);

        weightType4.setChecked(false);
        weightType4.setEnabled(false);

        weightType5.setEnabled(false);
        weightType5.setChecked(false);

        valueWeith = "Sets";
        valueWeithProccent = "%";
    }

    private void UnCheckBoxType2() {
        weightType3.setEnabled(false);
        weightType3.setChecked(false);

        weightType4.setChecked(false);
        weightType4.setEnabled(false);

        weightType5.setEnabled(false);
        weightType5.setChecked(false);

        valueWeith = "Set 1";
        valueWeithProccent = "20%";
    }

    private void UnCheckBoxType3() {
        weightType4.setChecked(false);
        weightType4.setEnabled(false);

        weightType5.setEnabled(false);
        weightType5.setChecked(false);

        valueWeith = "Set 2";
        valueWeithProccent = "40%";
    }

    private void UnCheckBoxType4() {
        weightType5.setEnabled(false);
        weightType5.setChecked(false);

        valueWeith = "Set 3";
        valueWeithProccent = "60%";
    }

    private void UnCheckBoxType5() {
        weightType5.setEnabled(true);
        weightType5.setChecked(false);

        valueWeith = "Set 4";
        valueWeithProccent = "80%";
    }
}































