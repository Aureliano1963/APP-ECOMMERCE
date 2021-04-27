package com.example.e_commerse;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//esta de lo que quiero ahcer
public class MantProdcutos extends AppCompatActivity {

    EditText editText_name,editText_email;
    Button button_add,button_view,btnIr2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mant_prodcutos);
        editText_name = findViewById(R.id.edittext_name);
        editText_email = findViewById(R.id.edittext_email);
        button_add = findViewById(R.id.button_add);
        button_view = findViewById(R.id.button_view);
        btnIr2 = findViewById(R.id.btnIr5);


        btnIr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MantProdcutos.this,MenuAdmin.class));
                finish();
            }
        });

        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringName = editText_name.getText().toString();
                String stringEmail = editText_email.getText().toString();

                if (stringName.length() <=0 || stringEmail.length() <=0){
                    Toast.makeText(MantProdcutos.this, "Enter All Data", Toast.LENGTH_SHORT).show();
                }else {
                    DatabaseHelperClass databaseHelperClass = new DatabaseHelperClass(MantProdcutos.this);
                    EmployeeModelClass employeeModelClass = new EmployeeModelClass(stringName,stringEmail);
                    databaseHelperClass.addEmployee(employeeModelClass);
                    Toast.makeText(MantProdcutos.this, "Add Employee Successfully", Toast.LENGTH_SHORT).show();
                    finish();
                    startActivity(getIntent());
                }
            }
        });
// AQUI ME MANDA EL ERROR , estas haciendo una lista de productos   si, con recyclerview si , para eso se necestia la lista , el adaptador y la clase principal tiene esos 3?

//ahi esta el adapter, y la lista?
        button_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MantProdcutos.this,ViewEmployeeActivity.class);
                startActivity(intent);
            }
        });


    }
}

