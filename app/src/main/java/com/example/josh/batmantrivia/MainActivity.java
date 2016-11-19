package com.example.josh.batmantrivia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateScore(View view) {
        int score =0;

        EditText editText = (EditText) findViewById(R.id.name_edit);

        RadioButton rb1 = (RadioButton) findViewById(R.id.radio_Bruce_Wayne);
        RadioButton rb2 = (RadioButton) findViewById(R.id.radio_Bob_Kane);
        RadioButton rb3 = (RadioButton) findViewById(R.id.radio_Bane);
        RadioButton rb4 = (RadioButton) findViewById(R.id.radio_bat_cow);
        RadioButton rb5 = (RadioButton) findViewById(R.id.radio_Joe_Chill);
        RadioButton rb6 = (RadioButton) findViewById(R.id.radio_killing_joke);
        RadioButton rb7 = (RadioButton) findViewById(R.id.radio_ras);
        RadioButton rb8 = (RadioButton) findViewById(R.id.radio_Talia);

        CheckBox checkBox_1 = (CheckBox) findViewById(R.id.checkbox_Brown);
        CheckBox checkBox_2 = (CheckBox) findViewById(R.id.checkbox_Damian);
        CheckBox checkBox_3 = (CheckBox) findViewById(R.id.checkbox_Grayson);
        CheckBox checkBox_4 = (CheckBox) findViewById(R.id.checkbox_Kelley);
        CheckBox checkBox_5 = (CheckBox) findViewById(R.id.checkbox_Todd);

        RadioButton[] radio_array = {rb1,rb2,rb3,rb4,rb5,rb6,rb7,rb8};

        CheckBox[] checkbox_array = {checkBox_1,checkBox_2,checkBox_3,checkBox_4,checkBox_5};

        for (RadioButton rb:radio_array) {
            if (rb.isChecked())
                score ++;
        }

        for (CheckBox checkbox:checkbox_array) {
            if (checkbox.isChecked())
                score ++;
        }

        if (editText.getText().toString().toUpperCase().equals("ORACLE")) {
            score++;
        }

        Toast.makeText(this,"You scored " + score + " out of 14",Toast.LENGTH_LONG).show();
    }
}
