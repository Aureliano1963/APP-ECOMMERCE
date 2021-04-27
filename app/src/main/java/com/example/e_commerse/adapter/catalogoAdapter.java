package com.example.e_commerse.adapter;

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

import com.example.e_commerse.DetalleOferta;
import com.example.e_commerse.R;
import com.example.e_commerse.catalogo1;

import java.util.ArrayList;

public class catalogoAdapter extends  RecyclerView.Adapter<catalogoAdapter.ViewHolderDatos>{
    private ArrayList<catalogo1> catalogos;
    private Activity activity;
    public int h;
    public catalogoAdapter(ArrayList<catalogo1> catalogos, Activity activity) {
        this.catalogos = catalogos;
        this.activity = activity;
    }

    @NonNull
    @Override
    public ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.catalogo_adapter, null, false);
        return new ViewHolderDatos(view);
    }

    private View view;

    @Override
    public void onBindViewHolder(@NonNull ViewHolderDatos viewHolderDatos, int i) {
        viewHolderDatos.setDatos(catalogos.get(i), this.activity);
    }

    @Override
    public int getItemCount() {
        return catalogos.size();
    }


    public static class ViewHolderDatos extends RecyclerView.ViewHolder {
        private TextView catalogoTextView;
        private ImageView catalogoImageView;

        public ViewHolderDatos(@NonNull final View itemView) {
            super(itemView);
            catalogoTextView = itemView.findViewById(R.id.catalogoTextView);
            catalogoImageView = itemView.findViewById(R.id.catalogoImageView);

        }

        public void setDatos(final catalogo1 catalogo, final Activity activity)
        {
           catalogoTextView.setText(catalogo.nombrecatalogo);
            catalogoImageView.setImageDrawable(catalogo.menu);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), DetalleOferta.class);
                    // Create a bundle object
                    Bundle b = new Bundle();
                    //pasar datos a mi actividad llamada
                    b.putString("catalogo1", catalogo.nombrecatalogo);
                    // Add the bundle to the intent.
                    intent.putExtras(b);

                    // start the ResultActivity
                    activity.startActivity(intent);
                }
            });
        }
    }
}

