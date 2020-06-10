package com.example.tallerlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Triangulo extends AppCompatActivity {

    private EditText valor_base, valor_altura;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);

        valor_base = findViewById(R.id.txtBase);
        valor_altura = findViewById(R.id.txtAltura);
        resultado = findViewById(R.id.txtRTriangulo);
    }

    public void calcularTriangulo(View v){
        int base, altura, area;
        String nombre_operacion = getString(R.string.area_triangulo);
        Operaciones operacion;
        if(validar()) {
            base = Integer.parseInt(valor_base.getText().toString());
            altura = Integer.parseInt(valor_altura.getText().toString());
            area = ((base * altura)/(2));
            operacion = new Operaciones(nombre_operacion, base, altura, area);
            operacion.guardar();
            resultado.setText("" + area);
        }
    }

    public void limpiar(View v){
        valor_base.setText("");
        valor_altura.setText("");
        resultado.setText("");
        valor_base.requestFocus();
    }

    public boolean validar(){
        String error_valor;

        int op;

        error_valor = getResources().getString(R.string.error_valor);

        if(valor_base.getText().toString().isEmpty()){
            valor_base.setError(error_valor);
            valor_base.requestFocus();
            return false;
        }else if(valor_altura.getText().toString().isEmpty()){
            valor_altura.setError(error_valor);
            valor_altura.requestFocus();
            return false;
        }

        return true;
    }
}
