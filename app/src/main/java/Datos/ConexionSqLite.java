package Datos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ConexionSqLite extends SQLiteOpenHelper {

    public ConexionSqLite(@Nullable Context context) {
        super(context, DatosConexion.NombreBD, null, DatosConexion.VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //en esta parte defino los scripts de las tablas
        String ConsultaSql = "create table TblUsuario (idUsuario integer primary key autoincrement," +
                "nombre text,telefono integer,correo text,usuario text,contraseña integer)";
        db.execSQL(ConsultaSql);



        ConsultaSql = "create table tblRegistro_Cliente (idCliente integer primary key autoincrement," +
                "nombre text,telefono integer,correo text,constraseña integer,contraseña1 integer)";
        db.execSQL(ConsultaSql);


        ConsultaSql = "create table tblLogin (idLogin integer primary key autoincrement," +"correo text,contraseña integer)";
                db.execSQL(ConsultaSql);


        ConsultaSql = "create table tblLogin (idLogin_Cliente integer primary key autoincrement," +"correo text,contraseña integer)";
        db.execSQL(ConsultaSql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
