package com.aupadhyay.moduletwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FragmentActivity extends AppCompatActivity implements LeftFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        LeftFragment leftFragment = LeftFragment.newInstance();
        getSupportFragmentManager().beginTransaction().replace(R.id.leftFragmentContainer, leftFragment).commit();
    }

    @Override
    public void onFragmentInteraction(int color) {
        RightFragment rightFragment = RightFragment.newInstance(color);
        getSupportFragmentManager().beginTransaction().replace(R.id.rightFragmentContainer, rightFragment).commit();
    }
}
