package com.gladismawasti.alfabetceria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        Button button2 =(Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {



            public void onClick(View arg0) {

                // TODO Auto-generated method stub

                Intent i =new Intent(getApplicationContext(),Main2Activity.class);

                startActivity(i);
            }

        });

        Button button3 =(Button) findViewById(R.id.button3);


        button3.setOnClickListener(new View.OnClickListener() {



            public void onClick(View arg0) {

                // TODO Auto-generated method stub

                Intent i =new Intent(getApplicationContext(),sukukata.class);

                startActivity(i);
            }

        });

        Button button4 =(Button) findViewById(R.id.button4);


        button4.setOnClickListener(new View.OnClickListener() {



            public void onClick(View arg0) {

                // TODO Auto-generated method stub

                Intent i =new Intent(getApplicationContext(),laguabc.class);

                startActivity(i);
            }

        });

    }
}
