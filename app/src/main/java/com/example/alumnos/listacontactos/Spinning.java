package com.example.alumnos.listacontactos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Spinning extends AppCompatActivity {
    String []mDatos;
    Spinner mSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinning);
        mDatos=getResources().getStringArray(R.array.datos);
        mSpinner=findViewById(R.id.spinner);

        ArrayAdapter<String> adaptadorSpinner=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,mDatos);
        mSpinner.setAdapter(adaptadorSpinner);

        mSpinner.setOnItemSelectedListener();

    }
}
