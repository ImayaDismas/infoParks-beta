package com.dismas.imaya.infoparks_beta;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by imaya on 3/6/16.
 */
public class NorthEasternMenu extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.north_eastern_menu);
        addListenerOnButton1();
        addListenerOnButton2();
    }
    public void addListenerOnButton1() {

        final Context context = this;

        button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, NorthEastern.class);
                startActivity(intent);

            }

        });

    }
    public void addListenerOnButton2() {

        final Context context = this;

        button = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, NorthEastern_shaba.class);
                startActivity(intent);

            }

        });

    }
}
