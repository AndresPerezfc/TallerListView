package com.example.tallerlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Cubo extends AppCompatActivity {

    private EditText valor_arista;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubo);

        valor_arista = findViewById(R.id.txtArista);
        resultado = findViewById(R.id.txtRCubo);
    }

    public void calcularCubo(View v){
        int arista;
        double darista, volumen;
        String nombre_operacion = getString(R.string.volumen_cubo);
        Operaciones operacion;

        if(validar()) {
            arista = Integer.parseInt(valor_arista.getText().toString());
            darista = arista;
            volumen = (Math.pow(darista,3));
            operacion = new Operaciones(nombre_operacion, arista, (int)volumen);
            operacion.guardar();
            resultado.setText("" + volumen);
        }
    }

    public void limpiar(View v){
        valor_arista.setText("");
        resultado.setText("");
        valor_arista.requestFocus();
    }

    public boolean validar(){
        String error_valor;

        int op;

        error_valor = getResources().getString(R.string.error_valor);

        if(valor_arista.getText().toString().isEmpty()){
            valor_arista.setError(error_valor);
            valor_arista.requestFocus();
            return false;
        }

        return true;
    }
}
