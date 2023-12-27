package com.example.mojadrugaaplikacja;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class miniWikipedia extends AppCompatActivity {

    private Spinner lista;
    private TextView tytul;
    private TextView opis;
    private ImageView obraz;

    String[] tablicaTytul;
    String[] tablicaOpis;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.miniwikipedia);

        lista = findViewById(R.id.listaRozwijana_miniWikipedia);
        tytul = findViewById(R.id.tytul_miniWikipedia);
        opis = findViewById(R.id.opis_miniWikipedia);
        obraz = findViewById(R.id.obraz_miniWikipedia);

        tablicaTytul = new String[]{"Papużka falista","Szczur domowy","Stokrotki","Programowanie"};

        tablicaOpis = new String[]{
                "Papużka falista – gatunek małego ptaka z podrodziny dam w rodzinie papug wschodnich. Występuje w Australii, głównie jej interiorze. Nie jest zagrożona wyginięciem.",
                "Szczur domowy jest uważany za jednego z najbardziej inteligentnych gryzoni, nie przez przypadek przecież szczury są nieodłącznym elementem laboratoriów i przeprowadzanych w nich eksperymentów. Ten wyjątkowo mądry gryzoń stanowi temat wielu kontrowersji, dla jednych jest odpychający zaś dla drugich będzie wymarzonym domowym zwierzątkiem i ukochanym pupilem. W tym artykule dowiesz się jak dbać o szczurki, jaką dietę im zapewnić i dlaczego wzbudzają mieszane uczucia.",
                "Stokrotka – rodzaj z rodziny astrowatych. Obejmuje 14 gatunków. Zasięg rodzaju obejmuje całą Europę, północno-zachodnią Afrykę i zachodnią Azję. W Polsce występuje jeden gatunek – stokrotka pospolita B. perennis. Rośliny te występują na pastwiskach, w murawach, na terenach skalistych i w lasach.",
                "Programowanie jest procesem tworzenia zbioru instrukcji, które mówią komputerowi jak wykonać określone zadanie. Programowanie może być wykonane w wielu językach takich jak SQL, Java, Python i C++"
        };

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,tablicaTytul);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        lista.setAdapter(adapter);

        lista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                String select = tablicaTytul[lista.getSelectedItemPosition()];

                if (select.equals("Papużka falista")) {

                    tytul.setText(tablicaTytul[0]);
                    opis.setText(tablicaOpis[0]);
                    obraz.setImageResource(R.drawable.wiki3);

                } else if (select.equals("Szczur domowy")){

                    tytul.setText(tablicaTytul[1]);
                    opis.setText(tablicaOpis[1]);
                    obraz.setImageResource(R.drawable.wiki4);

                } else if (select.equals("Stokrotki")){

                    tytul.setText(tablicaTytul[2]);
                    opis.setText(tablicaOpis[2]);
                    obraz.setImageResource(R.drawable.wiki2);

                } else if (select.equals("Programowanie")){

                    tytul.setText(tablicaTytul[3]);
                    opis.setText(tablicaOpis[3]);
                    obraz.setImageResource(R.drawable.wiki1);

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
