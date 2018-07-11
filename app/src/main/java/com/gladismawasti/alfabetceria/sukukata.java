package com.gladismawasti.alfabetceria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class sukukata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sukukata);

        ImageView imageView27=(ImageView) findViewById(R.id.imageView27);
        ImageView imageView28=(ImageView) findViewById(R.id.imageView28);
        ImageView imageView29=(ImageView) findViewById(R.id.imageView29);
        ImageView imageView30=(ImageView) findViewById(R.id.imageView30);
        ImageView imageView31=(ImageView) findViewById(R.id.imageView31);
        ImageView imageView32=(ImageView) findViewById(R.id.imageView32);
        ImageView imageView33=(ImageView) findViewById(R.id.imageView33);
        ImageView imageView34=(ImageView) findViewById(R.id.imageView34);
        ImageView imageView35=(ImageView) findViewById(R.id.imageView35);
        ImageView imageView36=(ImageView) findViewById(R.id.imageView36);
        ImageView imageView37=(ImageView) findViewById(R.id.imageView37);
        ImageView imageView38=(ImageView) findViewById(R.id.imageView38);
        ImageView imageView39=(ImageView) findViewById(R.id.imageView39);
        ImageView imageView40=(ImageView) findViewById(R.id.imageView40);
        ImageView imageView41=(ImageView) findViewById(R.id.imageView41);
        ImageView imageView42=(ImageView) findViewById(R.id.imageView42);
        ImageView imageView43=(ImageView) findViewById(R.id.imageView43);
        ImageView imageView44=(ImageView) findViewById(R.id.imageView44);
        ImageView imageView45=(ImageView) findViewById(R.id.imageView45);
        ImageView imageView46=(ImageView) findViewById(R.id.imageView46);
        ImageView imageView47=(ImageView) findViewById(R.id.imageView47);
        ImageView imageView48=(ImageView) findViewById(R.id.imageView48);
        ImageView imageView49=(ImageView) findViewById(R.id.imageView49);
        ImageView imageView50=(ImageView) findViewById(R.id.imageView50);
        ImageView imageView51=(ImageView) findViewById(R.id.imageView51);
        ImageView imageView52=(ImageView) findViewById(R.id.imageView52);
        Button kembali=(Button)findViewById(R.id.back);

        kembali.setOnClickListener(new View.OnClickListener() {



            public void onClick(View arg0) {

                // TODO Auto-generated method stub

                Intent i =new Intent(getApplicationContext(),MainActivity.class);

                startActivity(i);

            }

        });


        imageView27.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(sukukata.this, R.raw.ayam);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView28.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(sukukata.this, R.raw.bebek);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView29.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(sukukata.this, R.raw.cicak);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView30.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(sukukata.this, R.raw.domba);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView31.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(sukukata.this, R.raw.elang);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView32.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(sukukata.this, R.raw.flamingo);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView33.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(sukukata.this, R.raw.gajah);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView34.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(sukukata.this, R.raw.hiu);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView35.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(sukukata.this, R.raw.iguana);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView36.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(sukukata.this, R.raw.jeruk);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView37.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(sukukata.this, R.raw.kentang);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView38.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(sukukata.this, R.raw.lampu);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView39.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(sukukata.this, R.raw.mangga);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView40.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(sukukata.this, R.raw.nanas);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView41.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(sukukata.this, R.raw.orangutan);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView42.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(sukukata.this, R.raw.panda);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView43.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(sukukata.this, R.raw.quran);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView44.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(sukukata.this, R.raw.rambutan);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView45.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(sukukata.this, R.raw.sapi);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView46.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(sukukata.this, R.raw.tikus);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView47.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(sukukata.this, R.raw.ular);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView48.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(sukukata.this, R.raw.vespa);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView49.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(sukukata.this, R.raw.wortel);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView50.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(sukukata.this, R.raw.xman);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView51.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(sukukata.this, R.raw.yoyo);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView52.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(sukukata.this, R.raw.zebra);
                mp.setVolume(1,1);
                mp.start();
            }
        });


    }
}
