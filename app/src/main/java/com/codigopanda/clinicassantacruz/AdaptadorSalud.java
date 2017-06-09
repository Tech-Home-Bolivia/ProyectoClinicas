package com.codigopanda.clinicassantacruz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by victor on 6/2/17.
 */

public class AdaptadorSalud extends BaseAdapter {
    List<salud> lista;
    Context cx;
    LayoutInflater inflater;

    public AdaptadorSalud(List<salud> l, Context c)
    {
        lista=l;
        cx=c;
        inflater =(LayoutInflater)
                c.getSystemService
                        (Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    class Hodler{
        ImageView img;
        TextView nombre;
        TextView tipo;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v= inflater.inflate(R.layout.item_clinica,null);
        Hodler h= new Hodler();
        h.img= (ImageView) v.findViewById(R.id.imagenclinica);
        h.nombre= (TextView) v.findViewById(R.id.nombreclinica);
        h.tipo= (TextView) v.findViewById(R.id.tipoclinica);
        h.img.setImageResource(lista.get(position).imagen);
        h.nombre.setText(lista.get(position).nombre);
        h.tipo.setText(lista.get(position).tipo);
        return v;
    }
}
