package com.codigopanda.clinicassantacruz;

/**
 * Created by victor on 5/29/17.
 */

public class salud {
  public String nombre;
    public String detalle;
    public int imagen;
    public String latitud;
    public String longitud;
    public String estado;
    public String tipo;
    public salud(){

    }
    public salud(String n,String d,int i,String lat,
                 String lon,String e,String t){
        nombre =n;
        detalle=d;
        imagen=i;
        latitud=lat;
        longitud=lon;
        estado=e;
        tipo=t;
    }
}
