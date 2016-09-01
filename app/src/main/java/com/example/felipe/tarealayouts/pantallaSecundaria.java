package com.example.felipe.tarealayouts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Felipe on 01-09-2016.
 */
public class pantallaSecundaria extends AppCompatActivity {

    Button botonVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_secundario);
    }

    public void volver(View view){
        Intent i = new Intent(this, pantallaInicio.class);
        startActivity(i);
    }
}
