package com.example.felipe.tarealayouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.TextView;

public class pantallaInicio extends AppCompatActivity {

    EditText texto;
    Button botonImagenes;
    Button botonVolver;
    GridLayout layout_secundario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_inicio);

        /**
        botonImagenes = (Button)findViewById(R.id.botonImagenes);
        botonImagenes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        }
        );
        */
    }

    public void lanzarPantallaSecundaria(View view){
        Intent i = new Intent(this, pantallaSecundaria.class);
        /**
        texto = (EditText) findViewById(R.id.campoTexto);
        String saludo = "Hola, " + texto.getText().toString();
        final TextView saludar = (TextView) findViewById(R.id.saludar);
        saludar.setText(saludo);
        */
        startActivity(i);
    }
}
