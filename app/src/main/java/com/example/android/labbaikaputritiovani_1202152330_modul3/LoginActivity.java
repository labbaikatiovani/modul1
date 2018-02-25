package com.example.android.labbaikaputritiovani_1202152330_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button login;
    EditText user, pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setTitle("Log in"); //Set title bar menjadi log in

        //Binding edit text dan button
        login = findViewById(R.id.btn_login);
        user = findViewById(R.id.user_name);
        pw = findViewById(R.id.password);


    }

    //Method yang akan diakses ketika tombol button diklik
    public void onClick(View view) {
        String uname = user.getText().toString();
        String pass = pw.getText().toString();

        if(uname.equals("EAD") && pass.equals("mobile")){ //kondisi dimana password dan username benar
            //Pindah ke Daftar menu
            Intent intent = new Intent(LoginActivity.this, DaftarMenuActivity.class);
            startActivity(intent);
            //menampilkan toast login berhasil
            Toast.makeText(this, "Berhasil Login!", 1).show();
        } else if (uname.isEmpty() && pass.isEmpty()){ //kondisi dimana password dan username kosong
            //menampilkan toast masukkan pw dan uname
            Toast.makeText(this, "Masukkan Username dan Password terlebih dahulu!", 1).show();
        } else if (!uname.equals("EAD") && !pass.equals("mobile")){ //kondisi dimana password dan username salah
            //menampikan toast password atau username salah
            Toast.makeText(this, "Username atau Password salah", 1).show();
        }
    }
}
