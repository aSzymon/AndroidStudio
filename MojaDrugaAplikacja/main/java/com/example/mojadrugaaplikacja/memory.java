package com.example.mojadrugaaplikacja;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class memory extends AppCompatActivity {

    Boolean p1 = false;
    Boolean p2 = false;
    Boolean p3 = false;
    Boolean p4 = false;
    Boolean p5 = false;
    Boolean p6 = false;

    int licznik = 0;

    private ImageButton przyciskObrazek1;
    private ImageButton przyciskObrazek2;
    private ImageButton przyciskObrazek3;
    private ImageButton przyciskObrazek4;
    private ImageButton przyciskObrazek5;
    private ImageButton przyciskObrazek6;

    private ImageView obrazek1;
    private ImageView obrazek2;
    private ImageView obrazek3;
    private ImageView obrazek4;
    private ImageView obrazek5;
    private ImageView obrazek6;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.memory_layout);

        oknoDialogoweKolory();

        przyciskObrazek1 = findViewById(R.id.przyciskObrazek1_memory);
        przyciskObrazek2 = findViewById(R.id.przyciskObrazek2_memory);
        przyciskObrazek3 = findViewById(R.id.przyciskObrazek3_memory);
        przyciskObrazek4 = findViewById(R.id.przyciskObrazek4_memory);
        przyciskObrazek5 = findViewById(R.id.przyciskObrazek5_memory);
        przyciskObrazek6 = findViewById(R.id.przyciskObrazek6_memory);

        obrazek1 = findViewById(R.id.obrazek1_memory);
        obrazek2 = findViewById(R.id.obrazek2_memory);
        obrazek3 = findViewById(R.id.obrazek3_memory);
        obrazek4 = findViewById(R.id.obrazek4_memory);
        obrazek5 = findViewById(R.id.obrazek5_memory);
        obrazek6 = findViewById(R.id.obrazek6_memory);

        przyciskObrazek1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                przyciskObrazek1.setVisibility(View.INVISIBLE);
                p1 = true;

                licznik++;

            }
        });

        przyciskObrazek2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                przyciskObrazek2.setVisibility(View.INVISIBLE);
                p2 = true;

                licznik++;


            }
        });

        przyciskObrazek3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                przyciskObrazek3.setVisibility(View.INVISIBLE);
                p3 = true;

                licznik++;

            }
        });

        przyciskObrazek4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                przyciskObrazek4.setVisibility(View.INVISIBLE);
                p4 = true;

                licznik++;


            }
        });

        przyciskObrazek5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                przyciskObrazek5.setVisibility(View.INVISIBLE);
                p5 = true;

                licznik++;

            }
        });

        przyciskObrazek6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                przyciskObrazek6.setVisibility(View.INVISIBLE);
                p6 = true;

                licznik++;

            }
        });

    }

    public void oknoDialogoweKolory(){

        AlertDialog.Builder dialogBuilderAlarm = new AlertDialog.Builder(this);
        dialogBuilderAlarm.setTitle("MEMORY");
        dialogBuilderAlarm.setMessage("Aplikacja w budowie");
        AlertDialog alertBuilder = dialogBuilderAlarm.create();
        alertBuilder.show();
    }

}

