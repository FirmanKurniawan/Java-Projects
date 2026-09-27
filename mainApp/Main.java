package com.reyjunaaf.firgo;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton add, fabadd, fabhelp, fababout;
    TextView tvin,tvout,tvutama;
    DBHelper DB;
    RecyclerView lst1;
    ArrayList<UangModel> uanguang;
    UangAdaptor UangAdaptor;
    Boolean isAllFabsVisible;
    //public static final String nam=null,tel=null,ala = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvin = findViewById(R.id.tvIncome);
        tvout = findViewById(R.id.tvOutcome);
        tvutama = findViewById(R.id.tvUTAMA);
        lst1 = findViewById(R.id.lst1);
        add = findViewById(R.id.addbutton);
        fabadd = findViewById(R.id.FABadd);
        fabhelp = findViewById(R.id.FABHelp);
        fababout = findViewById(R.id.FABabout);
        uanguang = new ArrayList<>();
        UangAdaptor = new UangAdaptor(uanguang, this);
        lst1.setLayoutManager(new LinearLayoutManager(this));
        lst1.setAdapter(UangAdaptor);
        tampil();
        setnumber();
        openfab();
        isAllFabsVisible = false;
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isAllFabsVisible) {
                    fabadd.show();
                    fabhelp.show();
                    fababout.show();
                    fabadd.setVisibility(View.VISIBLE);
                    fabhelp.setVisibility(View.VISIBLE);
                    fababout.setVisibility(View.VISIBLE);
                    isAllFabsVisible = true;
                } else {
                    openfab();
                }

            }
        });
        fabadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Add.class);
                startActivity(i);
                MainActivity.this.finish();
            }
        });
        fabhelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),help.class);
                startActivity(i);
                MainActivity.this.finish();
            }
        });
        fababout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),about_app.class);
                startActivity(i);
                MainActivity.this.finish();
            }
        });
    }
    @Override
    protected void onResume() {
        setnumber();
        super.onResume();
    }
    private void openfab(){
        fabadd.hide();
        fabhelp.hide();
        fababout.hide();
        fabadd.setVisibility(View.GONE);
        fabhelp.setVisibility(View.GONE);
        fababout.setVisibility(View.GONE);
        isAllFabsVisible = false;
    }


    private void tampil() {
        DB = new DBHelper(this);
        Cursor c = DB.getdata();
        if (c.getCount() == 0) {
            Toast.makeText(MainActivity.this, "No Entry Exists", Toast.LENGTH_SHORT).show();
            return;
        } else  {
            while(c.moveToNext())
            {
                uanguang.add(new UangModel(c.getString(1),c.getString(2),c.getString(3),c.getString(4),c.getString(5),c.getString(0)));
            } UangAdaptor.notifyDataSetChanged();
        }
    }
    private void setnumber(){
        tvin.setText("Rp.  "+String.valueOf(DB.getMasuk()));
        tvout.setText("Rp.  "+String.valueOf(DB.getKeluar()));
        tvutama.setText("Rp. "+Integer.toString(DB.getMasuk()-DB.getKeluar()));
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
        MainActivity.this.finish();
    }
}