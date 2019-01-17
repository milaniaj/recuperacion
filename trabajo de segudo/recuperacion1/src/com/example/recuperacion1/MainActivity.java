package com.example.recuperacion1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	TextView Texto1,Texto2, Texto3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Texto1=(TextView)findViewById(R.id.editText1);
		Texto2=(TextView)findViewById(R.id.editText2);
		Texto3=(EditText)findViewById(R.id.editText3);
	}
	public void guardar(View View){
	  Toast.makeText(getApplicationContext(),"REGISTRO INSERTADO" ,Toast.LENGTH_LONG).show();
	}
	public void cancelar(View View){
		Texto1.setText("");
		Texto2.setText("");
		Texto3.setText("");
	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
