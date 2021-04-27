package com.example.e_commerse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.e_commerse.base.DatabaseHelper;

public class Login_Cliente extends AppCompatActivity {

    Button iniciar_sesion;
    TextView et_correo,et_contrasena;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__cliente);
        iniciar_sesion=findViewById(R.id.iniciar_sesion);
        final DatabaseHelper db = new DatabaseHelper(this);

        iniciar_sesion = (Button)findViewById(R.id.iniciar_sesion);
        et_correo = (EditText)findViewById(R.id.et_correo);
        et_contrasena = (EditText)findViewById(R.id.et_contrasena);

        iniciar_sesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(db.checkUser(et_correo.getText().toString(),et_contrasena.getText().toString())){
                    startActivity(new Intent(getApplicationContext(),Catalogo.class));
                }else
                    Toast.makeText(getApplicationContext(), "Usuario no existe", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
