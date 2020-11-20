package com.aniruddh.cs;

import androidx.appcompat.app.AppCompatActivity;

import android.text.TextUtils;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.aniruddh.cs.cipher.MonoCipher;
import com.google.android.material.textfield.TextInputEditText;

public class MonoActivity extends AppCompatActivity {
    TextView Result;
    TextInputEditText Text;
    Button enc , dec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mono);
        Result=findViewById(R.id.result);
        Text=findViewById(R.id.text);
        enc=findViewById(R.id.encryption);
        dec=findViewById(R.id.decryption);


        enc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkIsEmpty())
                    Result.setText(MonoCipher.encrypt(Text.getText().toString()));
            }
        });
        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkIsEmpty())
                    Result.setText(MonoCipher.decrypt(Text.getText().toString()));
            }
        });


    }

    private boolean checkIsEmpty(){
        if(TextUtils.isEmpty(Text.getText().toString()))
        {
            Toast.makeText(MonoActivity.this, "Please fill blank field",Toast.LENGTH_SHORT).show();
            return true;


        }
        return false;
    }
}
