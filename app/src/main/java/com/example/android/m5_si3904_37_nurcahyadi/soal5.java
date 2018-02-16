package com.example.android.m5_si3904_37_nurcahyadi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class soal5 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner sp;
    Spinner sp1;
    TextView mTampilC, mCurrency;
    Button mConvert, mKeluarC;
    EditText mCovert1, mConvert2;
    String pilih1,pilih2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal5);

        mTampilC = findViewById(R.id.namacurrency);
        mCurrency = findViewById(R.id.currencydibawahnama);
        sp = findViewById(R.id.spinnerkiri);
        sp1 = findViewById(R.id.spinnerkanan);
        mConvert = findViewById(R.id.btncurrency);
        mKeluarC = findViewById(R.id.btnkeluarC);


        Intent a = getIntent();
        String b = a.getStringExtra("namauname");
        String c = a.getStringExtra("namacurrency");

        mTampilC.setText(b);
        mCurrency.setText(c);



        mConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 pilih1 = sp.getSelectedItem().toString();
                 pilih2 = sp1.getSelectedItem().toString();
                mCovert1 = findViewById(R.id.enter1);
                mConvert2 = findViewById(R.id.enter2);

                if (mCovert1 != null) {

                    if (pilih1.equalsIgnoreCase("USD") && pilih2.equalsIgnoreCase("IDR")) {
                        String edt1 = mCovert1.getText().toString();
                        int ans = Integer.parseInt(edt1);
                        double hasil = ans * 14.285;
                        String hasil1 = String.valueOf(hasil);
                        mConvert2.setText(hasil1);
                    } else if (pilih1.equalsIgnoreCase("IDR") && pilih2.equalsIgnoreCase("USD")) {
                        String edt1 = mCovert1.getText().toString();
                        int ans = Integer.parseInt(edt1);
                        double hasil = ans * 0.00007;
                        String hasil1 = String.valueOf(hasil);
                        mConvert2.setText(hasil1);
                    } else if (pilih1.equalsIgnoreCase("USD") && pilih2.equalsIgnoreCase("USD")) {
                        String edt1 = mCovert1.getText().toString();
                        mConvert2.setText(edt1);
                    } else if (pilih1.equalsIgnoreCase("IDR") && pilih2.equalsIgnoreCase("IDR")) {
                        String edt1 = mCovert1.getText().toString();
                        mConvert2.setText(edt1);
                    }
                }
            }
        });

        mKeluarC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(soal5.this, login.class);
                startActivity(a);
            }
        });


    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
