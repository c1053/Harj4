package com.example.harj4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button button = (Button) findViewById(R.id.button);
        //final LinearLayout layout = (LinearLayout) findViewById(R.id.layout);
        final EditText editText = (EditText) findViewById(R.id.text);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getVisibility() == View.VISIBLE){
                    editText.setVisibility(View.GONE);
                } else {
                    editText.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
