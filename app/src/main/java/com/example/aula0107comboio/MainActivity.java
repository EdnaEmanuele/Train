package com.example.aula0107comboio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SendMessage(View v){
        Intent alfa = new Intent(this, SantaApolonia.class);
        EditText txtItem = (EditText) findViewById(R.id.txtMessage);
        String outbound = txtItem.getText().toString();
        alfa.putExtra("train car 01", outbound);
        alfa.putExtra("train car 02", 397);
        alfa.putExtra("train car 03", "Hi, this is a test");
        startActivity(alfa);
    }

    @Override
    protected void onResume() {
        super.onResume();
        EditText et = (EditText) findViewById(R.id.txtMessage);
        et.setText("");
    }
}