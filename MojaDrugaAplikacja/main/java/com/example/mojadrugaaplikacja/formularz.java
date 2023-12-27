package com.example.mojadrugaaplikacja;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class formularz extends AppCompatActivity {

    private EditText poleNick;
    private EditText poleHaslo;
    private EditText poleHasloPowtorz;
    private Switch czyPelnoletni;
    private CheckBox kobieta;
    private CheckBox mezczyzna;
    private CheckBox inne;
    private ImageButton info1;
    private ImageButton info2;
    private ImageButton info3;
    private Button zatwierdz;
    private TextView podsumowanie;

    private String czyPelnoletniWartosc;
    private String plec;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.formularz);

        poleNick = findViewById(R.id.poleNick_formularz);
        poleHaslo = findViewById(R.id.poleHaslo_formularz);
        poleHasloPowtorz = findViewById(R.id.poleHasloPowtorz_fomularz);
        czyPelnoletni = findViewById(R.id.czyPelnoletni_formularz);
        kobieta = findViewById(R.id.kobieta_formularz);
        mezczyzna = findViewById(R.id.mezczyzna_formularz);
        inne = findViewById(R.id.inne_formularz);
        info1 = findViewById(R.id.info1_formularz);
        info2 = findViewById(R.id.info2_formularz);
        info3 = findViewById(R.id.info3_formularz);
        zatwierdz = findViewById(R.id.zatwierdz_formularz);
        podsumowanie = findViewById(R.id.podsumowanie_formularz);

        kobieta.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (kobieta.isChecked()){

                    mezczyzna.setChecked(false);
                    inne.setChecked(false);

                    plec = "kobieta";
                    //Toast.makeText(formularz.this, plec.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        mezczyzna.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (mezczyzna.isChecked()){

                    kobieta.setChecked(false);
                    inne.setChecked(false);

                    plec = "mężczyzna";
                    //Toast.makeText(formularz.this, plec.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        inne.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (inne.isChecked()){

                    kobieta.setChecked(false);
                    mezczyzna.setChecked(false);

                    plec = "inna";
                    //Toast.makeText(formularz.this, plec.toString(), Toast.LENGTH_SHORT).show();
                }

            }
        });

        czyPelnoletni.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(czyPelnoletni.isChecked()){

                    czyPelnoletniWartosc = "Pełnoletni";

                } else {

                    czyPelnoletniWartosc = "Nie ukończono 18 lat";

                }

            }
        });

        zatwierdz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Editable poleNickWartosc = poleNick.getText();
                Editable poleHasloWartosc = poleHaslo.getText();
                Editable polePowtorzHasloWartosc = poleHasloPowtorz.getText();

                if (walidacjaNick(poleNickWartosc.toString())){

                    if (walidacjaHaslo(poleHasloWartosc.toString())){

                        if (polePowtorzHasloWartosc.toString().equals(poleHasloWartosc.toString())){

                            if (plec == null){

                                Toast.makeText(formularz.this, "Musisz wybrać płeć !", Toast.LENGTH_SHORT).show();

                            } else {

                                podsumowanie.setText("Zarejestrowano pomyślnie ! "+poleNickWartosc+", płeć "+plec+", Zarejestrowany jest "+czyPelnoletniWartosc);

                            }

                        } else {

                            Toast.makeText(formularz.this, "Hasła się różnią", Toast.LENGTH_SHORT).show();
                            
                        }

                    } else {

                        Toast.makeText(formularz.this, "Hasło musi zawierać liczbę, dużą literę oraz", Toast.LENGTH_SHORT).show();
                        Toast.makeText(formularz.this, "znak specjalny [ ! @ # % & ]", Toast.LENGTH_SHORT).show();

                        poleHaslo.setText("");
                        poleHasloPowtorz.setText("");

                    }

                } else {

                    Toast.makeText(formularz.this, "Nick musi zawierać _", Toast.LENGTH_SHORT).show();

                    poleNick.setText("");

                }

            }
        });

        info1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(formularz.this, "Nick musi zawierać _", Toast.LENGTH_SHORT).show();
                
            }
        });

        info2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(formularz.this, "Hasło musi zawierać liczbę, dużą literę oraz", Toast.LENGTH_SHORT).show();
                Toast.makeText(formularz.this, "znak specjalny [ ! @ # % & ]", Toast.LENGTH_SHORT).show();

            }
        });

        info3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(formularz.this, "Hasła muszą być takie same", Toast.LENGTH_SHORT).show();

            }
        });


    }

    boolean walidacjaNick(String nick){

        Pattern pat = Pattern.compile("_");
        Matcher mach = pat.matcher(nick);

        return mach.find();
    }

    boolean walidacjaHaslo(String haslo){
        Pattern pat = Pattern.compile("^(?=.*[0-9])(?=.*[A-Z])(?=.*[!@#%&]).+$");
        Matcher mach = pat.matcher(haslo);

        return mach.find();
    }

}
