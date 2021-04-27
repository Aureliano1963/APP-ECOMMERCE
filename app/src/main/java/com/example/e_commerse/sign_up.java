package com.example.e_commerse;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.e_commerse.User.User;
import com.example.e_commerse.base.DatabaseHelper;

import java.util.ArrayList;

import Datos.ConexionSqLite;

public class sign_up extends AppCompatActivity {
    Button btn_ir_inicioSesion,crear_cuenta;
    private TextView et_nombre,et_telefono,et_correo,et_usuario,et_contrasena;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        btn_ir_inicioSesion=findViewById(R.id.btn_ir_inicioSesion);
        crear_cuenta=findViewById(R.id.crear_cuenta);

        et_nombre = findViewById(R.id.et_nombre);
        et_telefono = findViewById(R.id.et_telefono);
        et_correo = findViewById(R.id.et_correo);
        et_usuario = findViewById(R.id.et_usuario);
        et_contrasena = findViewById(R.id.et_contrasena);


        btn_ir_inicioSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(sign_up.this,Login.class));
                finish();

            }
        });
        crear_cuenta.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                try{
                    User user = new User();
                    user.setnombre(et_nombre.getText().toString());
                    user.settelefono(et_telefono.getText().toString());
                    user.setcorreo(et_correo.getText().toString());
                    user.setPassword(et_usuario.getText().toString());
                    user.setPassword1(et_contrasena.getText().toString());

                    DatabaseHelper db =  new DatabaseHelper(getApplicationContext());
                    db.addUser(user);
                    Toast.makeText(sign_up.this, "Registro Éxitoso", Toast.LENGTH_SHORT).show();
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });

    }
}

       /* btn_ir_inicioSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(sign_up.this,Login.class));
                finish();

            }
        });

        crear_cuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ConexionSqLite objConexion = new ConexionSqLite(getApplicationContext());
                SQLiteDatabase objBase = objConexion.getReadableDatabase();
                //Toast.makeText(sign_up.this, "Registrar Usuario", Toast.LENGTH_SHORT).show();
                //Aquí codigo

                String nombre = et_nombre.getText().toString();
                String telefono = et_telefono.getText().toString();
                String correo = et_correo.getText().toString();
                String usuario = et_usuario.getText().toString();
                String contraseña = et_contrasena.getText().toString();

                String Consultasql = "insert into TblUsuario (carnet,nombre,apellido,edad)" +
                        "values ('"+nombre+"','"+telefono+"','"+correo+"','"+usuario+"','"+contraseña+"')";
                Log.i("Query:",Consultasql);
                objBase.execSQL(Consultasql);
                Log.i("Mensaje insert:", "Usuario Registrado");

            }
        });
        public void MostrarRegistroUsuario(){
            ArrayList<String> lista = new ArrayList<>();
            ArrayAdapter adapter;

            ConexionSqLite objConexion = new ConexionSqLite(getApplicationContext());
            SQLiteDatabase objBase = objConexion.getWritableDatabase();
            String consulta = " select * from TblUsuario";
            Cursor datos = objBase.rawQuery(consulta, null);


            while (datos.moveToNext())
            {
                Log.i( "carnet : ",datos.getString(1));
                nombre.add(datos.getString(1));
            }
            adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_activated_1, lista);
            lvUsuario.setAdapter(adapter);*/

