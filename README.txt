KickSMBSync2

���̃A�v���P�[�V������SMBSync2���N�����邾���̃A�v���ł��B
�N�����@��SMBSync2�̃V���[�g�J�b�g�Ɠ������@�ł��A�V���[�g�J�b�g���g�p�ł��Ȃ��ꍇ�ɂ��g�p���������B

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
