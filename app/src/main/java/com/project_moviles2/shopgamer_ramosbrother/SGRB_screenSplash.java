package com.project_moviles2.shopgamer_ramosbrother;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SGRB_screenSplash extends AppCompatActivity {

    TextView jtvtitulo, jtvslogan;
    ImageView jimagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sgrb_screen_splash);

        getSupportActionBar().hide();

        jtvslogan=findViewById(R.id.tvSlogan);
        jtvtitulo=findViewById(R.id.tvTitulo);
        jimagen=findViewById(R.id.imagen);

        Animation animation1= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.desplazamiento_arriba);
        Animation animation2= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.desplazamiento_abajo);
        Animation animation3= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.opaco);

        jtvtitulo.setAnimation(animation1);
        jtvslogan.setAnimation(animation2);
        jimagen.setAnimation(animation3);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();

            }
        },4000);


    }
}