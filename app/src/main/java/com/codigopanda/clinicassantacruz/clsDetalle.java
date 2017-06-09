package com.codigopanda.clinicassantacruz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class clsDetalle extends AppCompatActivity {
    ImageView imagen;
    TextView nombre;
    TextView tipo;
    TextView detalle;
    Button vermapa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fdetalle);
        imagen=(ImageView) findViewById(R.id.imagendetalleclinica);
        nombre=(TextView) findViewById(R.id.textdetallenombre);
        tipo=(TextView) findViewById(R.id.textdetalletipo);
        detalle=(TextView) findViewById(R.id.textdetalleclinica);
        vermapa=(Button) findViewById(R.id.botonvermapa);
        nombre.setText(GlobalDatos.item.nombre);
        imagen.setImageResource(GlobalDatos.item.imagen);
        vermapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(clsDetalle.this,clsMap.class));
            }
        });

    }
}
