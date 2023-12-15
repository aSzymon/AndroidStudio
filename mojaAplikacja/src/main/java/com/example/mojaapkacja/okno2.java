// aSzymon - gtihub

package com.example.mojaapkacja;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
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

        oknoPobieranieWartosci();

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

        return String.valueOf(Double.valueOf(String.valueOf(pole1.getText()))*Double.valueOf(String.valueOf(pole2.getText())));

    }

    private String dzielenieLiczb(){

        return String.valueOf(Double.valueOf(String.valueOf(pole1.getText()))/Double.valueOf(String.valueOf(pole2.getText())));

    }

    public void oknoPobieranieWartosci(){

        ProgressDialog pobieranieWartosci = new ProgressDialog(this);
        pobieranieWartosci.setCancelable(false);
        pobieranieWartosci.setIcon(R.mipmap.ic_launcher);
        pobieranieWartosci.setTitle("Pobieranie danych...");
        pobieranieWartosci.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        pobieranieWartosci.setButton(DialogInterface.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getBaseContext(),"Kliknięto OK",
                        Toast.LENGTH_SHORT).show();
            }
        });
        pobieranieWartosci.setButton(DialogInterface.BUTTON_NEGATIVE,
                "Anuluj",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,
                                        int which)
                    {
                        Toast.makeText(getBaseContext(),
                                "Kliknięto Anuluj",
                                Toast.LENGTH_SHORT).show();
                    }
                });
        pobieranieWartosci.show();
        new Thread(new Runnable(){
            public void run(){
                for (int i=1; i<=10; i++) {
                    try {
                        Thread.sleep(1500);
                        pobieranieWartosci.incrementProgressBy(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                pobieranieWartosci.dismiss();
            }
        }).start();
    }

}
