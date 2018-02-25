package com.example.android.labbaikaputritiovani_1202152330_modul3;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DaftarMenuActivity extends AppCompatActivity {
    RecyclerView r_view;
    adaptermenu adaptermenu;
    List<menuList> daftarMenus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);

        setTitle("Daftar Air Mineral");

        daftarMenus = new ArrayList<>();
        r_view = findViewById(R.id.recycle_view);
        r_view.setHasFixedSize(true);
        if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE){
            //Tampilan 2 grid
            r_view.setLayoutManager(new GridLayoutManager(DaftarMenuActivity.this, 2));
            //orientasi menjadi portrait
        }else {
            //tampilan 1 grid
            r_view.setLayoutManager(new GridLayoutManager(DaftarMenuActivity.this, 1));
        }
        //menjalankan fungsi input data
        datainput();

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if(newConfig.orientation== Configuration.ORIENTATION_LANDSCAPE){
            r_view.setLayoutManager(new GridLayoutManager(DaftarMenuActivity.this, 2));
        }else {
            r_view.setLayoutManager(new GridLayoutManager(DaftarMenuActivity.this, 1));
        }

    }

    public void datainput(){
        //memasukkan data ke dalam array
        daftarMenus.add(new menuList(R.drawable.ades, "Ades", "Ini adalah air mineral dengan merk Ades. \nAdes adalah merek air mineral atau air minum dalam kemasan (AMDK) yang diproduksi oleh PT. Coca-Cola Bottling Indonesia, Bekasi. Air mineral tersebut juga dikenal sebagai I-Lohas di Jepang."));
        daftarMenus.add(new menuList(R.drawable.amidis, "Amidis", "Ini adalah air mineral dengan merk Amidis. \nAmidis adalah air minum kesehatan yang diproses melalui sistem distilasi atau penyulingan atau penguapan,melalui proses pemanasan hingga 180 derajat celcius sehingga menghasilkan air minum yang murni (NON-MINERAL) tanpa kandungan polutan, mineral anorganik maupun bahan kontaminasi lain seperti bahan kimia "));
        daftarMenus.add(new menuList(R.drawable.aqua, "Aqua", "Ini adalah air mineral dengan merk Aqua. \nAqua merupakan sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Aqua Golden Mississippi Tbk di Indonesia sejak tahun 1973. Selain di Indonesia, Aqua juga dijual di Malaysia, Singapura, dan Brunei."));
        daftarMenus.add(new menuList(R.drawable.cleo, "Cleo", "Ini adalah air mineral dengan merk Cleo. \nCleo adalah air murni berkadar kemurnian 99,99% mengandung oksigen sampai dengan 8mg/L @ 20°C. Air Murni Cleo diambil dari mata air pegunungan dan diproses melalui hyper membrane filter 0,0001 mikron sehingga tidak mengandung mikroorganisme dan mineral anorganik, misalnya chlorine dan natrium fluoride"));
        daftarMenus.add(new menuList(R.drawable.club, "Club", "Ini adalah air mineral dengan merk Club. \nClub adalah merek air minum dalam kemasan atau air mineral di Indonesia. Merek ini berasal dari Surabaya dan Pandaan, Pasuruan, Jawa Timur. Club diproduksi oleh PT Tirta Sukses Perkasa (dahulu PT Tirta Bahagia) sejak tahun 1986. Pada bulan November 2013, merek Club diakuisisi oleh PT Indofood CBP Sukses Makmur Tbk."));
        daftarMenus.add(new menuList(R.drawable.equil, "Equil", "Ini adalah air mineral dengan merk Equil. \nEQUIL mungkin masih asing di telinga kebanyakan masyarakat Indonesia.  Namun merk air mineral murni ini sudah cukup dikenal kalangan menengah atas dan ekspatriat. Equil kerap hadir di meja restoran fine dining, hotel bintang lima, hingga meja Istana Negara saat rapat kabinet."));
        daftarMenus.add(new menuList(R.drawable.evian , "Evian", "Ini adalah air mineral dengan merk Evian. \nEvian sebuah merek air mineral Perancis yang berasal dari berbagai sumber dekat Évian-les-Bains, di pesisir selatan Lac Léman.\n" +
                "Saat ini Evian dimiliki oleh Groupe Danone, sebuah perusahaan multinasional Perancis. Selain air mineral, Groupe Danone memakai nama Evian untuk jajaran produk perawatan kulit organik serta sebuah resor mewah di Perancis."));
        daftarMenus.add(new menuList(R.drawable.nestle, "Nestle", "Ini adalah air mineral dengan merk Nestle. \nNestlé merupakan perusahaan makanan dan minuman terbesar di dunia. Kami memiliki lebih dari 2.000 merek, mulai dari ikon global hingga produk lokal favorit, dan kami hadir di 191 negara di seluruh dunia."));
        daftarMenus.add(new menuList(R.drawable.leminerale, "Leminerale", "Ini adalah air mineral dengan merk Lemineral. \nLe Minerale adalah air mineral baru dari Mayora, berupa air mineral pegunungan yang mengandung mineral alami yang dibutuhkan tubuh sehari-hari. Le Minerale, diolah dari sumber mata air pegunungan terpilih, sehingga memiliki kesegaran khas yang ditandai dengan sedikit rasa manis. Kesegaran khas ini berasal dari seimbangnya jumlah kandungan mineral alami dalam Le Minerale."));
        daftarMenus.add(new menuList(R.drawable.pristine, "Pristine", "Ini adalah air Prustine. \nPristine dengan kandungan Alkaline Water yang berisi air basa yang ber Ph 8+, dapat berfungsi untuk mengecilkan pori-pori sehingga kulit wajah akan menjadi lebih kencang"));
        daftarMenus.add(new menuList(R.drawable.vit, "Vit", "Ini adalah air Vit. \nVIT adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Tirta Investama di Indonesia. Mulai diproduksi sejak tanggal 16 November 1982 dan awalnya dimiliki oleh PT Varia Industri Tirta. "));

        adaptermenu = new adaptermenu(this, daftarMenus);
        r_view.setAdapter(adaptermenu);

    }



}
