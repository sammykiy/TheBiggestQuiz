package com.example.thebiggestquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkAnswers(View view) {
        double c = 0.0;

        RadioGroup rg = findViewById(R.id.radQuest1);
        if (rg.getCheckedRadioButtonId() == -1) {
            return;
        } else {
            String radioValue = ((RadioButton) findViewById(rg.getCheckedRadioButtonId())).getText().toString();
            String answer1 = getString(R.string.ques1_answer);
            if (radioValue.equals(answer1)) {
                c = c + 1;
            }
        }
        CheckBox ans2_a = (CheckBox) findViewById(R.id.answer2_a);
        CheckBox ans2_b = (CheckBox) findViewById(R.id.answer2_b);
        CheckBox ans2_c = (CheckBox) findViewById(R.id.answer2_c);


        // Answer checking as reviewed
        if(!ans2_a.isChecked() && ans2_b.isChecked() && ans2_c.isChecked()){
            c += 1;
        }

        rg = findViewById(R.id.radQuest3);
        if (rg.getCheckedRadioButtonId() == -1) {
            return;
        } else {
            String radioValue = ((RadioButton) findViewById(rg.getCheckedRadioButtonId())).getText().toString();
            String answer3 = getString(R.string.ques3_answer);
            if (radioValue.equals(answer3)) {
                c = c + 1;
            }
        }
        rg = findViewById(R.id.radQuest4);
        if (rg.getCheckedRadioButtonId() == -1) {
            return;
        } else {
            String radioValue = ((RadioButton) findViewById(rg.getCheckedRadioButtonId())).getText().toString();
            String answer4 = getString(R.string.ques4_answer);
            if (radioValue.equals(answer4)) {
                c = c + 1;
            }
        }
        EditText ans5 = findViewById(R.id.editBox5);
        String editValue = ans5.getText().toString();
        String answer5 = getString(R.string.ques5_answer);
        if (editValue.equals(answer5)) {
            c = c + 1;
        }
        rg = findViewById(R.id.radQuest6);
        if (rg.getCheckedRadioButtonId() == -1) {
            return;
        } else {
            String radioValue = ((RadioButton) findViewById(rg.getCheckedRadioButtonId())).getText().toString();
            String answer6 = getString(R.string.ques6_answer);
            if (radioValue.equals(answer6)) {
                c = c + 1;
            }
        }
        rg = findViewById(R.id.radQuest7);
        if (rg.getCheckedRadioButtonId() == -1) {
            return;
        } else {
            String radioValue = ((RadioButton) findViewById(rg.getCheckedRadioButtonId())).getText().toString();
            String answer7 = getString(R.string.ques7_answer);
            if (radioValue.equals(answer7)) {
                c = c + 1;
            }
        }
        rg = findViewById(R.id.radQuest8);
        if (rg.getCheckedRadioButtonId() == -1) {
            return;
        } else {
            String radioValue = ((RadioButton) findViewById(rg.getCheckedRadioButtonId())).getText().toString();
            String answer8 = getString(R.string.ques8_answer);
            if (radioValue.equals(answer8)) {
                c = c + 1;
            }
        }
        rg = findViewById(R.id.radQuest9);
        if (rg.getCheckedRadioButtonId() == -1) {
            return;
        } else {
            String radioValue = ((RadioButton) findViewById(rg.getCheckedRadioButtonId())).getText().toString();
            String answer9 = getString(R.string.ques9_answer);
            if (radioValue.equals(answer9)) {
                c = c + 1;
            }
        }
        rg = findViewById(R.id.radQuest10);
        if (rg.getCheckedRadioButtonId() == -1) {
            return;
        } else {
            String radioValue = ((RadioButton) findViewById(rg.getCheckedRadioButtonId())).getText().toString();
            String answer10 = getString(R.string.ques10_answer);
            if (radioValue.equals(answer10)) {
                c = c + 1;
            }
        }

        EditText name = findViewById(R.id.user_name);
        String user = name.getText().toString();

        String toastMessage = user + ", you got " + c + " out of 10 correct";
        Toast toast = Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT);
        toast.show();

    }
}
