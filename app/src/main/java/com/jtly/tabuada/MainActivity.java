package com.jtly.tabuada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private TextView resultado;
    private EditText valor;
    private Button calcular;
    //private int[] tabuada = new int[10];
    private String[] tabuada = new String[11];
    private String v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = findViewById(R.id.txtResultado);
        valor = findViewById(R.id.edtValor);
        calcular = findViewById(R.id.btnCalcular);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v = valor.getText().toString();
                if (v.isEmpty()){
                    Toast.makeText(MainActivity.this, "Digite um valor para começar!", Toast.LENGTH_SHORT).show();
                }else if ( v.length() >= 10){
                    Toast.makeText(MainActivity.this, "Impossível calcular!!", Toast.LENGTH_SHORT).show();
                }else{
                    calculatTabuada();
                }

            }
        });

    }

    private void calculatTabuada(){
       v = valor.getText().toString();
        tabuada[0] = String.valueOf(Integer.parseInt(v) * 0);
        tabuada[1] = String.valueOf(Integer.parseInt(v) * 1);
        tabuada[2] = String.valueOf(Integer.parseInt(v) * 2);
        tabuada[3] = String.valueOf(Integer.parseInt(v) * 3);
        tabuada[4] = String.valueOf(Integer.parseInt(v) * 4);
        tabuada[5] = String.valueOf(Integer.parseInt(v) * 5);
        tabuada[6] = String.valueOf(Integer.parseInt(v) * 6);
        tabuada[7] = String.valueOf(Integer.parseInt(v) * 7);
        tabuada[8] = String.valueOf(Integer.parseInt(v) * 8);
        tabuada[9] = String.valueOf(Integer.parseInt(v) * 9);
        tabuada[10] = String.valueOf(Integer.parseInt(v) * 10);

        resultado.setText("  0 X "+v+ " = " + tabuada[0]+"\n"+
                "  1 X "+v+ " = " + tabuada[1]+"\n"+
                "  2 X "+v+ " = " + tabuada[2]+"\n"+
                "  3 X "+v+ " = " + tabuada[3]+"\n"+
                "  4 X "+v+ " = " + tabuada[4]+"\n"+
                "  5 X "+v+ " = " + tabuada[5]+"\n"+
                "  6 X "+v+ " = " + tabuada[6]+"\n"+
                "  7 X "+v+ " = " + tabuada[7]+"\n"+
                "  8 X "+v+ " = " + tabuada[8]+"\n"+
                "  9 X "+v+ " = " + tabuada[9]+"\n"+
                "10 X "+v+ " = " + tabuada[10]+"\n");
    }

}
