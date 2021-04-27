package com.example.e_commerse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
ImageView lvimageView;
TextView tvlog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvlog=(TextView)findViewById(R.id.tvlogin);
        /*lvimageView=findViewById(R.id.lvimageView);
        lvimageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext().Bienvenidos.class);
                startActivity(i);
            }
        });*/

              tvlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Bienvenidos.class);
                startActivity(intent);
            }
        });
    }
}