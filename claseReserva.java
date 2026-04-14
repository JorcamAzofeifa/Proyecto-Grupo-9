package com.mycompany.proyectogrupo9;

public class Reserva {

    private int idReserva;
    private String nombreCliente;
    private String nombreClase;
    private EstadoReserva estadoReserva;

    public Reserva(int idReserva, String nombreCliente, String nombreClase, EstadoReserva estadoReserva) {
        this.idReserva = idReserva;
        this.nombreCliente = nombreCliente;
        this.nombreClase = nombreClase;
        this.estadoReserva = estadoReserva;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public EstadoReserva getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(EstadoReserva estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public String mostrarInfoReserva() {
        return "ID Reserva: " + idReserva
                + "\nCliente: " + nombreCliente
                + "\nClase: " + nombreClase
                + "\nEstado: " + estadoReserva;
    }
}
