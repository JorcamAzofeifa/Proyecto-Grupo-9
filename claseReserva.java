import javax.swing.JOptionPane;

public class Reserva {
    private int idReserva;
    private int idCliente;
    private int idClase;

    public Reserva(int idReserva, int idCliente, int idClase) {
        this.idReserva = idReserva;
        this.idCliente = idCliente;
        this.idClase = idClase;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public int getIdClase() {
        return idClase;
    }

    public void mostrarDetalle() {
        String info = "ID Reserva: " + idReserva + "\nID Cliente: " + idCliente + "\nID Clase: " + idClase;
        JOptionPane.showMessageDialog(null, info, "Detalle de la Reserva", JOptionPane.INFORMATION_MESSAGE);
    }
}
