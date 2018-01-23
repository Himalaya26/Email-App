package com.example.asha.email;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2,et3;
    Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1= findViewById(R.id.b1);
        et1= findViewById(R.id.e1);
        et2= findViewById(R.id.e2);
        et3=findViewById(R.id.e3);
    }


        public void send(View view){
            String to=et1.getText().toString();
            String subject=et2.getText().toString();
            String message=et3.getText().toString();

            Intent emailIntent=new Intent(Intent.ACTION_SEND);
                    emailIntent.setData(Uri.parse("mailTo:"));
            emailIntent.setType("text/plain");
            emailIntent.putExtra(Intent.EXTRA_EMAIL, to);
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
            emailIntent.putExtra(Intent.EXTRA_TEXT, message);
            startActivity(emailIntent);
    }
}
