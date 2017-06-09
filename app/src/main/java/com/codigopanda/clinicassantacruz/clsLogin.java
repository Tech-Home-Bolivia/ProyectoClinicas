package com.codigopanda.clinicassantacruz;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class clsLogin extends AppCompatActivity {
    EditText user;
    EditText contra;
    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flogin);
        user=(EditText) findViewById(R.id.usuario);
        contra=(EditText) findViewById(R.id.contra);
        boton=(Button) findViewById(R.id.botonlogin);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario=user.getText().toString();
                String pass= contra.getText().toString();

                if(usuario.compareTo("victor")==0
                        && pass.compareTo("1234")==0)
                {
                    SharedPreferences db=
                            getSharedPreferences("login",
                                    Context.MODE_PRIVATE);

                    SharedPreferences.Editor edit= db.edit();
                    edit.putString("user",usuario);
                    edit.putString("paso","1");
                    edit.commit();
                    startActivity(new Intent(clsLogin.this,clsPrincipal.class));

                }else
                {
                    Toast.makeText(clsLogin.this,"ERROR",Toast.LENGTH_LONG).show();
                }


            }
        });



    }
}
