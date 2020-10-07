package com.example.proyekcapstone;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>{
    private ArrayList<RecyclerModel> dataBerita;
    public RecyclerAdapter(ArrayList<RecyclerModel> dataBerita){
        this.dataBerita = dataBerita;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_item, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position){
        holder.txtJudul.setText(dataBerita.get(position).getJudulberita());
        holder.txtTanggal.setText(dataBerita.get(position).getTanggalberita());
        holder.txtKategori.setText(dataBerita.get(position).getKategoriberita());
    }

    @Override
    public int getItemCount() {
        return (dataBerita != null) ? dataBerita.size() : 0;
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder{
        private TextView txtJudul, txtTanggal, txtKategori;

        public RecyclerViewHolder(View itemView){
            super(itemView);
            txtJudul = (TextView) itemView.findViewById(R.id.judulberita);
            txtTanggal = (TextView) itemView.findViewById(R.id.tanggalberita);
            txtKategori = (TextView) itemView.findViewById(R.id.kategoriberita);
        }
    }
}

