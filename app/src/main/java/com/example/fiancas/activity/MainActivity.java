package com.example.fiancas.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.fiancas.R;
import com.example.fiancas.activity.CadastroActivity;
import com.example.fiancas.activity.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btEntrar(View view){

        startActivity(new Intent(this, LoginActivity.class));

    }

    public void btCadastrar(View view){

        startActivity(new Intent(this, CadastroActivity.class));

    }

}
