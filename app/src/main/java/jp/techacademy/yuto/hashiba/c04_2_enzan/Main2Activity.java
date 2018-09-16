package jp.techacademy.yuto.hashiba.c04_2_enzan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textViewXX = (TextView) findViewById(R.id.textViewXX);

        Intent intent = getIntent();
        int value1 = intent.getIntExtra("VALUE1", 0);
        int value2 = intent.getIntExtra("VALUE2", 0);
        int value3 = intent.getIntExtra("VALUE3", 0);


        textViewXX.setText("取得した値は"+String.valueOf(value1) +"と"+ String.valueOf(value2)+"で、計算結果は"+ String.valueOf(value3));


    }
}
