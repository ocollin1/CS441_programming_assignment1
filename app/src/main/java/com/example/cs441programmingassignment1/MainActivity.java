package com.example.cs441programmingassignment1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final TextView txtView = (TextView) findViewById(R.id.mainText);
        final FloatingActionButton fab = findViewById(R.id.button1);

        /*
        float min = 200;
        float maxH = 800;
        Random x = new Random();
        Random y = new Random();
        final float newHeight = min + x.nextFloat() * (maxH - min);
        */

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //float size = 15;
                //float textSize = txtView.getTextSize();
                //ViewGroup.LayoutParams windSize = txtView.getLayoutParams();
                txtView.setText("Try and keep up!");
                txtView.setTextSize(15);
                float minH = 300;
                float maxH = 800;
                float minW = 50;
                float maxW = 450;
                Random x = new Random();
                Random y = new Random();
                float newHeight = minH + y.nextFloat() * (maxH - minH);
                float newWidth = minW + x.nextFloat() * (maxW - minW);
                //windSize.height+=100;
                //double value = 0.1;
                //size++;
                //counter++;
                //txtView.setTextSize(textSize - 19);
                //txtView.setText(String.valueOf(textSize));

                /*
                Snackbar.make(view, "Do something important!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                */
                //LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(30,30);
                //fab.setLayoutParams(lp);
                fab.animate().x(txtView.getX()).y(txtView.getY());
                txtView.animate().x(newWidth).y(newHeight);


            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
