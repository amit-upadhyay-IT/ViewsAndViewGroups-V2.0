package com.aupadhyay.moduletwo;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

import java.util.Calendar;
import java.util.Locale;

public class TimePickerActivity extends AppCompatActivity implements View.OnClickListener, TimePickerDialog.OnTimeSetListener {

    private Button timePickerDialog;
    private int hour, minute;

    public void initTimePickerDialog()
    {
        timePickerDialog = (Button) findViewById(R.id.timePickerButton);

        Calendar calendar = Calendar.getInstance(Locale.getDefault());

        hour = calendar.get(Calendar.HOUR_OF_DAY);
        minute = calendar.get(Calendar.MINUTE);

        setCurrentTimeOnButton(hour, minute);

        timePickerDialog.setOnClickListener(this);
    }

    public void setCurrentTimeOnButton(int hour, int minute)
    {
        timePickerDialog.setText(String.valueOf(hour)+":"+String.valueOf(minute));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timepicker);
        initTimePickerDialog();
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        TimePickerDialog timePickerDialog = new TimePickerDialog(this, this, hour, minute, true);
        timePickerDialog.show();
    }

    /**
     * Called when the user is done setting a new time and the dialog has
     * closed.
     *
     * @param view      the view associated with this listener
     * @param hourOfDay the hour that was set
     * @param minute    the minute that was set
     */
    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        setCurrentTimeOnButton(hourOfDay, minute);
    }
}
