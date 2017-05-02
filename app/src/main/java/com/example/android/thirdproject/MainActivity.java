package com.example.android.thirdproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    boolean first = false;
    boolean second = false;
    boolean third = false;
    boolean fourth = false;
    boolean fifth = false;
    boolean sixth = false;
    int score = 0;

    public void firstRB() {
        RadioButton radio = (RadioButton) findViewById(R.id.first_A);
        boolean radioA = radio.isChecked();
        if (radioA == true){
            first = true;
        }
    }

    public void secondRB() {
        RadioButton radio = (RadioButton) findViewById(R.id.second_B);
        boolean radioB = radio.isChecked();
        if (radioB == true){
            second = true;
        }
    }

    public void thirdCB(){
        //correct
        CheckBox thirdA = (CheckBox) findViewById(R.id.third_A);
        boolean isA = thirdA.isChecked();
        CheckBox thirdB = (CheckBox) findViewById(R.id.third_B);
        boolean isB = thirdB.isChecked();
        //correct
        CheckBox thirdC = (CheckBox) findViewById(R.id.third_C);
        boolean isC = thirdC.isChecked();
        CheckBox thirdD = (CheckBox) findViewById(R.id.third_D);
        boolean isD = thirdD.isChecked();

        if (isA && isC){
            third = true;
        }
    }
    public void fourthET(){
        EditText fourthQ = (EditText) findViewById(R.id.fourthQ);
        String fourth_ans = fourthQ.getText().toString();
        fourth = fourth_ans.equals("28");
    }

    public void fifthCB() {
        CheckBox fifthA = (CheckBox) findViewById(R.id.fifth_A);
        boolean isA = fifthA.isChecked();
        CheckBox fifthB = (CheckBox) findViewById(R.id.fifth_B);
        boolean isB = fifthB.isChecked();
        CheckBox fifthC = (CheckBox) findViewById(R.id.fifth_C);
        boolean isC = fifthC.isChecked();
        CheckBox fifthD = (CheckBox) findViewById(R.id.fifth_D);
        boolean isD = fifthD.isChecked();

        if (isA && isC){
            fifth = true;
        }
    }

    public void sixthET(){
        EditText sixthQ = (EditText) findViewById(R.id.sixthQ);
        String sixth_ans = sixthQ.getText().toString();
        sixth = sixth_ans.equals("50");
    }

    private int score(boolean one, boolean two, boolean three, boolean four, boolean five, boolean six){
        if (one){
            score = score + 1;
        }
        if (two){
            score = score + 1;
        }
        if (three){
            score = score + 1;
        }
        if (four){
            score = score + 1;
        }
        if (five){
            score = score + 1;
        }
        if (six){
            score = score + 1;
        }
        return score;
    }

    private void displayScore(String message) {
        TextView show_score = (TextView) findViewById(R.id.scoreTv);
        show_score.setText(message);
    }
    private void displayAnswers(String message) {
        TextView show_answers = (TextView) findViewById(R.id.answers);
        show_answers.setText(message);
    }

    public void submit(View view){

        firstRB();
        secondRB();
        thirdCB();
        fourthET();
        fifthCB();
        sixthET();
        score(first, second, third, fourth, fifth, sixth);
        Toast.makeText(this, "Swipe down to see your score!", Toast.LENGTH_LONG);
        displayScore("Your Score: " + score);
        displayAnswers("The correct answers were:\n#1 Equator\n#2 Canberra\n#3 Iran, Indonesia\n#4 28\n#5 Blue, yellow\n#6 50");
        score = 0;
        first = false;
        second = false;
        third = false;
        fourth = false;
        fifth = false;
        sixth = false;
    }
}

