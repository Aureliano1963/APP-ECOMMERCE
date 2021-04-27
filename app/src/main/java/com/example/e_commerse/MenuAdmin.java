package com.example.e_commerse;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MenuAdmin extends AppCompatActivity {
private Button btnIr;
private ImageView btnMenu1,btnMenu2,btnMenu3,btnMenu4,btnMenu5,btnMenu6;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_admin);
         btnIr = findViewById(R.id.btnIr);
        btnMenu1 = findViewById(R.id.btnMenu1);
        btnMenu2 = findViewById(R.id.btnMenu2);
        btnMenu3 = findViewById(R.id.btnMenu3);
        btnMenu4 = findViewById(R.id.btnMenu4);
        btnMenu5 = findViewById(R.id.btnMenu5);
        btnMenu6 = findViewById(R.id.btnMenu6);

      btnIr.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View view) {
               startActivity(new Intent(MenuAdmin.this,Portada.class));
               finish();
            }
        });

        btnMenu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuAdmin.this,MantProdcutos.class));
                finish();
            }
        });

        btnMenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuAdmin.this,MantInventario.class));
                finish();
            }
        });

        btnMenu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuAdmin.this,MantCategoria.class));
                finish();
            }
        });

        btnMenu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuAdmin.this,MantProveedores.class));
                finish();
            }
        });

        btnMenu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuAdmin.this,MantIngresos.class));
                finish();
            }
        });


        btnMenu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuAdmin.this,MantEgresos.class));
                finish();
            }
        });
    }
}