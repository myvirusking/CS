package com.aniruddh.cs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnCaesar,btnmodi,btnmono,btnhomo,btnpoly,btnVernam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCaesar = findViewById(R.id.btnCaesar);
        btnmodi = findViewById(R.id.btnmodi);
        btnmono = findViewById(R.id.btnmono);
        btnhomo = findViewById(R.id.btnhomo);
        btnpoly = findViewById(R.id.btnpoly);
        btnVernam = findViewById(R.id.btnVernam);

        btnCaesar.setOnClickListener(this);
        btnmodi.setOnClickListener(this);
        btnmono.setOnClickListener(this);
        btnhomo.setOnClickListener(this);
        btnpoly.setOnClickListener(this);
        btnVernam.setOnClickListener(this);

    }


    public void redirectActivity(Class cls) {
        Intent intent = new Intent(this,cls);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnCaesar:
                redirectActivity(CaesarActivity.class);
                break;
            case R.id.btnmodi:
                redirectActivity(ModifiedActivity.class);
                break;
            case R.id.btnmono:
                redirectActivity(MonoActivity.class);
                break;
            case R.id.btnhomo:
                redirectActivity(HomoActivity.class);
                break;
            case R.id.btnpoly:
                redirectActivity(PolygramActivity.class);
                break;
            case R.id.btnVernam:
                redirectActivity(VernamActivity.class);
                break;
            default:
                redirectActivity(MainActivity.class);
                break;
        }
    }
}