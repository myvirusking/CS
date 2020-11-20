package com.aniruddh.cs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.aniruddh.cs.cipher.PolygramCipher;
import com.google.android.material.textfield.TextInputEditText;

public class PolygramActivity extends AppCompatActivity {

    TextView Result;
    TextInputEditText Key, Text;
    Button enc, dec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_polygram);
        Result = findViewById(R.id.result);
        Key = findViewById(R.id.key);
        Text = findViewById(R.id.text);
        enc = findViewById(R.id.encryption);
        dec = findViewById(R.id.decryption);


        enc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkIsEmpty())
                    Result.setText(PolygramCipher.encrypt(Text.getText().toString(),Key.getText().toString()));
            }
        });
        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkIsEmpty())
                    Result.setText(PolygramCipher.decrypt(Text.getText().toString(),Key.getText().toString()));
            }
        });


    }

    private boolean checkIsEmpty() {

        if (TextUtils.isEmpty(Text.getText().toString()) || TextUtils.isEmpty(Key.getText().toString())) {
            Toast.makeText(PolygramActivity.this, "Please fill blank field", Toast.LENGTH_SHORT).show();
            return true;

        }
        return false;
    }
}
