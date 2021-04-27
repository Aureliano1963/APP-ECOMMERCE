package com.example.e_commerse;

public class UsuarioInventario {

    public String usuario;
    public String telefono;
    public String email;

    public UsuarioInventario(String usuario, String telefono, String email) {
        this.usuario = usuario;
        this.telefono = telefono;
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

