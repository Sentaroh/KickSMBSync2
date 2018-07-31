package com.sentaroh.android.KickSMBSync2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_transrucent);
    }

    final public void onResume() {
        super.onResume();
        final Context c=this;
        Handler hndl=new Handler();
        hndl.postDelayed(new Runnable() {
            @Override
            public void run() {
                final PackageManager pm = getPackageManager();
                Intent inx=pm.getLaunchIntentForPackage("com.sentaroh.android.SMBSync2");
                if (inx!=null) {
                    Intent in=new Intent("com.sentaroh.android.SMBSync2.ACTION_START_SYNC");
                    if (Build.VERSION.SDK_INT>=26) {
                        try {
                            in.setClassName("com.sentaroh.android.SMBSync2", "com.sentaroh.android.SMBSync2.SyncReceiver");
//                            startActivity(in);
                            sendBroadcast(in);
                        } catch(Exception e) {
                            Toast.makeText(c, c.getString(R.string.smbsync2_ver_150_missing), Toast.LENGTH_LONG).show();
                        }
                    } else {
                        sendBroadcast(in,null);
                    }
                } else {
                    //SMBSync2 was missing
                    Toast.makeText(c, c.getString(R.string.smbsync2_missing), Toast.LENGTH_LONG).show();
                }
                finish();
            }
        }, 0);
    }

}
