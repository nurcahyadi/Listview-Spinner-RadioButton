package com.example.android.m5_si3904_37_nurcahyadi;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    EditText mUsername;
    EditText mPassword;
    Button mLogin,mCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        mUsername = findViewById(R.id.inputusername);
        mPassword = findViewById(R.id.inputpass);
        mLogin = findViewById(R.id.button_ok);
        mCancel =findViewById(R.id.button_cancel);


        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String usernameKey = mUsername.getText().toString();
                String passKey = mPassword.getText().toString();

                if (usernameKey.equals("nurcahyadi") && passKey.equals("1202154156")) {


                    AlertDialog.Builder a = new AlertDialog.Builder(login.this);
                    a.setMessage("Login Success !").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            Intent b = new Intent(login.this, soal3.class);
                            b.putExtra("username", usernameKey);
                            startActivity(b);
                        }

                    });
                    a.show();

                } else {
                    AlertDialog.Builder a = new AlertDialog.Builder(login.this);
                    a.setMessage("Login Fail !").setNegativeButton("OK", null).create().show();
//                    a.setPositiveButton("sdads",null).create().show();
                }
            }

        });

        mCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
