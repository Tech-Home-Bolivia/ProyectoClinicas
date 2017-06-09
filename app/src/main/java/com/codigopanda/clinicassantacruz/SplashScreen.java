package com.codigopanda.clinicassantacruz;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {
    public int tiempo=5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        TimerTask t= new TimerTask() {
            @Override
            public void run() {
                String cad= getLogin();
                if(cad.compareTo("false")==0) {
                    startActivity(new Intent(SplashScreen.this, clsLogin.class));
                }else
                {
                    startActivity(new Intent(SplashScreen.this, clsPrincipal.class));

                }
                    finish();
            }
        };
        Timer time= new Timer();
        time.schedule(t,tiempo);

    }


    public String getLogin()
    {
        SharedPreferences db=
                getSharedPreferences("login"
                        , Context.MODE_PRIVATE);
        String dato= db.getString("user","false");
        return dato;
    }
}
