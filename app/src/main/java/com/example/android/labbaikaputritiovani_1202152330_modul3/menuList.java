package com.example.android.labbaikaputritiovani_1202152330_modul3;

/**
 * Created by Labbaika Putri on 2/25/2018.
 */

public class menuList {
    //deklarasi variable
    int image;
    String nama_air;
    String desc;

    //method setter
    public menuList(int image, String nama_air, String desc){
        this.image = image;
        this.nama_air = nama_air;
        this.desc = desc;
    }

    //method getter image, nama_air, deskripsi
    public int getImage() { return image; }

    public String getNama_air() { return nama_air; }

    public String getDesc() { return desc; }

}
