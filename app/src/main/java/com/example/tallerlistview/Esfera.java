package com.example.tallerlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Esfera extends AppCompatActivity {

    private EditText valor_radio;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfera);

        valor_radio = findViewById(R.id.txtRadio);
        resultado = findViewById(R.id.txtREsfera);
    }

    public void calcularEsfera(View v){
        int radio;
        double dRadio, volumen;
        String nombre_operacion = getString(R.string.volumen_esfera);
        Operaciones operacion;

        if(validar()) {
            radio = Integer.parseInt(valor_radio.getText().toString());
            dRadio = radio;
            volumen = ((4)*(3.14)*(Math.pow(dRadio,3)))/(3);
            operacion = new Operaciones(nombre_operacion, radio, (int)volumen);
            operacion.guardar();
            resultado.setText("" + volumen);
        }
    }

    public void limpiar(View v){
        valor_radio.setText("");
        resultado.setText("");
        valor_radio.requestFocus();
    }

    public boolean validar(){
        String error_valor;

        int op;

        error_valor = getResources().getString(R.string.error_valor);

        if(valor_radio.getText().toString().isEmpty()){
            valor_radio.setError(error_valor);
            valor_radio.requestFocus();
            return false;
        }

        return true;
    }
}
