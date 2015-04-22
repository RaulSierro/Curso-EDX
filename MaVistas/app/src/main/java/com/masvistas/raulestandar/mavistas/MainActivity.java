package com.masvistas.raulestandar.mavistas;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private EditText entrada;
    private TextView salida;
    private Button acer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entrada = (EditText)findViewById(R.id.entrada);
        salida = (TextView)findViewById(R.id.salida);
        acer = (Button)findViewById(R.id.btAcercaDe);
    }

    public void sePulsa(View view){

        salida.setText(String.valueOf(Float.parseFloat(entrada.getText().toString())*2.0));

    }

    public void sePulsa0(View view){

        entrada.setText(entrada.getText() + (String)view.getTag());
    }


    public void acercaDe(View view){

        Intent i = new Intent(this, AcercaDe.class);
        startActivity(i);

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
