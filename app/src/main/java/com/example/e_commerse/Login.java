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

public class Login extends AppCompatActivity {

    Button btn_ir_crearCuenta,iniciar_sesion;
    TextView et_correo,et_contrasena;
    TextView tvlog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        iniciar_sesion=findViewById(R.id.iniciar_sesion);
        final DatabaseHelper db = new DatabaseHelper(this);
        tvlog=(TextView)findViewById(R.id.tvlogin);

        btn_ir_crearCuenta=findViewById(R.id.btn_enviar);
        iniciar_sesion=findViewById(R.id.iniciar_sesion);

        iniciar_sesion = (Button)findViewById(R.id.iniciar_sesion);
        et_correo = (EditText)findViewById(R.id.et_correo);
        et_contrasena = (EditText)findViewById(R.id.et_contrasena);

        tvlog=(TextView)findViewById(R.id.tvlogin);

        btn_ir_crearCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login.this,sign_up.class));
                finish();
            }
        });

        iniciar_sesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(db.checkUser(et_correo.getText().toString(),et_contrasena.getText().toString())){
                    startActivity(new Intent(getApplicationContext(),MenuAdmin.class));
                }else
                    Toast.makeText(getApplicationContext(), "Usuario no existe", Toast.LENGTH_SHORT).show();
            }
        });
        tvlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, Registro_Cliente.class);
                startActivity(intent);
            }
        });
    }
}
