package com.mycompany.proyectogrupo9;

public class Cliente {

    private int idCliente;
    private String nombreCliente;
    private String telefonoCliente;
    private int reservasActivas;

    public Cliente(int idCliente, String nombreCliente, String telefonoCliente, int reservasActivas) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.telefonoCliente = telefonoCliente;
        this.reservasActivas = reservasActivas;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public int getReservasActivas() {
        return reservasActivas;
    }

    public void setReservasActivas(int reservasActivas) {
        this.reservasActivas = reservasActivas;
    }

    public String mostrarInfoCliente() {
        return "ID: " + idCliente
                + "\nNombre: " + nombreCliente
                + "\nTelefono: " + telefonoCliente
                + "\nReservas activas: " + reservasActivas;
    }
}
