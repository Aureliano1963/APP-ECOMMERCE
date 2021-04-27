package com.example.e_commerse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Coomentarios extends AppCompatActivity {
Button btn_enviar;
EditText editTextTextPersonName2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coomentarios);
        btn_enviar = findViewById(R.id.btn_enviar);


        btn_enviar.setOnClickListener (new View.OnClickListener() { // asi esta bien debe ser error del IDE EJECUTELO A VER ahorita ko ejecuto
            @Override
            public void onClick(View v) {
                //EditText vacìo.

                editTextTextPersonName2.setText("");
              //esperame miro el codigo

                Toast.makeText(getApplicationContext(),"MUCHISIMAS GRACIAS",Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"TUS OPINIONES SON IMPORTANTES PARA NOSOTROS",Toast.LENGTH_SHORT).show();
                //aqui pegas el codigo para abrir la otra activity
                // startActivity(new Intent(Pago.this,Coomentarios.class));
                // finish();
                startActivity(new Intent(Coomentarios.this,Bienvenidos.class));
                finish();

//si ya sale amigo solo le agregare un evento mas q me envie  a una nueva actividad desde el mismo si


            }
        });
    }
}