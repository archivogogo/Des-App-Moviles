package com.anahuac.anahuac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn_login_facebook;
    private Button btn_login_netflix;
    private Button btn_recycler_view;
    private Button btn_campus_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_login_facebook = findViewById(R.id.btn_login_facebook);
        btn_login_netflix = findViewById(R.id.btn_login_netflix);
        btn_recycler_view = findViewById(R.id.btn_recyclerview);
        btn_campus_list = findViewById(R.id.btn_campus_list);

        btn_login_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Boton Presionado", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        btn_login_netflix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Boton Presionado", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, LoginActivityNetflix.class);
                startActivity(intent);
            }
        });

        btn_recycler_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Boton Presionado", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, RecyclerActivity.class);
                startActivity(intent);
            }
        });

        btn_campus_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Boton Presionado", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, ListCampusActivity.class);
                startActivity(intent);
            }
        });
    }
}

