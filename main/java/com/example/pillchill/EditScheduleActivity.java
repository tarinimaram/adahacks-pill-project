package com.example.pillchill;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Date;

public class EditScheduleActivity extends AppCompatActivity {

    TextView dateTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_schedule_activity);

        dateTitle = (TextView) findViewById(R.id.dateTitle);
        dateTitle.setText(get());

    }

    public String get()  {
        Bundle second = getIntent().getExtras();
        return new String (1 + second.getInt("Month") + "/" + second.getInt("Day") + "/" + second.getInt("Year"));
    }
}
