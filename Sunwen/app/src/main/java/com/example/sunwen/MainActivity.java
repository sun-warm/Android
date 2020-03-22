package com.example.sunwen;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int size = 20;

    public void bigger(View v) {
        TextView txv;
        txv = (TextView) findViewById(R.id.txv);
        txv.setTextSize(++size);

        Log.d("MainActivity", "字体放大");
    }


}