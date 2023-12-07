package com.example.mojaapkacja;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class okno2 extends AppCompatActivity {

    private EditText pole1;
    private EditText pole2;
    private Button przyciskDodaj;
    private Button przyciskOdejmij;
    private Button przyciskPomnoz;
    private Button przyciskPodziel;
    private TextView tekst1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.okno_2);

        pole1 = findViewById(R.id.pole1_okno2);
        pole2 = findViewById(R.id.pole2_okno2);
        przyciskDodaj = findViewById(R.id.przyciskDodaj_okno2);
        przyciskOdejmij = findViewById(R.id.przyciskOdejmij_okno2);
        przyciskPomnoz = findViewById(R.id.przyciskPomnoz_okno2);
        przyciskPodziel = findViewById(R.id.przyciskPodziel_okno2);
        tekst1 = findViewById(R.id.tekst1_okno2);

        przyciskDodaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tekst1.setText("Wynik : "+dodanieLiczb());

            }
        });

        przyciskOdejmij.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tekst1.setText("Wynik : "+odejmywanieLiczb());

            }
        });

        przyciskPomnoz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tekst1.setText(mnozenieLiczb());

            }
        });

        przyciskPodziel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    tekst1.setText(dzielenieLiczb());

            }
        });

    }
    private String dodanieLiczb() {

        return String.valueOf(Double.valueOf(String.valueOf(pole1.getText()))+Double.valueOf(String.valueOf(pole2.getText())));

    }

    private String odejmywanieLiczb(){

        return String.valueOf(Double.valueOf(String.valueOf(pole1.getText()))-Double.valueOf(String.valueOf(pole2.getText())));

    }

    private String mnozenieLiczb(){

        return String.valueOf(Integer.valueOf(String.valueOf(pole1.getText()))*Integer.valueOf(String.valueOf(pole2.getText())));

    }

    private String dzielenieLiczb(){

        return String.valueOf(Integer.valueOf(String.valueOf(pole1.getText()))/Integer.valueOf(String.valueOf(pole2.getText())));

    }
}
