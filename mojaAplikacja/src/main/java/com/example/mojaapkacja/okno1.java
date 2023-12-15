// aSzymon - github

package com.example.mojaapkacja;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class okno1 extends AppCompatActivity {

    private TextView tekst1;
    private EditText imie;
    private Button przycisk;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.okno_1);

        imie = findViewById(R.id.podajImie_okno1);
        przycisk = findViewById(R.id.przycisk_okno1);

        tekst1 = findViewById(R.id.pole_okno1);

        Editable wartoscImie = imie.getText();

        przycisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(okno1.this, "Twoje imie to : "+wartoscImie, Toast.LENGTH_SHORT).show();

                tekst1.setText(wartoscImie);

            }
        });

    }

}
