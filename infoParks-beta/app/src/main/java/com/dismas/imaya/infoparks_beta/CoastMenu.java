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
public class CoastMenu extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coast_menu);
        addListenerOnButton1();
        addListenerOnButton2();
        addListenerOnButton3();
        addListenerOnButton4();
    }
    public void addListenerOnButton1() {

        final Context context = this;

        button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Coast.class);
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

                Intent intent = new Intent(context, Coast_malindi.class);
                startActivity(intent);

            }

        });

    }
    public void addListenerOnButton3() {

        final Context context = this;

        button = (Button) findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Coast_kisite.class);
                startActivity(intent);

            }

        });

    }
    public void addListenerOnButton4() {

        final Context context = this;

        button = (Button) findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Coast_watamu.class);
                startActivity(intent);

            }

        });

    }
}
