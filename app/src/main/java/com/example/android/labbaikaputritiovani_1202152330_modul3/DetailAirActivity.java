package com.example.android.labbaikaputritiovani_1202152330_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailAirActivity extends AppCompatActivity {
    ImageView image, botol;
    TextView nama_air, detail_desc, ukuran;
    int hitungl = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_air);

        //Binding
        image = findViewById(R.id.detailImage);
        nama_air = findViewById(R.id.detailAir);
        detail_desc = findViewById(R.id.detailDesc);
        ukuran = findViewById(R.id.liter);
        botol = findViewById(R.id.botol);

        //set gambar dengan gambar yang di dapat intent
        image.setImageDrawable(this.getResources().getDrawable(Integer.valueOf(getIntent().getStringExtra("image"))));
        //set nama pada layout dengan nama yang di dapat intent
        nama_air.setText(getIntent().getStringExtra("nama_air"));
        //set detail dengan deskripsi yang di dapat dari intent
        detail_desc.setText(getIntent().getStringExtra("detail"));
        //set battery pada level terendah
        botol.setImageLevel(0);

    }

    public void kurang(View view) {
        if (botol.getDrawable().getLevel() - 1 >= 0) {
            //volume air akan dikurangi sebanyak 2 Liter
            hitungl=hitungl-2;
            //set text view dengan ukuran yang sudah dihitung
            ukuran.setText(hitungl + "L");
            //maka set image battery dengan battery satu tingkat sebelum level terendah
            botol.setImageLevel(botol.getDrawable().getLevel() - 1);
        } else {
            //apabila battery dikurangi sampai level paling rendah
            botol.setImageLevel(0);
            //maka akan muncul toast yang memberi tahu bahwa air hampir habis
            Toast.makeText(this, "Hampir Habis", 1).show();
        }
    }

    public void tambah(View view) {
        if (botol.getDrawable().getLevel() + 1 <=4) {
            //volume air akan ditambah sebanyak 2 liter
            hitungl=hitungl+2;
            //set text view dengan ukuran yang sudah dihitung
            ukuran.setText(hitungl + "L");
            //maka set image battery dengan battery satu tingkat sebelum level tertinggi
            botol.setImageLevel(botol.getDrawable().getLevel() + 1);
        } else {
            //apabila level battery penuh
            botol.setImageLevel(4);
            //maka akan muncul toast yang memberi tahu bahwa air sudah penuh
            Toast.makeText(this, "Penuh!", 1).show();
        }
    }
}
