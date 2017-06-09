package com.codigopanda.clinicassantacruz;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class clsPrincipal extends AppCompatActivity {
    List<salud> lista;
    ListView listaclinicas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fprincipal);
        lista= new ArrayList<>();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("mi titulo");
        setSupportActionBar(toolbar);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        FloatingActionButton fab1 = (FloatingActionButton) findViewById(R.id.fab1);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Hola", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "hola soy el segundo boton", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        llenarlista();
        listaclinicas=(ListView) findViewById(R.id.listadeclinicas);
        AdaptadorSalud s= new AdaptadorSalud(lista,clsPrincipal.this);
        listaclinicas.setAdapter(s);

        listaclinicas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                GlobalDatos.item=lista.get(position);
                startActivity(new Intent(clsPrincipal.this,clsDetalle.class));
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cls_principal, menu);
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
        if (id == R.id.action_saludo) {
            Toast.makeText(clsPrincipal.this, "Hola",
                    Toast.LENGTH_LONG).show();
            return true;
        }


        return super.onOptionsItemSelected(item);
    }


    public void llenarlista()
    {
        lista.add(new salud("nombre","detalle",R.drawable.hospital,
        "-17","-63","activo","Hospital"));
        lista.add(new salud("nombre","detalle",R.drawable.foto,
                "-17","-63","activo","Hospital"));
        lista.add(new salud("nombre","detalle",R.drawable.hospital,
                "-17","-63","activo","Hospital"));
        lista.add(new salud("nombre","detalle",R.drawable.hospital,
                "-17","-63","activo","Hospital"));
        lista.add(new salud("nombre","detalle",R.drawable.hospital,
                "-17","-63","activo","Hospital"));
        lista.add(new salud("nombre","detalle",R.drawable.hospital,
                "-17","-63","activo","Hospital"));
        lista.add(new salud("nombre","detalle",R.drawable.hospital,
                "-17","-63","activo","Hospital"));
        lista.add(new salud("nombre","detalle",R.drawable.hospital,
                "-17","-63","activo","Hospital"));
    }



}



