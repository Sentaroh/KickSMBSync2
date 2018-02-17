package com.sentaroh.android.KickSMBSync2;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        final PackageManager pm = getPackageManager();
        Intent inx=pm.getLaunchIntentForPackage("com.sentaroh.android.SMBSync2");
        if (inx!=null) {
            Intent in=new Intent("com.sentaroh.android.SMBSync2.ACTION_START_SYNC");
            sendBroadcast(in,null);
        } else {
            //SMBSync2 was missing
            Toast.makeText(this, getString(R.string.smbsync2_missing), Toast.LENGTH_LONG).show();
        }
        finish();
    }
}
