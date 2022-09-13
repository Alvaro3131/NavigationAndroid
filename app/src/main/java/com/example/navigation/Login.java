package com.example.navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private EditText use, pa;
    private Button ingresar;
    private final String user="admin@gmail.com";
    private final String pass="1234";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        use=findViewById(R.id.editTextTextPersonName);
        pa=findViewById(R.id.password);
        ingresar= findViewById(R.id.btningresar);
    }
    public void login(View view){

        String username = use.getText().toString().trim();
        String password = pa.getText().toString().trim();
        //Toast.makeText(getApplicationContext(),"Error:"+username+" / "+password,Toast.LENGTH_LONG).show();

        if(username.equals("") || password.equals("")){
            Toast.makeText(getApplicationContext(),"Ingresar Datos:",Toast.LENGTH_LONG).show();
        }else{
            if(username.equals(user) && password.equals(pass)){
                Toast.makeText(getApplicationContext(),"Bienvenido",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                intent.putExtra("pupil", user);
                intent.putExtra("name", "Alvaro");
                startActivity(intent);
            }else{
                Toast.makeText(getApplicationContext(),"Datos Incorrectos",Toast.LENGTH_LONG).show();
            }

        }
    }
}