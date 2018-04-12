package com.example.android.courtcounter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.android.courtcounter.R.id.team_a_score;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int num,num1;
    public void ib3(View view)
    {
        num+=3;
        display(num);
    }

    public void ib2(View view)
    {
        num+=2;
        display(num);
    }

    public void ib1(View view)
    {
        num+=1;
        display(num);
    }

    public void display(int number)
    {
        TextView ptv= (TextView)findViewById(R.id.team_a_score);
        ptv.setText(String.valueOf(number));
    }

    public void display1(int number)
    {
        TextView ptv= (TextView)findViewById(R.id.team_b_score);
        ptv.setText(String.valueOf(number));
    }

    public void ia3(View view)
    {
        num1+=3;
        display1(num1);
    }

    public void ia2(View view)
    {
        num1+=2;
        display1(num1);
    }

    public void ia1(View view)
    {
        num1+=1;
        display1(num1);
    }

    public void reset(View view)
    {
        num=0;
        num1=0;
        display(num);
        display1(num1);
    }
}
