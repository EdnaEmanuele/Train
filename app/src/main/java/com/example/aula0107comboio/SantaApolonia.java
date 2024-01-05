package com.example.aula0107comboio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SantaApolonia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_santa_apolonia);
        Intent trainArriving = getIntent();
        String incoming = trainArriving.getStringExtra("train car 01");
        int incomingNumber = trainArriving.getIntExtra("train car 02",0); //o default está ai para corrigir caso nao seja possivel converter para inteiro
        String HiMessage = trainArriving.getStringExtra("train car 03");
        TextView tv = (TextView) findViewById(R.id.lblMessage);
        tv.setText(incoming + " " + incomingNumber + " " + HiMessage);
    }

    public void BackToMain (View v) {
        this.finish();
    }
}