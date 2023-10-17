package com.example.aplicacionprogramacion23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void incrementarContador(View vista){
         contador++;
         mostrarResultado();
    }

    public void decrementarContador(View vista){
        contador--;
        mostrarResultado();
    }
    public void resetearContador(View vista){

        EditText valor = (EditText) findViewById(R.id.editTextNumber);

        try {
            int numero = Integer.parseInt(valor.getText().toString());
            contador = numero;
        }catch (NumberFormatException e){
            contador = 0;
        }


        mostrarResultado();
    }

    private void mostrarResultado() {
        TextView textoResultado = findViewById(R.id.contadorTexto);
        textoResultado.setText("" + contador);
    }
}