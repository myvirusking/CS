package com.aniruddh.cs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.aniruddh.cs.cipher.HomoCipher;
import com.google.android.material.textfield.TextInputEditText;

public class HomoActivity extends AppCompatActivity {

    TextView Result;
    TextInputEditText Text;
    Button enc, dec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homo);
        Result = findViewById(R.id.result);
        Text = findViewById(R.id.text);
        enc = findViewById(R.id.encryption);
        dec = findViewById(R.id.decryption);


        enc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkIsEmpty())
                    Result.setText(HomoCipher.encrypt(Text.getText().toString()));
            }
        });
        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkIsEmpty())
                    Result.setText(HomoCipher.decrypt(Text.getText().toString()));
            }
        });


    }

    private boolean checkIsEmpty() {

        if (TextUtils.isEmpty(Text.getText().toString())) {
            Toast.makeText(HomoActivity.this, "Please fill blank field", Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }
}
