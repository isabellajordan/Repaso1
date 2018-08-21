package com.example.a1144100607.repaso1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnIrMenu;
    private EditText edtUserName;
    String nombreUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombreUsuario= "NA";
        edtUserName = findViewById(R.id.edt_user_name);

        //definir la variable
        btnIrMenu= findViewById(R.id.btn_ir_menu);
        btnIrMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intento = new Intent(getApplicationContext(), Menu.class);
                nombreUsuario = edtUserName.getText().toString();
                intento.putExtra("usuario", nombreUsuario);
                startActivity(intento);
            }
        });



    }

    //hola nuevo comentario

    //comentario desde android a github
    //hola android a GitHub


}
