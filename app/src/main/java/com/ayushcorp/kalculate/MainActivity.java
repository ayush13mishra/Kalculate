package com.ayushcorp.kalculate;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.ayushcorp.kalculate.R.id.equal;
import static com.ayushcorp.kalculate.R.id.monitor;
import static com.ayushcorp.kalculate.R.id.one;

public class MainActivity extends AppCompatActivity {

    double a,b; //operands
    char operator;
    double result;
    TextView mTextMessage;
    boolean newvalue=false;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         final TextView monitor = (TextView) findViewById(R.id.monitor);
         Button one = (Button) findViewById(R.id.one);
         Button two = (Button) findViewById(R.id.two);
         Button three = (Button) findViewById(R.id.three);
         Button four = (Button) findViewById(R.id.four);
         Button five = (Button) findViewById(R.id.five);
         Button six = (Button) findViewById(R.id.six);
         Button seven = (Button) findViewById(R.id.seven);
         Button eight = (Button) findViewById(R.id.eight);
         Button nine = (Button) findViewById(R.id.nine);
         Button zero = (Button) findViewById(R.id.zero);

        //functions
         Button plus = (Button) findViewById(R.id.plus);
         Button minus = (Button) findViewById(R.id.minus);
         Button multiply = (Button) findViewById(R.id.multiply);
         Button divide = (Button) findViewById(R.id.divide);


        Button equal = (Button) findViewById(R.id.equal);
        Button clear = (Button) findViewById(R.id.clear);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(newvalue==true)
                {
                    monitor.append("1");
                }

                else{
                    monitor.setText(monitor.getText().toString()+"1");
                }
                newvalue=false;
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(newvalue==true)
                {
                    monitor.append("2");
                }

                else{
                    monitor.setText(monitor.getText().toString()+"2");
                }
                newvalue=false;
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(newvalue==true)
                {
                    monitor.append("3");
                }

                else{
                    monitor.setText(monitor.getText().toString()+"3");
                }
                newvalue=false;
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(newvalue==true)
                {
                    monitor.append("4");
                }

                else{
                    monitor.setText(monitor.getText().toString()+"4");
                }
                newvalue=false;
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(newvalue==true)
                {
                    monitor.append("5");
                }

                else{
                    monitor.setText(monitor.getText().toString()+"5");
                }
                newvalue=false;
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(newvalue==true)
                {
                    monitor.append("6");
                }

                else{
                    monitor.setText(monitor.getText().toString()+"6");
                }
                newvalue=false;
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(newvalue==true)
                {
                    monitor.append("7");
                }

                else{
                    monitor.setText(monitor.getText().toString()+"7");
                }
                newvalue=false;
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(newvalue==true)
                {
                    monitor.append("8");
                }

                else{
                    monitor.setText(monitor.getText().toString()+"8");
                }
                newvalue=false;
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(newvalue==true)
                {
                    monitor.append("9");
                }

                else{
                    monitor.setText(monitor.getText().toString()+"9");
                }
                newvalue=false;
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(newvalue==true   )
                {
                    monitor.append("0");
                }

                else{
                    monitor.setText(monitor.getText().toString()+"0");
                }
                newvalue=false;
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Double.parseDouble(monitor.getText().toString());
                monitor.setText("");
                newvalue=true;
                operator='+';

        }});

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    a = Double.parseDouble(monitor.getText().toString());
                    monitor.setText("");
                    newvalue=true;
                    operator='-';
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    a = Double.parseDouble(monitor.getText().toString());
                    monitor.setText("");
                    newvalue=true;
                    operator='*';
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    a = Double.parseDouble(monitor.getText().toString());
                    monitor.setText("");
                    newvalue=true;
                    operator='/';
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b = Double.parseDouble(monitor.getText().toString());
                result=calculate(a,b,operator);
                monitor.setText(Double.toString(result));
            }
        });

        clear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                monitor.setText("");
                newvalue=true;
                result = 0 ;
                a=0;
                b=0;
            }
        });


    }
public double calculate(double a,double b,char c)
{
    switch (c){
        case'+':return a+b;

        case'-':return a-b;

        case'*':return a*b;

        case'/':return a/b;

        default:return 0;

    }
}


}