package com.sentaroh.android.KickSMBSync2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        Intent in=new Intent("com.sentaroh.android.SMBSync2.ACTION_START_SYNC");
        sendBroadcast(in,null);

        finish();
    }
}
