package com.example.avdey.multithreading;

import android.content.Intent;
import android.opengl.Visibility;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private Button bt;
    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textView);
        bt = findViewById(R.id.button);
        progressBar = findViewById(R.id.progressBar);


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*bt.setEnabled(false);
                progressBar.setVisibility(View.VISIBLE);
                tv.setText(R.string.Loading);*/

                Intent intent = new Intent(MainActivity.this, CountService.class);
                startService(intent);

                    bt.setEnabled(true);
                    tv.setText(R.string.Ready);
                    progressBar.setVisibility(View.GONE);
                    stopService(intent);




            }
        });

    }



}
