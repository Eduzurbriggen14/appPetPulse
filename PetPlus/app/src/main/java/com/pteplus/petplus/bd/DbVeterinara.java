package com.pteplus.petplus.bd;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

public class DbVeterinara extends BaseDeDatos{
    Context context;
    public DbVeterinara(@Nullable Context context) {
        super(context);
        this.context = context;
    }

    public long crearVeterinaria(String nombre, String veterinario, String telefono, String celular, String direccion, int id_mascota){
        long id_vete = -1;

        SQLiteDatabase db= getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(BaseDeDatos.COLUMN_NOMBRE_VETERINARIA, nombre);
        values.put(BaseDeDatos.COLUMN_VETERINARIO, veterinario);
        values.put(BaseDeDatos.COLUMN_TELEFONO, telefono);
        values.put(BaseDeDatos.COLUMN_CELULAR, celular);
        values.put(BaseDeDatos.COLUMN_DIRECCION, direccion);
        values.put(BaseDeDatos.COLUMN_ID_MASCOTA, id_mascota);

        try{
            id_vete = db.insert(TABLE_VETERINARIA, null, values);

        }catch (Exception ex){
            ex.toString();
        }finally {
            db.close();
        }
        return id_vete;
    }
}
