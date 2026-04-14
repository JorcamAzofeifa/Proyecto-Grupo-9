import javax.swing.JOptionPane;

public class MenuReservas {

    public static void menuReservas() {
        int opcion;

        do {
            String menu = "=== MENÚ RESERVAS ===\n"
                    + "1. Realizar reserva\n"
                    + "2. Cancelar reserva\n"
                    + "3. Listar reservas\n"
                    + "4. Volver\n\n"
                    + "Seleccione una opción:";

            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            if (opcion == 1) {
                JOptionPane.showMessageDialog(null, "Función realizarReserva");
            } else if (opcion == 2) {
                JOptionPane.showMessageDialog(null, "Función cancelarReserva");
            } else if (opcion == 3) {
                JOptionPane.showMessageDialog(null, "Función listarReservas");
            } else if (opcion == 4) {
                JOptionPane.showMessageDialog(null, "Volviendo...");
            } else {
                JOptionPane.showMessageDialog(null, "Opción inválida.");
            }

        } while (opcion != 4);
    }
}
