package com.example.yvtc.t0717;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //====
        //-======
    }
    public void click1(View v)
    {
        Intent it = new Intent(MainActivity.this, SecActivity.class);
        EditText ed1, ed2;
        ed1 = (EditText) findViewById(R.id.editText2);
        ed2 = (EditText) findViewById(R.id.editText3);
        int a = Integer.valueOf(ed1.getText().toString());
        int b = Integer.valueOf(ed2.getText().toString());
        it.putExtra("va", a);
        it.putExtra("vb", b);
        startActivity(it);
    }

    }

