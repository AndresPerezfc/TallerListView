package com.example.tallerlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class ListarOperaciones extends AppCompatActivity {
    private TableLayout tabla;
    private ArrayList<Operaciones> operaciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_operaciones);

        tabla = findViewById(R.id.tblOperaciones);
        operaciones = Datos.obtener();

        for (int i = 0; i < operaciones.size() ; i++) {
            TableRow fila = new TableRow(this);

            TextView columna_uno = new TextView(this);
            TextView columna_dos = new TextView(this);
            TextView columna_tres = new TextView(this);
            TextView columna_cuatro = new TextView(this);

            columna_uno.setText("" + (i+1));
            columna_dos.setText(operaciones.get(i).getNombre_operacion());
            String valorrlado = Integer.toString(operaciones.get(i).getVlado());
            if(valorrlado != null){
                columna_tres.setText("Lado:" + operaciones.get(i).getVlado());
            }else{
            columna_tres.setText("radio:" + operaciones.get(i).getRadio() + "\n" + "Altura: " + operaciones.get(i).getAltura());
        }

            columna_cuatro.setText("resultado: " + operaciones.get(i).getResultado());

            fila.addView(columna_uno);
            fila.addView(columna_dos);
            fila.addView(columna_tres);
            fila.addView(columna_cuatro);

            tabla.addView(fila);

        }
    }
}
