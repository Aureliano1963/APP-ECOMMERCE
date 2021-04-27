package com.example.e_commerse.tgo;

public class UserAdmin {
    private int id;
    private String nombre;
    private String telefono;
    private String correo;
    private String password;
    private String tipo;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre= nombre;
    }

    public String gettelefono() {
        return telefono;
    }

    public void settelefono(String telefono) {
        this.telefono= telefono;
    }

    public String getcorreo() {
        return correo;
    }

    public void setcorreo(String correo) {
        this.correo= correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String gettipo() {
        return tipo;
    }

    public void settipo(String tipo) { this.tipo = tipo;  }

}

