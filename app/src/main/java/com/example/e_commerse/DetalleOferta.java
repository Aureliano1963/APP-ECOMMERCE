package com.example.e_commerse;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.e_commerse.adapter.catalogoAdapter;
import com.example.e_commerse.nuevoadapter.ofertaAdapter;

import java.util.ArrayList;

public class DetalleOferta extends AppCompatActivity {
    //Button tvlog;
   // TextView tvlog;
    Button btn_ir;
    public String nombreofertas;
    public Drawable menu;
    private RecyclerView listaCatalogoRecyclerView;
    private ArrayList<oferta> ofertas;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_oferta);
        btn_ir=findViewById(R.id.btn_ir);

        listaCatalogoRecyclerView = findViewById(R.id.listaCatalogoRecyclerView);
        cargarcatalogo1();
        cargarRecyclerView();
    }

    /*
    Cargar recycler view
     */

    private void cargarRecyclerView()
    {
        listaCatalogoRecyclerView.setLayoutManager(new GridLayoutManager(getBaseContext(),1));
        ofertaAdapter adapterItemCliente = new ofertaAdapter(ofertas, this);
        listaCatalogoRecyclerView.setAdapter(adapterItemCliente);
        listaCatalogoRecyclerView.setHasFixedSize(true);
    }

    /**
     * metodo para llenar los catalogo
     */
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @SuppressLint("UseCompatLoadingForDrawables")
    void cargarcatalogo1()
    {
        ofertas = new ArrayList<oferta>();
        ofertas.add(new oferta("PAN PARA TORREJAS   $1.50 C/U", getDrawable(R.drawable.tortas_torrejas)));
        ofertas.add(new oferta("PAN FRANCES SIMPLE  $1.00 C/U", getDrawable(R.drawable.pan_frances)));
        ofertas.add(new oferta("PAN BIMBO           $1.50 C/U", getDrawable(R.drawable.pan_binbo)));
        ofertas.add(new oferta("PAN CON AJO         $1.00 C/U", getDrawable(R.drawable.pan_ajo)));
        ofertas.add(new oferta("PAN DULCE ALMENAS   $0.35 C/U", getDrawable(R.drawable.pan_alemanas)));
        ofertas.add(new oferta("PAN INTEGRAL BIMBO  $1.75 C/U", getDrawable(R.drawable.integral_bimbo)));
        ofertas.add(new oferta("PAN DE CAJA LIDO    $1.60 C/U", getDrawable(R.drawable.pan_lido)));
        ofertas.add(new oferta("PAN MENUDO VARIEDAD $0.20 C/U", getDrawable(R.drawable.pan_menudo)));
        ofertas.add(new oferta("PAN SEMIRA          $0.50 C/U", getDrawable(R.drawable.semita)));
        ofertas.add(new oferta("GALLETA INTEGRAL    $0.75 C/U", getDrawable(R.drawable.galleta_trigo_lido)));
        ofertas.add(new oferta("PAN INTEGRAL LIDO   $0.50 C/U", getDrawable(R.drawable.pan_integral_lido)));
        ofertas.add(new oferta("PEPERECHAS          $0.20 C/U", getDrawable(R.drawable.peperechas)));

        /***
         *
         *
         * llenar catalogo
         */
        /***tvlog=(TextView)findViewById(R.id.tvlogin);
         tvlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetalleOferta.this, ofertas_nuevas.class);
                startActivity(intent);
            }
        }); */
        btn_ir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DetalleOferta.this,ofertas_nuevas.class));
                finish();
            }
        });
    }
}