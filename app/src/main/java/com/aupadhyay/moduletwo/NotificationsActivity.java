package com.aupadhyay.moduletwo;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;

public class NotificationsActivity extends AppCompatActivity implements View.OnClickListener {

    Button normalNotificationButton, bigStyleNotification;

    public void initNotification()
    {
        normalNotificationButton = (Button) findViewById(R.id.normalNotificationButton);
        bigStyleNotification = (Button) findViewById(R.id.bigStyleNotificationButton);
        normalNotificationButton.setOnClickListener(this);
        bigStyleNotification.setOnClickListener(this);

    }

    public void setNormalNotificationButton()
    {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setSmallIcon(R.drawable.mypic);
        builder.setContentTitle("Simple Notification");
        builder.setContentText("This is example of simple style notification");

        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(1, builder.build());
    }

    public void setBigStyleNotification()
    {
        String message = "This is an example of Big Style Notification and this is introduced in deviced with android " +
                "version more that 4.0";
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setSmallIcon(R.drawable.mypic);
        builder.setContentTitle("Big Style Notification");
        builder.setContentText(message);
        builder.setStyle(new NotificationCompat.BigTextStyle().bigText(message));
        builder.setDefaults(Notification.DEFAULT_ALL);
        builder.addAction(android.R.drawable.ic_menu_add,"Add",null);
        builder.addAction(android.R.drawable.ic_menu_close_clear_cancel,"Cancel",null);
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(2, builder.build());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);
        initNotification();
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.normalNotificationButton:
                setNormalNotificationButton();
                break;
            case R.id.bigStyleNotificationButton:
                setBigStyleNotification();
                break;
        }
    }
}
