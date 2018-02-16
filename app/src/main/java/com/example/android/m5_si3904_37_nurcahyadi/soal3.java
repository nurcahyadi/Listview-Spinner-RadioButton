package com.example.android.m5_si3904_37_nurcahyadi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class soal3 extends AppCompatActivity {
    ListView list;

    String[] itemname = {
            "1. Kalkulator Konversi",
            "2. Currency Converter"


    };
    Button mKeluar;
    TextView mNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal3);

        mKeluar=findViewById(R.id.button_keluar);
        mNama = findViewById(R.id.namausername);
        Intent a = getIntent();
        final String b = a.getStringExtra("username");
        mNama.setText(b);



        AdapterListview adapter = new AdapterListview(this, itemname);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                //String Slecteditem = itemname[+position];
                // Toast.makeText(getApplicationContext(), "selamat datang", Toast.LENGTH_SHORT).show();
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), soal4.class);
                    myIntent.putExtra("namauname",b);
                    String namakalku = itemname[position];
                    myIntent.putExtra("namakalkulator",namakalku);
                    startActivityForResult(myIntent, 0);

                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), soal5.class);
                    myIntent.putExtra("namauname",b);
                    String namacuren = itemname[position];
                    myIntent.putExtra("namacurrency",namacuren);
                    startActivityForResult(myIntent, 1);
                }

            }
        });

        mKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(soal3.this,login.class);
                startActivity(a);
            }
        });
    }
}
