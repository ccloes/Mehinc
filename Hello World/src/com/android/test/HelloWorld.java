package com.android.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class HelloWorld extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button button = (Button) findViewById(R.id.button1); 
        button.setOnClickListener(new OnClickListener() { 
        	public void onClick(View v) {
        		Toast.makeText(HelloWorld.this, "Hello World", Toast.LENGTH_SHORT).show(); 
        	}
        });
    }    
}