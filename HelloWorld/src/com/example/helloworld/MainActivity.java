package com.example.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    private EditText mTekst = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTekst = (EditText) findViewById(R.id.tekst);
    }

    public void klik(View view) {
        Toast.makeText(getApplicationContext(), mTekst.getText(),
                Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        /**
         * Inflate the menu; this adds items to the action bar if it is present.
         */
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
