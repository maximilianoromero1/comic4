package com.example.co;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pantalla2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        b3 = (Button) findViewById(R.id.button1);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clic();
            }
        });
    }
    private void clic(){
        Intent intentoa = new Intent(MainActivity.this,comic1.class);
        startActivity(intento);

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(spiderman1.pdf)); startActivity(browserIntent);

        Intent intentoa = new Intent(MainActivity.this,comic2.class);
        startActivity(intento);

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(spiderman2.pdf)); startActivity(browserIntent);
    }
}
