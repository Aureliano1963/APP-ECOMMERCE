package com.example.e_commerse.nuevoadapter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.e_commerse.MainActivity2;
import com.example.e_commerse.R;
import com.example.e_commerse.compra;
import com.example.e_commerse.oferta;

import java.util.ArrayList;

public class ofertaAdapter extends  RecyclerView.Adapter<ofertaAdapter.ViewHolderDatos>{
private ArrayList<oferta> ofertas;
private Activity activity;
public int h;
public ofertaAdapter(ArrayList<oferta> ofertas, Activity activity) {
        this.ofertas = ofertas;
        this.activity = activity;
        }

@NonNull
@Override
public ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        view = LayoutInflater.from(viewGroup.getContext())
        .inflate(R.layout.oferta_adapter, null, false);
        return new ViewHolderDatos(view);
        }

private View view;

@Override
public void onBindViewHolder(@NonNull ViewHolderDatos viewHolderDatos, int i) {
        viewHolderDatos.setDatos(ofertas.get(i), this.activity);
        }

@Override
public int getItemCount() {
        return ofertas.size();
        }


public static class ViewHolderDatos extends RecyclerView.ViewHolder {
    private TextView catalogoTextView;
    private ImageView catalogoImageView;

    public ViewHolderDatos(@NonNull final View itemView) {
        super(itemView);
        catalogoTextView = itemView.findViewById(R.id.catalogoTextView);
        catalogoImageView = itemView.findViewById(R.id.catalogoImageView);

    }

    public void setDatos(final oferta ofertas, final Activity activity)
    {
        catalogoTextView.setText(ofertas.nombreoferta);
        catalogoImageView.setImageDrawable(ofertas.menu);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MainActivity2.class);
                // Create a bundle object
                Bundle b = new Bundle();
                //pasar datos a mi actividad llamada
                b.putString("oferta", ofertas.nombreoferta);
                // Add the bundle to the intent.
                intent.putExtras(b);

                // start the ResultActivity
                activity.startActivity(intent);
            }
        });
    }
}
}


