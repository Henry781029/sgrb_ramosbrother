package com.project_moviles2.shopgamer_ramosbrother;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView jtvregistrarse;
    EditText jetusuario, jetclave;
    Button jbtloguear;

   

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        jtvregistrarse=findViewById(R.id.tvRegistrarse);
        jetusuario=findViewById(R.id.etUsuario);
        jetclave=findViewById(R.id.etClave);
        jbtloguear=findViewById(R.id.btnloquear);

        String email_retorno=getIntent().getStringExtra("coleccion");

        if( email_retorno == null) {
            jetusuario.setText("");
        }
        else{
            jetusuario.setText(email_retorno);
        }

    }

    public void irRegistro (View view){

        Intent intent= new Intent(getApplicationContext(),SGRB_register.class);
        startActivity(intent);

    }



}