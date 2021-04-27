package com.example.e_commerse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class update extends AppCompatActivity {
    EditText etNama, etAlamat;
    Button btnSimpan;
    PesertaModel model;
    DatabaseHelper12 dbhelp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        etNama = (EditText)findViewById(R.id.etNama);
        etAlamat = (EditText)findViewById(R.id.etAlamat);
        btnSimpan = (Button)findViewById(R.id.btnSimpan);
        dbhelp = new DatabaseHelper12(this);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            model = dbhelp.getData(bundle.getInt("ID"));
            etNama.setText(model.getNama());
            etAlamat.setText(model.getAlamat());
        }
        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbhelp.updateData(model.getId(), etNama.getText().toString(), etAlamat.getText().toString());
                finish();
            }
        });
    }
}
