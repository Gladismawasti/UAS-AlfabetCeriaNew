package com.gladismawasti.alfabetceria;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView imageView1=(ImageView) findViewById(R.id.imageView1);
        ImageView imageView2=(ImageView) findViewById(R.id.imageView2);
        ImageView imageView3=(ImageView) findViewById(R.id.imageView3);
        ImageView imageView4=(ImageView) findViewById(R.id.imageView4);
        ImageView imageView5=(ImageView) findViewById(R.id.imageView5);
        ImageView imageView6=(ImageView) findViewById(R.id.imageView6);
        ImageView imageView7=(ImageView) findViewById(R.id.imageView7);
        ImageView imageView8=(ImageView) findViewById(R.id.imageView8);
        ImageView imageView9=(ImageView) findViewById(R.id.imageView9);
        ImageView imageView10=(ImageView) findViewById(R.id.imageView10);
        ImageView imageView11=(ImageView) findViewById(R.id.imageView11);
        ImageView imageView12=(ImageView) findViewById(R.id.imageView12);
        ImageView imageView13=(ImageView) findViewById(R.id.imageView13);
        ImageView imageView14=(ImageView) findViewById(R.id.imageView14);
        ImageView imageView15=(ImageView) findViewById(R.id.imageView15);
        ImageView imageView16=(ImageView) findViewById(R.id.imageView16);
        ImageView imageView17=(ImageView) findViewById(R.id.imageView17);
        ImageView imageView18=(ImageView) findViewById(R.id.imageView18);
        ImageView imageView19=(ImageView) findViewById(R.id.imageView19);
        ImageView imageView20=(ImageView) findViewById(R.id.imageView20);
        ImageView imageView21=(ImageView) findViewById(R.id.imageView21);
        ImageView imageView22=(ImageView) findViewById(R.id.imageView22);
        ImageView imageView23=(ImageView) findViewById(R.id.imageView23);
        ImageView imageView24=(ImageView) findViewById(R.id.imageView24);
        ImageView imageView25=(ImageView) findViewById(R.id.imageView25);
        ImageView imageView26=(ImageView) findViewById(R.id.imageView26);
        Button kembali=(Button)findViewById(R.id.back);

        kembali.setOnClickListener(new View.OnClickListener() {



            public void onClick(View arg0) {

                // TODO Auto-generated method stub
                // ini betul intent nya ke Main2Activity?? kan mau kembali, kok ke Java ini lagi kan salah

                //Intent i =new Intent(getApplicationContext(),Main2Activity.class);
                Intent i =new Intent(getApplicationContext(),MainActivity.class);

                startActivity(i);

            }

        });


        imageView1.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(Main2Activity.this, R.raw.suaraa);
                mp.setVolume(1,1);
                mp.start();
            }
                 });

                imageView2.setOnClickListener(new View.OnClickListener() {
                    public void onClick (View arg0) {
                        MediaPlayer mp = MediaPlayer.create(Main2Activity.this, R.raw.suarab);
                        mp.setVolume(1,1);
                        mp.start();
                    }
                });

                imageView3.setOnClickListener(new View.OnClickListener() {
                    public void onClick (View arg0) {
                        MediaPlayer mp = MediaPlayer.create(Main2Activity.this, R.raw.suarac);
                        mp.setVolume(1,1);
                        mp.start();
                    }
                });

                imageView4.setOnClickListener(new View.OnClickListener() {
                    public void onClick (View arg0) {
                        MediaPlayer mp = MediaPlayer.create(Main2Activity.this, R.raw.suarad);
                        mp.setVolume(1,1);
                        mp.start();
                    }
                });

                imageView5.setOnClickListener(new View.OnClickListener() {
                    public void onClick (View arg0) {
                        MediaPlayer mp = MediaPlayer.create(Main2Activity.this, R.raw.suarae);
                        mp.setVolume(1,1);
                        mp.start();
                    }
                });

                imageView6.setOnClickListener(new View.OnClickListener() {
                    public void onClick (View arg0) {
                        MediaPlayer mp = MediaPlayer.create(Main2Activity.this, R.raw.suaraf);
                        mp.setVolume(1,1);
                        mp.start();
                    }
                });

                imageView7.setOnClickListener(new View.OnClickListener() {
                    public void onClick (View arg0) {
                        MediaPlayer mp = MediaPlayer.create(Main2Activity.this, R.raw.suarag);
                        mp.setVolume(1,1);
                        mp.start();
                    }
                });

                imageView8.setOnClickListener(new View.OnClickListener() {
                    public void onClick (View arg0) {
                        MediaPlayer mp = MediaPlayer.create(Main2Activity.this, R.raw.suarah);
                        mp.setVolume(1,1);
                        mp.start();
                    }
                });

                imageView9.setOnClickListener(new View.OnClickListener() {
                    public void onClick (View arg0) {
                        MediaPlayer mp = MediaPlayer.create(Main2Activity.this, R.raw.suarai);
                        mp.setVolume(1,1);
                        mp.start();
                    }
                });

                imageView10.setOnClickListener(new View.OnClickListener() {
                    public void onClick (View arg0) {
                        MediaPlayer mp = MediaPlayer.create(Main2Activity.this, R.raw.suaraj);
                        mp.setVolume(1,1);
                        mp.start();
                    }
                });

                imageView11.setOnClickListener(new View.OnClickListener() {
                    public void onClick (View arg0) {
                        MediaPlayer mp = MediaPlayer.create(Main2Activity.this, R.raw.suarak);
                        mp.setVolume(1,1);
                        mp.start();
                    }
                });

                imageView12.setOnClickListener(new View.OnClickListener() {
                    public void onClick (View arg0) {
                        MediaPlayer mp = MediaPlayer.create(Main2Activity.this, R.raw.suaral);
                        mp.setVolume(1,1);
                        mp.start();
                    }
                });

                imageView13.setOnClickListener(new View.OnClickListener() {
                    public void onClick (View arg0) {
                        MediaPlayer mp = MediaPlayer.create(Main2Activity.this, R.raw.suaram);
                        mp.setVolume(1,1);
                        mp.start();
                    }
                });

                imageView14.setOnClickListener(new View.OnClickListener() {
                    public void onClick (View arg0) {
                        MediaPlayer mp = MediaPlayer.create(Main2Activity.this, R.raw.suaran);
                        mp.setVolume(1,1);
                        mp.start();
                    }
                });

                imageView15.setOnClickListener(new View.OnClickListener() {
                    public void onClick (View arg0) {
                        MediaPlayer mp = MediaPlayer.create(Main2Activity.this, R.raw.suarao);
                        mp.setVolume(1,1);
                        mp.start();
                    }
                });

                imageView16.setOnClickListener(new View.OnClickListener() {
                    public void onClick (View arg0) {
                        MediaPlayer mp = MediaPlayer.create(Main2Activity.this, R.raw.suarap);
                        mp.setVolume(1,1);
                        mp.start();
                    }
                });

                imageView17.setOnClickListener(new View.OnClickListener() {
                    public void onClick (View arg0) {
                        MediaPlayer mp = MediaPlayer.create(Main2Activity.this, R.raw.suaraq);
                        mp.setVolume(1,1);
                        mp.start();
                    }
                });

                imageView18.setOnClickListener(new View.OnClickListener() {
                    public void onClick (View arg0) {
                        MediaPlayer mp = MediaPlayer.create(Main2Activity.this, R.raw.suarar);
                        mp.setVolume(1,1);
                        mp.start();
                    }
                });

                imageView19.setOnClickListener(new View.OnClickListener() {
                    public void onClick (View arg0) {
                        MediaPlayer mp = MediaPlayer.create(Main2Activity.this, R.raw.suaras);
                        mp.setVolume(1,1);
                        mp.start();
                    }
                });

                imageView20.setOnClickListener(new View.OnClickListener() {
                    public void onClick (View arg0) {
                        MediaPlayer mp = MediaPlayer.create(Main2Activity.this, R.raw.suarat);
                        mp.setVolume(1,1);
                        mp.start();
                    }
                });

                imageView21.setOnClickListener(new View.OnClickListener() {
                    public void onClick (View arg0) {
                        MediaPlayer mp = MediaPlayer.create(Main2Activity.this, R.raw.suarau);
                        mp.setVolume(1,1);
                        mp.start();
                    }
                });

                imageView22.setOnClickListener(new View.OnClickListener() {
                    public void onClick (View arg0) {
                        MediaPlayer mp = MediaPlayer.create(Main2Activity.this, R.raw.suarav);
                        mp.setVolume(1,1);
                        mp.start();
                    }
                });

                imageView23.setOnClickListener(new View.OnClickListener() {
                    public void onClick (View arg0) {
                        MediaPlayer mp = MediaPlayer.create(Main2Activity.this, R.raw.suaraw);
                        mp.setVolume(1,1);
                        mp.start();
                    }
                });

                imageView24.setOnClickListener(new View.OnClickListener() {
                    public void onClick (View arg0) {
                        MediaPlayer mp = MediaPlayer.create(Main2Activity.this, R.raw.suarax);
                        mp.setVolume(1,1);
                        mp.start();
                    }
                });

                imageView25.setOnClickListener(new View.OnClickListener() {
                    public void onClick (View arg0) {
                        MediaPlayer mp = MediaPlayer.create(Main2Activity.this, R.raw.suaray);
                        mp.setVolume(1,1);
                        mp.start();
                    }
                });

                imageView26.setOnClickListener(new View.OnClickListener() {
                    public void onClick (View arg0) {
                        MediaPlayer mp = MediaPlayer.create(Main2Activity.this, R.raw.suaraz);
                        mp.setVolume(1,1);
                        mp.start();
                    }
                });
    }
}
