package com.pteplus.petplus;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.pteplus.petplus.bd.DbMascota;
import com.pteplus.petplus.bd.DbVeterinara;

public class AgregarVeterinariaActivity extends AppCompatActivity {
    private EditText nombre_veterinaria, nombre_medico, telefono, celular, direccion;

    private Button btnAgregar, btnCancelar;

    DbVeterinara dbVeterinara;
    DbMascota dbMascota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_veterinaria);

        nombre_veterinaria = findViewById(R.id.et_nombre_veterinaria);
        nombre_medico = findViewById(R.id.et_nombre_veterinario);
        telefono = findViewById(R.id.et_telefono);
        celular = findViewById(R.id.et_telefono);
        direccion = findViewById(R.id.et_direccion);
        btnAgregar = findViewById(R.id.btn_agregar);
        btnCancelar = findViewById(R.id.btn_cancelar);

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbVeterinara = new DbVeterinara(AgregarVeterinariaActivity.this);
                dbMascota = new DbMascota(AgregarVeterinariaActivity.this);

            }
        });


    }
}