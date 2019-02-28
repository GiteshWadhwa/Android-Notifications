package com.gitesh.wadhwa.mynotificationdemo;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doSomething(View view) {
        NotificationManagerCompat myManager=NotificationManagerCompat.from(this);
        NotificationCompat.Builder myNoti=new NotificationCompat.Builder(this);
        myNoti.setContentTitle("1 New Message");
        myNoti.setContentText("Hi How are u?");
        myNoti.setSmallIcon(android.R.drawable.ic_btn_speak_now);

        Intent i1=new Intent(this,MainActivity.class);
        PendingIntent pd=PendingIntent.getActivity(this,1,i1,0);
        myNoti.setContentIntent(pd);
        myNoti.setAutoCancel(true);
        myManager.notify(1,myNoti.build());
        finish();
    }
}
