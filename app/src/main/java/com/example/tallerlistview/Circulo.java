package com.example.tallerlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Circulo extends AppCompatActivity {

    private EditText valor_radio;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);

        valor_radio = findViewById(R.id.txtRadio);
        resultado = findViewById(R.id.txtRCirculo);
    }

    public void calcularCirculo(View v){
        int radio;
        double dRadio, area;
        String nombre_operacion = getString(R.string.area_circulo);
        Operaciones operacion;

        if(validar()) {
            radio = Integer.parseInt(valor_radio.getText().toString());
            dRadio = radio;
            area = (3.14)*(Math.pow(dRadio,2));
            operacion = new Operaciones(nombre_operacion, radio, (int)area);
            operacion.guardar();
            resultado.setText("" + area);
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
