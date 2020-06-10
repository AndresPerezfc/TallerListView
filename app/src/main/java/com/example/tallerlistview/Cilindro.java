package com.example.tallerlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Cilindro extends AppCompatActivity {

    private EditText valor_radio, valor_altura;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cilindro);

        valor_radio = findViewById(R.id.txtRadio);
        valor_altura = findViewById(R.id.txtAltura);
        resultado = findViewById(R.id.txtRCilindro);
    }

    public void calcularCilindro(View v){
        int radio, altura;
        double dRadio, volumen;
        String nombre_operacion = getString(R.string.volumen_cilindro);
        Operaciones operacion;

        if(validar()) {
            radio = Integer.parseInt(valor_radio.getText().toString());
            altura = Integer.parseInt(valor_altura.getText().toString());
            dRadio = radio;
            volumen = (3.14)*(Math.pow(dRadio,2))* altura;
            operacion = new Operaciones(nombre_operacion, radio, altura, (int)volumen);
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
        }else if(valor_altura.getText().toString().isEmpty()){
            valor_altura.setError(error_valor);
            valor_altura.requestFocus();
            return false;
        }

        return true;
    }
}
