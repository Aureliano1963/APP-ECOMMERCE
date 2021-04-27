package com.example.e_commerse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Bienvenidos extends AppCompatActivity {

    Button ir_login;
    TextView tvlog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenidos);
        tvlog=(TextView)findViewById(R.id.tvlogin);

        ir_login=findViewById(R.id.ir_login);
        ir_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Bienvenidos.this,Login.class));
                finish();
            }
        });
        tvlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Bienvenidos.this, Registro_Cliente.class);
                startActivity(intent);
            }
        });
    }
}