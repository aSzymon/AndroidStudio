// aSzymon - gtihub

package com.example.mojaapkacja;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class oknoGlowne extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Button przyciskPodajImieApk;
    private Button przyciskProstyKalkulator;
    private Spinner spinner;
    private ArrayAdapter listaSpinner;
    private TextView tekst1;
    private Switch switch1;
    private TextView tekst3;
    private ImageButton przyciskObrazek;
    private TextView tytul;

    String[] tabSpinner = {"wybierz opcje","kot","pies","chomik","rybka","szczur","papuga"};


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        oknoDialogoweLoading();

        setContentView(R.layout.okno_glowne);

        przyciskPodajImieApk = findViewById(R.id.przyciskPodajImieApk_oknoGlowne);
        przyciskProstyKalkulator = findViewById(R.id.przyciskProstyKalkulator_oknoGlowne);
        tekst1 = findViewById(R.id.tekst1_oknoGlowne);
        przyciskObrazek = findViewById(R.id.przyciskObrazek_oknoGlowne);
        tytul = findViewById(R.id.tytul_oknoGlowne);

        switch1 = findViewById(R.id.switch1_oknoGlowne);
        tekst3 = findViewById(R.id.tekst3_oknoGlowne);

        tekst3.setText("Jesteś jeszcze dzieckiem"); // jako domyślna wartość

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (switch1.isChecked()){
                    tekst3.setText("Jesteś już dorosły");
                } else {
                    tekst3.setText("Jesteś jeszcze dzieckiem");
                }

            }
        });

        //trzeba długo przytrzymać

        przyciskPodajImieApk.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                startActivity(new Intent(oknoGlowne.this, okno1.class));

                return true;
            }
        });

//        przyciskPodajImieApk.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                startActivity(new Intent(oknoGlowne.this, okno1.class));
//
//            }
//        });

        przyciskProstyKalkulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(oknoGlowne.this, okno2.class));

            }
        });

        przyciskObrazek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(oknoGlowne.this, okno3.class));

            }
        });

        spinner = findViewById(R.id.spinner_oknoGlowne);
        spinner.setOnItemSelectedListener(this);

        listaSpinner = new ArrayAdapter(this, android.R.layout.simple_spinner_item,tabSpinner);
        listaSpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(listaSpinner);

    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        //Toast.makeText(getApplicationContext(), tabSpinner[adapterView.getFirstVisiblePosition()], Toast.LENGTH_SHORT).show();

        tekst1.setText("Wybrane zwierzatko to : "+tabSpinner[adapterView.getFirstVisiblePosition()]);

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }

    public void oknoDialogoweLoading(){

        ProgressDialog ladowanieZasobow = ProgressDialog.show(this,"ŁADOWANIE ZASOBÓW","Proszę czekać...");
        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(3000);
                } catch (Exception e){
                    e.printStackTrace();
                }
                ladowanieZasobow.dismiss();
            }
        }).start();
    }

}
