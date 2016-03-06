package com.dismas.imaya.infoparks_beta;

<<<<<<< HEAD
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by imaya on 3/6/16.
 */
public class Splash extends AppCompatActivity {

=======
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class Splash extends AppCompatActivity {


    private static int SPLASH_TIME_OUT = 2000;

>>>>>>> master
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
<<<<<<< HEAD
=======



        new Handler().postDelayed(new Runnable() {


            public void run() {

                Intent intent = new Intent(Splash.this, Main.class);
                startActivity(intent);

                finish();
            }
        }, SPLASH_TIME_OUT);
>>>>>>> master
    }
}
