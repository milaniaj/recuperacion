package com.example.recuperacion3;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public void lunes(View View){
    	Toast.makeText(getApplicationContext(),"LABORABLE" , Toast.LENGTH_LONG).show();
    }
    public void martes(View View){
    	Toast.makeText(getApplicationContext(),"LABORABLE" , Toast.LENGTH_LONG).show();
    }
    public void miercoles(View View){
    	Toast.makeText(getApplicationContext(),"LABORABLE" , Toast.LENGTH_LONG).show();
    }
    public void jueves(View View){
    	Toast.makeText(getApplicationContext(),"LABORABLE" , Toast.LENGTH_LONG).show();
    }
    public void viernes(View View){
    	Toast.makeText(getApplicationContext(),"LABORABLE" , Toast.LENGTH_LONG).show();
    }
    public void sabado(View View){
    	Toast.makeText(getApplicationContext(),"NO LABORABLE" , Toast.LENGTH_LONG).show();
    }
    public void domingo(View View){
    	Toast.makeText(getApplicationContext(),"NO LABORABLE" , Toast.LENGTH_LONG).show();
    }
}
