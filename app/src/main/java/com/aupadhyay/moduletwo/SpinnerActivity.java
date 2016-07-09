package com.aupadhyay.moduletwo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    private String []YEARS = new String[]{"1965","1966","1967","1968","1969","1970","1971","1972","1973","1974","1975","1976","1977","1978","1979","1980","1981","1982","1983","1984","1985","1986","1987","1988","1989","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015"};
    private String []MONTHS = new String[]{"January","Feburary","March","April","May","June","July","August","September","October","November","December"};
    private String []DAYS_OF_MONTH = new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};

    private String date, month, year;
    private Button clickMeButton;

    ArrayAdapter<String> yearsAdapter, monthsAdapter, daysAdapter;
    private Spinner daySpinner, monthSpinner, yearSpinner;

    public void initSpinner()
    {
        yearsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        yearsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        monthsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        monthsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        daysAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        daysAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        yearsAdapter.add("Years"); monthsAdapter.add("Months"); daysAdapter.add("Date");

        yearsAdapter.addAll(YEARS);
        monthsAdapter.addAll(MONTHS);
        daysAdapter.addAll(DAYS_OF_MONTH);

        daySpinner = (Spinner) findViewById(R.id.dateSpinner);
        monthSpinner = (Spinner) findViewById(R.id.monthSpinner);
        yearSpinner = (Spinner) findViewById(R.id.yearSpinner);

        daySpinner.setAdapter(daysAdapter);
        monthSpinner.setAdapter(monthsAdapter);
        yearSpinner.setAdapter(yearsAdapter);

        daySpinner.setOnItemSelectedListener(this);
        monthSpinner.setOnItemSelectedListener(this);
        yearSpinner.setOnItemSelectedListener(this);
    }

    public void initButton()
    {
        clickMeButton = (Button) findViewById(R.id.clickMeButton);
        clickMeButton.setOnClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        initSpinner();
        initButton();
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {

        Toast.makeText(this, "Your DOB is "+date+"/"+month+"/"+year, Toast.LENGTH_LONG).show();
    }

    /**
     * <p>Callback method to be invoked when an item in this view has been
     * selected. This callback is invoked only when the newly selected
     * position is different from the previously selected position or if
     * there was no selected item.</p>
     * <p/>
     * Impelmenters can call getItemAtPosition(position) if they need to access the
     * data associated with the selected item.
     *
     * @param parent   The AdapterView where the selection happened
     * @param view     The view within the AdapterView that was clicked
     * @param position The position of the view in the adapter
     * @param id       The row id of the item that is selected
     */
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        switch (view.getId())
        {
            case R.id.dateSpinner:
                date = daysAdapter.getItem(position);
                break;
            case R.id.monthSpinner:
                month = monthsAdapter.getItem(position);
                break;
            case R.id.yearSpinner:
                year = yearsAdapter.getItem(position);
                break;
        }
    }

    /**
     * Callback method to be invoked when the selection disappears from this
     * view. The selection can disappear for instance when touch is activated
     * or when the adapter becomes empty.
     *
     * @param parent The AdapterView that now contains no selected item.
     */
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}