package com.aupadhyay.moduletwo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView cardView1, cardView2, cardView3, cardView4, cardView5, cardView6, cardView7, cardView8, cardView9, cardView10, cardView11;

    public void setCardViewElevation()
    {
        cardView1 = (CardView) findViewById(R.id.cardView1);
        cardView2 = (CardView) findViewById(R.id.cardView2);
        cardView3 = (CardView) findViewById(R.id.cardView3);
        cardView4 = (CardView) findViewById(R.id.cardView4);
        cardView5 = (CardView) findViewById(R.id.cardView5);
        cardView6 = (CardView) findViewById(R.id.cardView6);
        cardView7 = (CardView) findViewById(R.id.cardView7);
        cardView8 = (CardView) findViewById(R.id.cardView8);
        cardView9 = (CardView) findViewById(R.id.cardView9);
        cardView10 = (CardView) findViewById(R.id.cardView10);
        cardView11 = (CardView) findViewById(R.id.cardView11);

        cardView1.setCardElevation(15);
        cardView2.setCardElevation(15);
        cardView3.setCardElevation(15);
        cardView4.setCardElevation(15);
        cardView5.setCardElevation(15);
        cardView6.setCardElevation(15);
        cardView7.setCardElevation(15);
        cardView8.setCardElevation(15);
        cardView9.setCardElevation(15);
        cardView10.setCardElevation(15);
        cardView11.setCardElevation(15);
    }

    public void initCardView1() {   cardView1.setOnClickListener(this); }
    public void initCardView2() {   cardView2.setOnClickListener(this); }
    public void initCardView3() {   cardView3.setOnClickListener(this); }
    public void initCardView4() {   cardView4.setOnClickListener(this); }
    public void initCardView5() {   cardView5.setOnClickListener(this); }
    public void initCardView6() {   cardView6.setOnClickListener(this); }
    public void initCardView7() {   cardView7.setOnClickListener(this); }
    public void initCardView8() {   cardView8.setOnClickListener(this); }
    public void initCardView9() {   cardView9.setOnClickListener(this); }
    public void initCardView10(){   cardView10.setOnClickListener(this);}
    public void initCardView11(){   cardView11.setOnClickListener(this);}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setCardViewElevation();
        initCardView1();
        initCardView2();
        initCardView3();
        initCardView4();
        initCardView5();
        initCardView6();
        initCardView7();
        initCardView8();
        initCardView9();
        initCardView10();
        initCardView11();
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.cardView1:
                Toast.makeText(this, "This is prepared", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this, FrameActivity.class);
                startActivity(intent);
                break;
            case R.id.cardView2:
                Toast.makeText(this, "This is prepared", Toast.LENGTH_LONG).show();
                Intent intent1 = new Intent(this, TableActivity.class);
                startActivity(intent1);
                break;
            case R.id.cardView3:
                Toast.makeText(this, "This is prepared", Toast.LENGTH_LONG).show();
                Intent intent2 = new Intent(this, WebViewActivity.class);
                startActivity(intent2);
                break;
            case R.id.cardView4:
                Toast.makeText(this, "This is prepared", Toast.LENGTH_LONG).show();
                Intent intent3 = new Intent(this, CheckAndRadio.class);
                startActivity(intent3);
                break;
            case R.id.cardView5:
                Toast.makeText(this, "This is prepared", Toast.LENGTH_LONG).show();
                Intent intent4 = new Intent(this, SpinnerActivity.class);
                startActivity(intent4);
                break;
            case R.id.cardView6:
                Toast.makeText(this,"This is preapred", Toast.LENGTH_LONG).show();
                Intent intent5 = new Intent(this, AutoCompleteActivity.class);
                startActivity(intent5);
                break;
            case R.id.cardView7:
                Toast.makeText(this, "This activity itself is card view", Toast.LENGTH_LONG).show();
                break;
            case R.id.cardView8:
                Toast.makeText(this, "This is prepared", Toast.LENGTH_LONG).show();
                Intent intent6 = new Intent(this, DatePickerActivity.class);
                startActivity(intent6);
                break;
            case R.id.cardView9:
                Toast.makeText(this, "This is prepared", Toast.LENGTH_LONG).show();
                Intent intent7 = new Intent(this, TimePickerActivity.class);
                startActivity(intent7);
                break;
            case R.id.cardView10:
                Toast.makeText(this, "This is prepared", Toast.LENGTH_LONG).show();
                Intent intent8 = new Intent(this, NotificationsActivity.class);
                startActivity(intent8);
                break;
            case R.id.cardView11:
                Toast.makeText(this, "This is prepared", Toast.LENGTH_LONG).show();
                Intent intent9 = new Intent(this, FragmentActivity.class);
                startActivity(intent9);
                break;
            default:
                Toast.makeText(this, "This activity hasn't been prepared yet", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
