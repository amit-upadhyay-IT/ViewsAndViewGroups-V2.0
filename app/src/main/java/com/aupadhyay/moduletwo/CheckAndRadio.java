package com.aupadhyay.moduletwo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class CheckAndRadio extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, RadioGroup.OnCheckedChangeListener {

    private CheckBox puneCheckBox, delhiCheckBox, buxarCheckBox;
    private RadioGroup radioGroup;

    public void initCheckBox()
    {
        puneCheckBox = (CheckBox) findViewById(R.id.puneCheckBox);
        delhiCheckBox = (CheckBox) findViewById(R.id.delhiCheckBox);
        buxarCheckBox = (CheckBox) findViewById(R.id.buxarCheckBox);

        puneCheckBox.setOnCheckedChangeListener(this);
        delhiCheckBox.setOnCheckedChangeListener(this);
        buxarCheckBox.setOnCheckedChangeListener(this);
    }

    public void initRadioGroup()
    {
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkradio);

        initCheckBox();
        initRadioGroup();
    }

    /**
     * Called when the checked state of a compound button has changed.
     *
     * @param buttonView The compound button view whose state has changed.
     * @param isChecked  The new checked state of buttonView.
     */

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        String msg = "The city ";

        switch (buttonView.getId())
        {
            case R.id.puneCheckBox:
                msg = msg + buttonView.getText().toString()+" ";
                break;
            case R.id.delhiCheckBox:
                msg = msg + buttonView.getText().toString()+" ";
                break;
            case R.id.buxarCheckBox:
                msg = msg + buttonView.getText().toString()+" ";
                break;
        }
        msg = msg + (isChecked?"Checked":"Unchecked");
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    /**
     * <p>Called when the checked radio button has changed. When the
     * selection is cleared, checkedId is -1.</p>
     *
     * @param group     the group in which the checked radio button has changed
     * @param checkedId the unique identifier of the newly checked radio button
     */
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        switch (checkedId)
        {
            case R.id.below15RB:
                Toast.makeText(this, "Enjoy a lot and play physical games", Toast.LENGTH_LONG).show();
                break;
            case R.id.between15and22RB:
                Toast.makeText(this, "Study hard with little enjoyment", Toast.LENGTH_LONG).show();
                break;
            case R.id.between22and28RB:
                Toast.makeText(this, "Catch a job you like and perform very well there", Toast.LENGTH_LONG).show();
                break;
            case R.id.between28and40RB:
                Toast.makeText(this, "Behave like a boss and think about doing BIG", Toast.LENGTH_LONG).show();
                break;
            case R.id.above40RB:
                Toast.makeText(this, "Observe this world deelpy and enjoy it in different way", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
