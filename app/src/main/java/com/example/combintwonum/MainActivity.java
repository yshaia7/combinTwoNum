package com.example.combintwonum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText firstB = findViewById(R.id.first_box);
        final EditText secB = findViewById(R.id.sec_box);

       Button buttonB = findViewById(R.id.btn_input);

        final TextView textV = findViewById(R.id.text_view);

        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fstNum = firstB.getText().toString();
                String secnum = secB.getText().toString();

                int res1 = Integer.parseInt(fstNum);
                int res2 = Integer.parseInt(secnum);
                int res = res1+ res2;
                textV.setText(res+ " ");

            }
        });
    }
}
