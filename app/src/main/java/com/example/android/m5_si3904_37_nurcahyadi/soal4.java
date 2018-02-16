package com.example.android.m5_si3904_37_nurcahyadi;

import android.content.DialogInterface;
import android.content.Intent;
import android.preference.DialogPreference;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class soal4 extends AppCompatActivity {

    TextView mTampil, mKolomnilai;
    TextView mKalkulator;
    Button mProses, mKeluar;
    RadioGroup mrd;
    RadioButton mtof, ftom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal4);


        mTampil = findViewById(R.id.namakalkulator);
        mKalkulator = findViewById(R.id.kalkulatordibawahnama);
        mtof = findViewById(R.id.mkef);
        ftom = findViewById(R.id.fkem);
        mKolomnilai = findViewById(R.id.kolomnilai);
        mProses = findViewById(R.id.btnproses);
        mKeluar = findViewById(R.id.btnkeluar);
        mrd = findViewById(R.id.radioGroupNb);


        Intent a = getIntent();
        String b = a.getStringExtra("namauname");
        String c = a.getStringExtra("namakalkulator");

        mTampil.setText(b);
        mKalkulator.setText(c);




        mProses.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                int selectedId = mrd.getCheckedRadioButtonId();
                String value = mKolomnilai.getText().toString();
                int b = Integer.valueOf(value);
                if (selectedId == mtof.getId()) {
                    Double aa = b * 3.28082;
                    AlertDialog.Builder a = new AlertDialog.Builder(soal4.this);
                    a.setMessage(+b + " Meter =" + aa + " Feet ").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });

                    a.show();
//                    Toast.makeText(getApplicationContext(),"Login Sukses...!!!",Toast.LENGTH_LONG).show();
                } else {
                    Double aa = b * 0.3048;
                    AlertDialog.Builder a = new AlertDialog.Builder(soal4.this);
                    a.setMessage(+b + " Meter =" + aa + " Feet ").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });

                    a.show();
                }
            }

        });

        mKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(soal4.this,login.class);
                startActivity(a);
            }
        });

    }
}
