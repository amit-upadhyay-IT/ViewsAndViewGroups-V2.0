package com.aupadhyay.moduletwo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoCompleteActivity extends AppCompatActivity {

    private String []SUGGESTION = new String[]{"aaa", "bbb", "sss", "ccc", "ddd", "eee", "AAA","BBB", "CCC", "DDD", "EEE"};

    AutoCompleteTextView autoCompleteTextView;

    ArrayAdapter<String> arrayAdapter;

    public void initAutoCompleteTextView()
    {
        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line);
        arrayAdapter.addAll(SUGGESTION);

        autoCompleteTextView.setAdapter(arrayAdapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete);
        initAutoCompleteTextView();
    }
}
