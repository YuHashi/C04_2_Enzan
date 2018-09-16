package jp.techacademy.yuto.hashiba.c04_2_enzan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    EditText input01;
    EditText input02;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input01 = (EditText) findViewById(R.id.input01);
        input02 = (EditText) findViewById(R.id.input02);

        Button button1 = (Button) findViewById(R.id.PLUS);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("UI_PARTS", "PLUSボタンをタップしました");

                int input01i= Integer.parseInt(String.valueOf(input01.getText().toString()));
                int input02i= Integer.parseInt(String.valueOf(input02.getText().toString()));
                int output =input01i+input02i;
                Log.d("UI_PARTS", "Output作った");

                Intent intentX = new Intent(MainActivity.this, Main2Activity.class);
                Log.d("UI_PARTS", "Intent作った");

                intentX.putExtra("VALUE1", input01i);
                intentX.putExtra("VALUE2", input02i);
                intentX.putExtra("VALUE3", output);
                Log.d("UI_PARTS", "putExtra実行");

                startActivity(intentX);
            }
        });

        Button button2 = (Button) findViewById(R.id.MINUS);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("UI_PARTS", "MINUSボタンをタップしました");

                int input01i = Integer.parseInt(String.valueOf(input01.getText().toString()));
                int input02i = Integer.parseInt(String.valueOf(input02.getText().toString()));
                int output = input01i - input02i;
                Log.d("UI_PARTS", "Output作った");

                Intent intentX = new Intent(MainActivity.this, Main2Activity.class);
                Log.d("UI_PARTS", "Intent作った");

                intentX.putExtra("VALUE1", input01i);
                intentX.putExtra("VALUE2", input02i);
                intentX.putExtra("VALUE3", output);
                Log.d("UI_PARTS", "putExtra実行");

                startActivity(intentX);
            }
        });

        Button button3 = (Button) findViewById(R.id.KAKE);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("UI_PARTS", "KAKEボタンをタップしました");
                int input01i = Integer.parseInt(String.valueOf(input01.getText().toString()));
                int input02i = Integer.parseInt(String.valueOf(input02.getText().toString()));
                int output = input01i * input02i;
                Log.d("UI_PARTS", "Output作った");

                Intent intentX = new Intent(MainActivity.this, Main2Activity.class);
                Log.d("UI_PARTS", "Intent作った");

                intentX.putExtra("VALUE1", input01i);
                intentX.putExtra("VALUE2", input02i);
                intentX.putExtra("VALUE3", output);
                Log.d("UI_PARTS", "putExtra実行");

                startActivity(intentX);
            }
        });
        Button button4 = (Button) findViewById(R.id.WARU);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("UI_PARTS", "WARUボタンをタップしました");
                int input01i = Integer.parseInt(String.valueOf(input01.getText().toString()));
                int input02i = Integer.parseInt(String.valueOf(input02.getText().toString()));
                int output = input01i / input02i;
                Log.d("UI_PARTS", "Output作った");

                Intent intentX = new Intent(MainActivity.this, Main2Activity.class);
                Log.d("UI_PARTS", "Intent作った");

                intentX.putExtra("VALUE1", input01i);
                intentX.putExtra("VALUE2", input02i);
                intentX.putExtra("VALUE3", output);
                Log.d("UI_PARTS", "putExtra実行");

                startActivity(intentX);
            }
        });


    }
}
