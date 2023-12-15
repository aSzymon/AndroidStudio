package com.example.mojaapkacja;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class okno3 extends AppCompatActivity {

    int liczbaKlikniec1 = 1;
    int liczbaKlikniec2 = 4;
    int liczbaKlikniec3 = 2;
    int liczbaKlikniec4 = 0;

    String tag = "Tag do logu";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        oknoDialogoweKolory();

        Log.d(tag,"To jest tag");

        setContentView(R.layout.okno_3);

        ImageButton p1 = findViewById(R.id.pudlo1_okno3);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        ImageButton p2 = findViewById(R.id.pudlo2_okno3);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        ImageButton p3 = findViewById(R.id.pudlo3_okno3);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        ImageButton p4 = findViewById(R.id.pudlo4_okno3);

        TextView tekst1 = findViewById(R.id.tekst1_okno3);
        TextView tekst2 = findViewById(R.id.tekst2_okno3);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        TextView tekst3 = findViewById(R.id.tekst3_okno3);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        TextView tekst4 = findViewById(R.id.tekst4_okno3);

        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                liczbaKlikniec1++;

                tekst1.setText(String.valueOf(liczbaKlikniec1));

                if (liczbaKlikniec1 == 1){

                    p1.setBackgroundColor(Color.WHITE);

                } else if(liczbaKlikniec1 == 2) {

                    p1.setBackgroundColor(Color.GREEN);

                } else if(liczbaKlikniec1 == 3){

                    p1.setBackgroundColor(Color.YELLOW);

                }else if(liczbaKlikniec1 == 4) {

                    p1.setBackgroundColor(Color.BLUE);
                    liczbaKlikniec1 = 0;
                }
            }
        });

        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                liczbaKlikniec2++;

                tekst2.setText(String.valueOf(liczbaKlikniec2));

                if (liczbaKlikniec2 == 1){

                    p2.setBackgroundColor(Color.WHITE);

                } else if(liczbaKlikniec2 == 2) {

                    p2.setBackgroundColor(Color.GREEN);

                } else if(liczbaKlikniec2 == 3){

                    p2.setBackgroundColor(Color.YELLOW);

                }else if(liczbaKlikniec2 == 4 || liczbaKlikniec2 == 5) {

                    p2.setBackgroundColor(Color.BLUE);
                    liczbaKlikniec2 = 0;
                }
            }
        });

        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                liczbaKlikniec3++;

                tekst3.setText(String.valueOf(liczbaKlikniec3));

                if (liczbaKlikniec3 == 1){

                    p3.setBackgroundColor(Color.WHITE);

                } else if(liczbaKlikniec3 == 2) {

                    p3.setBackgroundColor(Color.GREEN);

                } else if(liczbaKlikniec3 == 3){

                    p3.setBackgroundColor(Color.YELLOW);

                }else if(liczbaKlikniec3 == 4) {

                    p3.setBackgroundColor(Color.BLUE);
                    liczbaKlikniec3 = 0;
                }
            }
        });

        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                liczbaKlikniec4++;

                tekst4.setText(String.valueOf(liczbaKlikniec4));

                if (liczbaKlikniec4 == 1){

                    p4.setBackgroundColor(Color.WHITE);

                } else if(liczbaKlikniec4 == 2) {

                    p4.setBackgroundColor(Color.GREEN);

                } else if(liczbaKlikniec4 == 3){

                    p4.setBackgroundColor(Color.YELLOW);

                }else if(liczbaKlikniec4 == 4) {

                    p4.setBackgroundColor(Color.BLUE);
                    liczbaKlikniec4 = 0;
                }
            }
        });



    }

    public void oknoDialogoweKolory(){

        AlertDialog.Builder dialogBuilderAlarm = new AlertDialog.Builder(this);
        dialogBuilderAlarm.setTitle("UKŁADANIE KOLORÓW");
        dialogBuilderAlarm.setMessage("Puki co nic się tu szczególnego nie dzieje, ale kolory kwadracików po naciśnięciu się zmieniają");
        AlertDialog alertBuilder = dialogBuilderAlarm.create();
        alertBuilder.show();
    }

}
