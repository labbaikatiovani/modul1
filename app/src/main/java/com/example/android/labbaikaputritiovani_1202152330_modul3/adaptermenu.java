package com.example.android.labbaikaputritiovani_1202152330_modul3;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Labbaika Putri on 2/25/2018.
 */

public class adaptermenu extends RecyclerView.Adapter<adaptermenu.holdermenu> {
    private Context context;
    private List<menuList> daftarmenus;

    //adpater yang akan menyiapkan layout untuk daftar menu
    public adaptermenu(Context context, List<menuList> daftarmenus) {
        this.context = context;
        this.daftarmenus = daftarmenus;
    }

    @Override
    public adaptermenu.holdermenu onCreateViewHolder(ViewGroup parent, int viewType) {
        //membuat view baru
        View view = LayoutInflater.from(context).inflate(R.layout.cardview_menu, parent, false);
        holdermenu hldr = new holdermenu(view);
        return hldr;
    }

    @Override
    public void onBindViewHolder(adaptermenu.holdermenu holder, int position) {
        //mengambil elemen dari array pada posisi tertentu
        menuList dt = daftarmenus.get(position);
        //mengeset isi view dengan elemen dari data
        holder.merk_air.setText(dt.getNama_air());
        holder.details.setText(dt.getDesc());
        //kondisi gambar dari drawable dijadikan sebagai background dari cardview
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            holder.rLayout.setBackground(holder.rLayout.getResources().getDrawable(dt.getImage()));
        }
        holder.rLayout.setTag(dt.getImage());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class holdermenu extends RecyclerView.ViewHolder {
        TextView merk_air, details;
        RelativeLayout rLayout;

        public holdermenu(View itemView) {
            super(itemView);
            merk_air = itemView.findViewById(R.id.merkAir);
            details = itemView.findViewById(R.id.detailAir);
            rLayout = itemView.findViewById(R.id.rLayout);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent move = new Intent(context, DetailAirActivity.class);
                    //mengirimkan data data yang diambil ke detail air untuk di tampilkan
                    move.putExtra("nama_air", merk_air.getText());
                    move.putExtra("desc", details.getText());
                    move.putExtra("image",rLayout.getTag().toString());
                    //mengeksekusi intent
                    context.startActivity(move);
                }
            });{

            }

        }
    }

}