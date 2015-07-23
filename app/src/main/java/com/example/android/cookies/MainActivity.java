package com.example.android.cookies;

import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    public void changeScreen(View view) {
        // Find  the ImageView and TextView and Change them.
        ImageView image = (ImageView) findViewById(R.id.img_before_eating);
        image.setImageResource(R.drawable.after_cookie);
        TextView text = (TextView) findViewById(R.id.text_before_eating);
        text.setText("I'm sooooo full");
    }
    public void changeScreenAgain(View view) {
        // Find  the ImageView and TextView and Change them.
        ImageView image = (ImageView) findViewById(R.id.img_before_eating);
        image.setImageResource(R.drawable.before_cookie);
        TextView text = (TextView) findViewById(R.id.text_before_eating);
        text.setText("I'm Hungry again");
    }

}
