package com.example.stats3x3proba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_IME1 = "com.example.basketstatistika.EXTRA_IME1";
    public static final String EXTRA_IME2 = "com.example.basketstatistika.EXTRA_IME2";
    public static final String EXTRA_IME3 = "com.example.basketstatistika.EXTRA_IME3";
    public static final String EXTRA_IME4 = "com.example.basketstatistika.EXTRA_IME4";
    public static final String EXTRA_IME5 = "com.example.basketstatistika.EXTRA_IME5";
    public static final String EXTRA_IME6 = "com.example.basketstatistika.EXTRA_IME6";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btnPotvrdi);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });
    }

    public void openActivity2() {
        EditText editText1 = findViewById(R.id.edtUnos1);
        EditText editText2 = findViewById(R.id.edtUnos2);
        EditText editText3 = findViewById(R.id.edtUnos3);
        EditText editText4 = findViewById(R.id.edtUnos4);
        EditText editText5 = findViewById(R.id.edtUnos5);
        EditText editText6 = findViewById(R.id.edtUnos6);

        String ime1, ime2, ime3, ime4, ime5, ime6;

        ime1 = editText1.getText().toString();
        ime2 = editText2.getText().toString();
        ime3 = editText3.getText().toString();
        ime4 = editText4.getText().toString();
        ime5 = editText5.getText().toString();
        ime6 = editText6.getText().toString();

        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra( EXTRA_IME1, ime1);
        intent.putExtra( EXTRA_IME2, ime2);
        intent.putExtra( EXTRA_IME3, ime3);
        intent.putExtra( EXTRA_IME4, ime4);
        intent.putExtra( EXTRA_IME5, ime5);
        intent.putExtra( EXTRA_IME6, ime6);

        startActivity(intent);
    }
}