package com.example.mojadrugaaplikacja;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class oknoGlowne extends AppCompatActivity {

    private Button przyciskProstyKalkulator;
    private Button przyciskMemory;
    private Button przyciskFormularz;
    private Button przyciskMiniWikipedia;
    private Button przyciskListaToDo;
    private Button przyciskGaleria;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.oknoglowne_layout);

        przyciskProstyKalkulator = findViewById(R.id.przyciskProstyKalkulator_oknoGlowne);
        przyciskMemory = findViewById(R.id.przyciskAkaMemory_oknoGlowne);
        przyciskFormularz = findViewById(R.id.przyciskFormularz_oknoGlowne);
        przyciskMiniWikipedia = findViewById(R.id.przyciskMiniWikipedia_oknoGlowne);
        przyciskListaToDo = findViewById(R.id.przyciskListaToDo_oknoGlowne);
//        przyciskGaleria = findViewById(R.id.przyciskGaleria_oknoGlowne);

        przyciskProstyKalkulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(oknoGlowne.this, prostyKlakulator.class));

            }
        });

        przyciskMemory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(oknoGlowne.this, memory.class));

            }
        });

        przyciskFormularz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(oknoGlowne.this,formularz.class));

            }
        });

        przyciskMiniWikipedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(oknoGlowne.this,miniWikipedia.class));

            }
        });

        przyciskListaToDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(oknoGlowne.this,ListaToDo.class));

            }
        });

    }
}
