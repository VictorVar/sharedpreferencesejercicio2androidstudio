package com.example.sharedprefeejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText nombre,apellido,email,telefono,whatsapp,direccion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre=findViewById(R.id.nombre);
        apellido=findViewById(R.id.apellido);
        email=findViewById(R.id.email);
        telefono=findViewById(R.id.telefono);
        whatsapp=findViewById(R.id.whatsapp);
        direccion=findViewById(R.id.direccion);
        SharedPreferences weas=getSharedPreferences("datos", Context.MODE_PRIVATE);
        nombre.setText(weas.getString("nombre",""));
        apellido.setText(weas.getString("apellido", ""));
        email.setText(weas.getString("email",""));
        telefono.setText(weas.getString("telefono",""));
        whatsapp.setText(weas.getString("whatsapp",""));
        direccion.setText(weas.getString("direccion",""));
    }
    public void suanfoson(View view){
        SharedPreferences cosas= getSharedPreferences("datos",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=cosas.edit();
        editor.putString("nombre",nombre.getText().toString());
        editor.putString("apellido",apellido.getText().toString());
        editor.putString("email",email.getText().toString());
        editor.putString("telefono",telefono.getText().toString());
        editor.putString("whatsapp",whatsapp.getText().toString());
        editor.putString("direccion",direccion.getText().toString());
        editor.commit();
        finish();
    }
}