package arksoft.com.sendingmessage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt=(TextView)findViewById(R.id.textView);
        btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence message=txt.getText();
                sendSms(message);
            }


        });

    }

    private void sendSms(CharSequence message) {

        Intent smsIntent=new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:05442095834"));
        smsIntent.putExtra("sms_body",message);
        startActivity(smsIntent);
    }


}
