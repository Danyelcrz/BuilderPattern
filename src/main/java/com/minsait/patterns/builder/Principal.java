package com.minsait.patterns.builder;

public class Principal {

    public static void main(String[] args) {
        UsuarioBuilder usuarioBuilderUno = new UsuarioBuilder("Daniel", 24, "123");
        Usuario usuarioUno = usuarioBuilderUno.apellidoPaterno("Cruz").apellidoMaterno("Martinez").curp("CUMD950206HDFRRN05").rfc("CUMD9502066Z8").build();
        System.out.println(usuarioUno);

        UsuarioBuilder usuarioBuilderDos = new UsuarioBuilder("Ydalia", 25, "abc");
        Usuario usuarioDos = usuarioBuilderDos.apellidoPaterno("Delgado").build();

        System.out.println(usuarioDos);
    }
}
