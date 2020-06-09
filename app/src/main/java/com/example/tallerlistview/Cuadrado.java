package com.example.tallerlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Cuadrado extends AppCompatActivity {

    private EditText valor_lado;
    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);

    valor_lado = findViewById(R.id.txtLado);
    resultado = findViewById(R.id.txtResultado);
    }

    public void calcular(View v){
        int lado, area;
        String nombre_operacion = getString(R.string.area_cuadrado);
        Operaciones operacion;
        if(validar()) {
            lado = Integer.parseInt(valor_lado.getText().toString());
            area = lado * lado;
            operacion = new Operaciones(nombre_operacion, lado, area);
            operacion.guardar();
            resultado.setText("" + area);
        }
    }

    public void limpiar(View v){
        valor_lado.setText("");
        resultado.setText("");
        valor_lado.requestFocus();
    }

    public boolean validar(){
        String error_valor_lado;

        int op;

        error_valor_lado = getResources().getString(R.string.error_valor_lado);

        if(valor_lado.getText().toString().isEmpty()){
            valor_lado.setError(error_valor_lado);
            valor_lado.requestFocus();
            return false;
        }

        return true;
    }
}
