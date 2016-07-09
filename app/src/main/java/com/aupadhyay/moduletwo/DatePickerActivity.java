package com.aupadhyay.moduletwo;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import java.util.Calendar;
import java.util.Locale;

public class DatePickerActivity extends AppCompatActivity implements View.OnClickListener, DatePickerDialog.OnDateSetListener {

    private Button datePickerButton;
    private int date, month, year;

    public void initDatePickerDialog()
    {
        datePickerButton = (Button) findViewById(R.id.datePickerButton);

        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        date = calendar.get(Calendar.DAY_OF_MONTH);
        month = calendar.get(Calendar.MONTH);
        year = calendar.get(Calendar.YEAR);

        setCurrentDateOnButton(date, month, year);

    }

    public void setCurrentDateOnButton(int date, int month, int year)
    {
        datePickerButton.setText(String.valueOf(date)+"/"+String.valueOf(month+1)+"/"+ String.valueOf(year));
        datePickerButton.setOnClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datepicker);
        initDatePickerDialog();
    }

    @Override
    public void onClick(View v) {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, this, year, month, date);
        datePickerDialog.show();
    }

    /**
     * @param view        The view associated with this listener.
     * @param year        The year that was set.
     * @param monthOfYear The month that was set (0-11) for compatibility
     *                    with {@link Calendar}.
     * @param dayOfMonth  The day of the month that was set.
     */
    @Override
    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        setCurrentDateOnButton(dayOfMonth, monthOfYear, year);
    }
}
