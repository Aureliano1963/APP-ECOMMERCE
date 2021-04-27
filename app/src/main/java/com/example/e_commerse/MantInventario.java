package com.example.e_commerse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class MantInventario extends AppCompatActivity {

    ArrayList<UsuarioInventario> listaUsuarios = new ArrayList<>();
    TableLayout tlTabla;

    TableRow fila;

    TextView tvUsuario, tvTelefono, tvEmail;

       // Button btnIr6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mant_inventario);
        //btnIr6 = findViewById(R.id.btnIr6);

       // btnIr6.setOnClickListener(new View.OnClickListener() {
          //  @Override
         //   public void onClick(View view) {
              //  startActivity(new Intent(MantInventario.this,MenuAdmin.class));
               // finish();
           // }
      //  });


        tlTabla = findViewById(R.id.tlTabla);

        listaUsuarios.add(new UsuarioInventario("Pan Frances", "120", "Abarrotes"));
        listaUsuarios.add(new UsuarioInventario("Aceite", "150", "Abarrotes"));
        listaUsuarios.add(new UsuarioInventario("Talco", "200", "Cuidado y Belleza"));
        listaUsuarios.add(new UsuarioInventario("Pescado", "99", "Congelados"));
        listaUsuarios.add(new UsuarioInventario("Pan Binbo", "120", "Abarrotes"));
        listaUsuarios.add(new UsuarioInventario("Aceite de Oliva", "150", "Abarrotes"));
        listaUsuarios.add(new UsuarioInventario("Talco", "200", "Cuidado y Belleza"));
        listaUsuarios.add(new UsuarioInventario("Conchas", "99", "Congelados"));
        listaUsuarios.add(new UsuarioInventario("Pan Lido", "120", "Abarrotes"));
        listaUsuarios.add(new UsuarioInventario("Aceite Vegetal", "150", "Abarrotes"));
        listaUsuarios.add(new UsuarioInventario("Pañales", "200", "Cuidado y Belleza"));
        listaUsuarios.add(new UsuarioInventario("Camaron", "99", "Congelados"));
        listaUsuarios.add(new UsuarioInventario("Peperechas", "120", "Abarrotes"));
        listaUsuarios.add(new UsuarioInventario("Margarina", "150", "Abarrotes"));
        listaUsuarios.add(new UsuarioInventario("Perfume", "200", "Cuidado y Belleza"));
        listaUsuarios.add(new UsuarioInventario("Pescado Seco", "99", "Congelados"));
        listaUsuarios.add(new UsuarioInventario("Pan Integral Binbo", "120", "Abarrotes"));
        listaUsuarios.add(new UsuarioInventario("Manteca", "150", "Abarrotes"));
        listaUsuarios.add(new UsuarioInventario("Pillamas", "200", "Cuidado y Belleza"));
        listaUsuarios.add(new UsuarioInventario("Jaibas", "99", "Congelados"));
        listaUsuarios.add(new UsuarioInventario("Pan Integral Lido", "120", "Abarrotes"));
        listaUsuarios.add(new UsuarioInventario("Aeite de Oliva", "150", "Abarrotes"));
        listaUsuarios.add(new UsuarioInventario("Pañales Humedos", "200", "Cuidado y Belleza"));
        listaUsuarios.add(new UsuarioInventario("Conchas", "99", "Congelados"));
        listaUsuarios.add(new UsuarioInventario("Pan Menudo", "120", "Abarrotes"));
        listaUsuarios.add(new UsuarioInventario("Arros", "150", "Abarrotes"));
        listaUsuarios.add(new UsuarioInventario("Aromas", "200", "Cuidado y Belleza"));
        listaUsuarios.add(new UsuarioInventario("Calamardos", "99", "Congelados"));

        TableRow.LayoutParams layoutFila = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT);
        TableRow.LayoutParams layoutUsuario = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT);
        TableRow.LayoutParams layoutTelefono = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT);
        TableRow.LayoutParams layoutEmail = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT);

        // TABLA
        for(int i = -1 ; i < listaUsuarios.size() ; i++) {
            fila = new TableRow(this);
            fila.setLayoutParams(layoutFila);

            if(i == -1) {
                tvUsuario = new TextView(this);
                tvUsuario.setText("PRODUCTOS");
                tvUsuario.setGravity(Gravity.CENTER);
                tvUsuario.setBackgroundColor(Color.BLACK);
                tvUsuario.setTextColor(Color.WHITE);
                tvUsuario.setPadding(5, 5, 5, 5);
                tvUsuario.setLayoutParams(layoutUsuario);
                fila.addView(tvUsuario);

                tvTelefono = new TextView(this);
                tvTelefono.setText("EXISTENCIAS");
                tvTelefono.setGravity(Gravity.CENTER);
                tvTelefono.setBackgroundColor(Color.BLACK);
                tvTelefono.setTextColor(Color.WHITE);
                tvTelefono.setPadding(5, 5, 5, 5);
                tvTelefono.setLayoutParams(layoutUsuario);
                fila.addView(tvTelefono);

                tvEmail = new TextView(this);
                tvEmail.setText("CATEGORIAS");
                tvEmail.setGravity(Gravity.CENTER);
                tvEmail.setBackgroundColor(Color.BLACK);
                tvEmail.setTextColor(Color.WHITE);
                tvEmail.setPadding(5, 5, 5, 5);
                tvEmail.setLayoutParams(layoutUsuario);
                fila.addView(tvEmail);

                tlTabla.addView(fila);
            } else {
                tvUsuario = new TextView(this);
                tvUsuario.setText(listaUsuarios.get(i).getUsuario());
                tvUsuario.setPadding(5, 5, 5, 5);
                tvUsuario.setLayoutParams(layoutUsuario);
                fila.addView(tvUsuario);

                tvTelefono = new TextView(this);
                tvTelefono.setGravity(Gravity.CENTER);
                tvTelefono.setText(listaUsuarios.get(i).getTelefono());
                tvTelefono.setPadding(5, 5, 5, 5);
                tvTelefono.setLayoutParams(layoutTelefono);
                fila.addView(tvTelefono);

                tvEmail = new TextView(this);
                tvEmail.setText(listaUsuarios.get(i).getEmail());
                tvEmail.setPadding(5, 5, 5, 5);
                tvEmail.setLayoutParams(layoutEmail);
                fila.addView(tvEmail);

                tlTabla.addView(fila);
            }
        }
    }
}
