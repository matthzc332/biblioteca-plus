package com.davincicode.bibliotecaplus.comunusuarios.modelo;

public class Usuario {
    private String rol;
    private String nombre;
    private String apellido;
    private String correo;

    public Usuario() {
    }

    public Usuario(String rol,String nombre, String apellido,  String correo){
        this.rol = rol;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }
    public Usuario(String nombre){
        this.nombre = nombre;
    }


    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
