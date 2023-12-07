// aSzymon - gtihub

package com.example.mojaapkacja;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class oknoGlowne extends AppCompatActivity {

    private Button przyciskPodajImieApk;
    private Button przyciskProstyKalkulator;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.okno_glowne);

        przyciskPodajImieApk = findViewById(R.id.przyciskPodajImieApk_oknoGlowne);
        przyciskProstyKalkulator = findViewById(R.id.przyciskProstyKalkulator_oknoGlowne);

        przyciskPodajImieApk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(oknoGlowne.this, okno1.class));

            }
        });

        przyciskProstyKalkulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(oknoGlowne.this, okno2.class));

            }
        });

    }
}
