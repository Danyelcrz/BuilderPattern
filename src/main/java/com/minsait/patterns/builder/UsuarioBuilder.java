package com.minsait.patterns.builder;

public class UsuarioBuilder implements IUsuarioBuilder {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private String curp;
    private String rfc;
    private String contrasenia;

    public UsuarioBuilder(String nombre, int edad, String contrasenia) {//campos obligatorios que debe tener el objeto
        this.nombre = nombre;
        this.edad = edad;
        this.contrasenia = contrasenia;
    }

    public UsuarioBuilder apellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
        return this;
    }

    public UsuarioBuilder apellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
        return this;
    }

    public UsuarioBuilder curp(String curp) {
        this.curp = curp;
        return this;
    }

    public UsuarioBuilder rfc(String rfc) {
        this.rfc = rfc;
        return this;
    }

    @Override
    public Usuario build() {

        Usuario usuario = new Usuario();
        usuario.setNombre(this.nombre);
        usuario.setApellidoPaterno(this.apellidoPaterno);
        usuario.setApellidoMaterno(this.apellidoMaterno);
        usuario.setEdad(this.edad);
        usuario.setCurp(this.curp);
        usuario.setRfc(this.rfc);
        usuario.setContrasenia(this.contrasenia);
        return usuario;
    }
}
