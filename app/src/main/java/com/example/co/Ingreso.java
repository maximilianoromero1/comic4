package com.example.co;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Ingreso extends AppCompatActivity {
    private EditText mEditTextName;
    private EditText mEditTextEmail;
    private EditText mEditTextRut;
    private Button  mButtonRegister;
    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditTextName = (EditText) findViewById(R.id.editTextName);
        mEditTextEmail = (EditText) findViewById(R.id.editTextEmail);
        mEditTextRut = (EditText) findViewById(R.id.editTextRut);

        mButtonRegister = (Button) findViewById(R.id.btnRegister);

        mButtonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}