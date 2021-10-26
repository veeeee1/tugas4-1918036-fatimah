package com.example.tugas4_recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LaguAdapter extends RecyclerView.Adapter<LaguAdapter.LaguViewHolder>{
    private ArrayList<Lagu> dataList;
    public LaguAdapter(ArrayList<Lagu> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public LaguAdapter.LaguViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.lagu_list, parent, false);
        return new LaguViewHolder(view);
    }
    public void onBindViewHolder(LaguViewHolder holder, int position) {
        holder.Gambar.setImageResource(dataList.get(position).getGambar());
        holder.txtJudul.setText(dataList.get(position).getJudul());
        holder.txtJenis.setText(dataList.get(position).getJenis());
        holder.txtDurasi.setText(dataList.get(position).getDurasi());
    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }
    public class LaguViewHolder extends RecyclerView.ViewHolder{
        private TextView txtJudul, txtJenis, txtDurasi;
        private ImageView Gambar;
        public LaguViewHolder(View laguView) {
            super(laguView);
            Gambar = (ImageView)
                    laguView.findViewById(R.id.gambar_album);
            txtJudul = (TextView)
                    laguView.findViewById(R.id.txt_judul);
            txtJenis = (TextView)
                    laguView.findViewById(R.id.txt_jenis);
            txtDurasi = (TextView)
                    laguView.findViewById(R.id.txt_durasi);
        }
    }
}