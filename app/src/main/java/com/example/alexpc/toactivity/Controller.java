package com.example.alexpc.toactivity;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

import static android.R.attr.onClick;

/**
 * Created by AlexPC on 19/12/2016.
 */

public class Controller extends Activity implements View.OnClickListener  {

    public Controller(){


    }
    @Override
    public void onClick(View v) {
        //TODO: add code here
        int seleccion = v.getId(); //Para obtener a que has clickado, con un elemento no hace falta puesto que siempre clickas el mismo

       if(seleccion == R.id.btnActivity2){
            Intent toActivity2 = new Intent(this, Main2Activity.class);
            startActivity(toActivity2);
        }

        if(seleccion == R.id.btnActivity2){
            Intent toActivity1 = new Intent (this, MainActivity.class);
            startActivity(toActivity1);

        }

    }


}
