package com.example.e_commerse;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;

import com.example.e_commerse.adapter.catalogoAdapter;

import java.util.ArrayList;

public class Catalogo extends AppCompatActivity {

    public String nombrecatalogo;
    public Drawable menu;
    private RecyclerView listaCatalogoRecyclerView;
    private ArrayList<catalogo1> catalogos;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);
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
        catalogoAdapter adapterItemCliente = new catalogoAdapter(catalogos, this);
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
        catalogos = new ArrayList<catalogo1>();
        catalogos.add(new catalogo1("PANDERIA", getDrawable(R.drawable.panaderia)));
        catalogos.add(new catalogo1("CARNES Y EMBUTIDOS", getDrawable(R.drawable.carnes_carnes)));
        catalogos.add(new catalogo1("ABARROTES", getDrawable(R.drawable.abarrotes_abarrotes)));
        catalogos.add(new catalogo1("PRODUCTOS PARA BEBE", getDrawable(R.drawable.productosparabebe_bebe)));
        catalogos.add(new catalogo1("REFRIGERADOS", getDrawable(R.drawable.refrigeradosycongelados)));
        catalogos.add(new catalogo1("BEBIDAS", getDrawable(R.drawable.bebidas_bebidas)));
        catalogos.add(new catalogo1("SALUD Y BELLEZA", getDrawable(R.drawable.cuidadopersonalybellesa_bellesa)));
        catalogos.add(new catalogo1("CUIDADOS PARA EL HOGAR", getDrawable(R.drawable.cuidadodelhogar)));
        /***
         *
         *
         * llenar catalogo
         */
    }
}