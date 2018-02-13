KickSMBSync2

このアプリケーションはSMBSync2を起動するだけのアプリです。
起動方法はSMBSync2のショートカットと同じ方法です、ショートカットが使用できない場合にご使用ください。

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        Intent in=new Intent("com.sentaroh.android.SMBSync2.ACTION_START_SYNC");
        sendBroadcast(in,null);

        finish();
    }
}
