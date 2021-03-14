package com.example.pillchill;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class ScheduleActivity extends AppCompatActivity {
    TextView dateTitle;
    int year1, month1, day1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schedule_activity);

        Button homeButton = (Button) findViewById(R.id.scheduleHomeButton);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScheduleActivity.this, MainActivity.class));
            }
        });

        CalendarView calendar = (CalendarView) findViewById(R.id.calendarView);
        dateTitle = (TextView) findViewById(R.id.dateTitle);
        calendar.setOnDateChangeListener(
                new CalendarView.OnDateChangeListener() {
                    @Override
                    public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int day) {
                        Bundle date = new Bundle();
                        date.putInt("Day", day);
                        date.putInt("Month", month);
                        date.putInt("Year", year);
                        year1 = year;
                        month1 = month;
                        day1 = day;
                        Intent in = new Intent(ScheduleActivity.this, EditScheduleActivity.class);
                        in.putExtras(date);
                        startActivity(in);
                        /*
                        String Date = (month1 + 1 ) + "/"
                                + (day1) + "/" + year1;

                        dateTitle.setText(Date);
                        */
                    }
                }
        );
    }
}
