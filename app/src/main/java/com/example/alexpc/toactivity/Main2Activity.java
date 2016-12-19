package com.example.alexpc.toactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button boton2 = (Button) findViewById(R.id.btnActivity1);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Aquí el código de la aplicacion o lo declaras en una clase separada con extension onclick
                Intent toActivity1 = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(toActivity1);
            }
        });
    }
}
