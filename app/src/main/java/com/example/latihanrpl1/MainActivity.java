package com.example.latihanrpl1;
//not here

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.latihanrpl1.Model.UserModel;

//not here
public class MainActivity extends AppCompatActivity {
    EditText txtusername;
    EditText txtpassword;
    Button btnlogin;

    //fungsi utama
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // link to layout

        //
        final UserModel user=new UserModel();
        txtusername = findViewById(R.id.txtusername);
        txtpassword = findViewById(R.id.txtpassword);
        btnlogin = findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //command here
                user.setUsername(txtusername.getText().toString());
                user.setPassword(txtpassword.getText().toString());
                if (user.getUsername().equalsIgnoreCase("aji")
                        && user.getPassword().equalsIgnoreCase("aji")) {
                    //sukses login. menuju ke main menu
                    Toast.makeText(MainActivity.this, "Sukses login", Toast.LENGTH_LONG).show();
                    //pindah tampilan. param 1-> darimana, param 2 -> kemana
                    Intent in=new Intent(MainActivity.this, Kalkulator.class);
                    startActivity(in);
                } else {
                    //gagal login, tetap di form login
                    Toast.makeText(getApplicationContext(), "Gagal login", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
    //not here
}
