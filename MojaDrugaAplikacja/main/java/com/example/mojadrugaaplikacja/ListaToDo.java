package com.example.mojadrugaaplikacja;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListaToDo extends AppCompatActivity {

    private Button przycisk;
    private EditText pole;
    private ListView lista;
    private ArrayList listaZawartosc;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.listatodo);

        przycisk = findViewById(R.id.przycisk_listaToDo);
        pole = findViewById(R.id.pole_listaToDo);
        lista = findViewById(R.id.lista_listaToDo);

        listaZawartosc = new ArrayList();

        ArrayAdapter adapterLista = new ArrayAdapter(this, android.R.layout.simple_list_item_1,listaZawartosc);
        lista.setAdapter(adapterLista);

        przycisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Editable wartoscPole = pole.getText();

                if (pole.length() == 0){

                    Toast.makeText(ListaToDo.this, "Pole nie może być puste", Toast.LENGTH_SHORT).show();
                    
                } else {

                    listaZawartosc.add(wartoscPole);
                    adapterLista.notifyDataSetChanged();
                    pole.setText("");
                    
                }

            }
        });

    }
}
