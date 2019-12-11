package com.example.co;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clic();
            }
        });

        b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clic();
            }
        });

        b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clic();
            }
        });
    }

    private void clic(){
        Intent intento = new Intent(MainActivity.this,pantalla2.class);
        startActivity(intento);

        Intent intentoa = new Intent(MainActivity.this,mapa.class);
        startActivity(intento);

        Intent intentob = new Intent(MainActivity.this,Ingreso.class);
        startActivity(intento);

        /*EditText tx_R, tx_N;
        Button btn1;

        String nombre ="";
        String rut = "";*/

        @Override
        protected void onCreate(Bundle savedInstanceState){
            /*super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            tx_R = (EditText) findViewById(R.id.txt_run);
            tx_N = (EditText) findViewById(R.id.txt_nom);
            btn1 = (Button) findViewById(R.id.btn_1);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    nombre = tx_N.getText().toString();
                    rut = tx_R.getText().toString();
                }
            });
    }*/
}
