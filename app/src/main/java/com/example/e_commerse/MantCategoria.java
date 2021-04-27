package com.example.e_commerse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MantCategoria extends AppCompatActivity {
    EditText etNama, etAlamat;
    Button btnSimpan, btnView, btnIr3;
    DatabaseHelper12 dbhelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mant_categoria);

        etNama = (EditText)findViewById(R.id.etNama);
        etAlamat = (EditText)findViewById(R.id.etAlamat);
        btnSimpan = (Button)findViewById(R.id.btnSimpan);
        btnView = (Button)findViewById(R.id.btnViewdata);
        btnSimpan.setOnClickListener(listener);
        btnView.setOnClickListener(listener);
        dbhelp = new DatabaseHelper12(this);
        btnIr3 = findViewById(R.id.btnIr3);

        btnIr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MantCategoria.this,MenuAdmin.class));
                finish();
            }
        });


    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btnSimpan:
                    dbhelp.insertData(etNama.getText().toString(), etAlamat.getText().toString());
                    Toast.makeText(getApplicationContext(), "Data Tersimpan", Toast.LENGTH_SHORT).show();
                    etNama.getText().clear();
                    etAlamat.getText().clear();
                    break;
                case R.id.btnViewdata:
                    startActivity(new Intent(MantCategoria.this, lista.class));
                    break;
            }



        }
    };

}
