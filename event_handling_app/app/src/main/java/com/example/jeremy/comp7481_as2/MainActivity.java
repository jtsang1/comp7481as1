package com.example.jeremy.comp7481_as2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity implements OnClickListener{

    // Create an anonymous implementation of OnClickListener
    private OnClickListener mClickListener = new OnClickListener() {
        public void onClick(View v) {

            ImageView imageView = (ImageView) findViewById(R.id.imageView);

            switch(v.getId()){
                case R.id.btnA:
                    imageView.setImageResource(R.drawable.my_image1);
                    break;
                case R.id.btnB:
                    imageView.setImageResource(R.drawable.my_image2);
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Capture our button from layout
        Button buttonA = (Button)findViewById(R.id.btnA);
        Button buttonB = (Button)findViewById(R.id.btnB);

        // Register the anonymous onClick listener with the implementation above
        buttonA.setOnClickListener(mClickListener);
        buttonB.setOnClickListener(mClickListener);

        // Register listener
        Button buttonC = (Button)findViewById(R.id.btnC);
        buttonC.setOnClickListener(this);
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

    // Implement the OnClickListener as part of Activity
    public void onClick(View view) {
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.my_image3);
    }

    // Implement the OnClickListener callback
    public void clickD(View view) {
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.my_image4);
    }
}
