package com.example.alexpc.toactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boton1 = (Button) findViewById(R.id.btnActivity2);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Aquí el código de la aplicacion o lo declaras en una clase separada con extension onclick
                Intent toActivity2 = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(toActivity2);
            }
        });
    }



}
