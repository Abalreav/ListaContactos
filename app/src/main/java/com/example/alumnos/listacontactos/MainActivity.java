package com.example.alumnos.listacontactos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OnClick(View v)
    {
        Intent Activitynew=new Intent(this,Lista.class);
        startActivity(Activitynew);
    }
    public void OnClick2(View v)
    {
        Intent Activitynew2=new Intent(this,Spinning.class);
        startActivity(Activitynew2);
    }
}
