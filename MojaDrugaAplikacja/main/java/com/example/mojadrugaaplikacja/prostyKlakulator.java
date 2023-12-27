package com.example.mojadrugaaplikacja;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class prostyKlakulator extends AppCompatActivity {

    private TextView wynik;

    private EditText pole1;
    private EditText pole2;

    private Button przyciskDodawanie;
    private Button przyciskOdejmywanie;
    private Button przyciskMnozenie;
    private Button przyciskDzielenie;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.prostykalkulator_layout);

        wynik = findViewById(R.id.wynik_prostyKalkulator);
        pole1 = findViewById(R.id.pole1_prostyKalkulator);
        pole2 = findViewById(R.id.pole2_prostyKalkulator);
        przyciskDodawanie = findViewById(R.id.przyciskDodawanie_prostyKalkulator);
        przyciskOdejmywanie = findViewById(R.id.przyciskOdejmywanie_prostyKalkulator);
        przyciskMnozenie = findViewById(R.id.przyciskMnozenie_prostyKalkulator);
        przyciskDzielenie = findViewById(R.id.przyciskDzielenie_prostyKalkulator);

        Editable wartoscPole1 = pole1.getText();
        Editable wartoscPole2 = pole2.getText();

        przyciskDodawanie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (wartoscPole1.length() == 0 || wartoscPole2.length() == 0){

                    Toast.makeText(prostyKlakulator.this, "Pole nie może być puste", Toast.LENGTH_SHORT).show();

                } else {

                    wynik.setText(dodawanie().toString());

                    if(wynik.length() >= 8) {

                        wynik.setTextSize(40);

                    } else if (wynik.length() < 8){

                        wynik.setTextSize(60);

                    }

                }
            }
        });

        przyciskOdejmywanie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (wartoscPole1.length() == 0 || wartoscPole2.length() == 0){

                    Toast.makeText(prostyKlakulator.this, "Pole nie może być puste", Toast.LENGTH_SHORT).show();

                } else {

                    wynik.setText(odejmywanie().toString());

                    if(wynik.length() >= 8) {

                        wynik.setTextSize(40);

                    } else if (wynik.length() < 8){

                        wynik.setTextSize(60);

                    }

                }

            }
        });

        przyciskMnozenie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (wartoscPole1.length() == 0 || wartoscPole2.length() == 0){

                    Toast.makeText(prostyKlakulator.this, "Pole nie może być puste", Toast.LENGTH_SHORT).show();

                } else {

                    wynik.setText(mnozenie().toString());

                    if(wynik.length() >= 8) {

                        wynik.setTextSize(40);

                    } else if (wynik.length() < 8){

                        wynik.setTextSize(60);

                    }

                }

            }
        });

        przyciskDzielenie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (wartoscPole1.length() == 0 || wartoscPole2.length() == 0){

                    Toast.makeText(prostyKlakulator.this, "Pole nie może być puste", Toast.LENGTH_SHORT).show();

                } else {

                    wynik.setText(dzielenie().toString());

                    if(wynik.length() >= 8) {

                        wynik.setTextSize(40);

                    } else if (wynik.length() < 8){

                        wynik.setTextSize(60);

                    }

                }

            }
        });

    }

    private Double dodawanie() {

        Editable wartoscPole1 = pole1.getText();
        Editable wartoscPole2 = pole2.getText();

        return Double.valueOf(String.valueOf(wartoscPole1)) + Double.valueOf(String.valueOf(wartoscPole2));

    }

    private Double odejmywanie(){

        Editable wartoscPole1 = pole1.getText();
        Editable wartoscPole2 = pole2.getText();

        return Double.valueOf(wartoscPole1.toString()) - Double.valueOf(wartoscPole2.toString());

    }

    private Double mnozenie(){

        Editable wartoscPole1 = pole1.getText();
        Editable wartoscPole2 = pole2.getText();

        return Double.valueOf(wartoscPole1.toString()) * Double.valueOf(wartoscPole2.toString());

    }

    private Double dzielenie(){

        Editable wartoscPole1 = pole1.getText();
        Editable wartoscPole2 = pole2.getText();

        return Double.valueOf(wartoscPole1.toString()) / Double.valueOf(wartoscPole2.toString());

    }

}
