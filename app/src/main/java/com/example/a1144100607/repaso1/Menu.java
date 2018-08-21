package com.example.a1144100607.repaso1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Menu extends AppCompatActivity {

    private String usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //entrega quién fue el objeto que mando la solicitud
        Intent intento = getIntent();
        usuario= intento.getStringExtra("usuario");

        TextView t= findViewById(R.id.tv_user_name);
        t.setText(usuario);


    }
}
