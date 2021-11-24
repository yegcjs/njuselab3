package com.michaldabski.filemanager;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.michaldabski.filemanager.about.AboutActivity;

public class feedback extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
    }

    public void sendEmail(View v)
    {
        //Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
        //emailIntent.setData(Uri.parse("mailto:"+FEEDBACK_ADDRESS));
        //emailIntent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.app_name)+" feedback");
        //startActivity(emailIntent);
        Intent aboutAcitvity = new Intent(getApplicationContext(), AboutActivity.class);
        startActivity(aboutAcitvity);
    }
}
