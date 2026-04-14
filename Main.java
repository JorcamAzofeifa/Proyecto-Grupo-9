import javax.swing.JOptionPane;

public class SistemaReservasGym {

    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal() {
        int opcion;

        do {
            String menu = "=== MENÚ PRINCIPAL ===\n"
                    + "1. Gestión de Clientes\n"
                    + "2. Gestión de Clases\n"
                    + "3. Gestión de Reservas\n"
                    + "4. Salir\n\n"
                    + "Seleccione una opción:";

            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            if (opcion == 1) {
                MenuClientes.menuClientes();
            } else if (opcion == 2) {
                MenuClases.menuClases();
            } else if (opcion == 3) {
                MenuReservas.menuReservas();
            } else if (opcion == 4) {
                JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
            } else {
                JOptionPane.showMessageDialog(null, "Opción inválida.");
            }

        } while (opcion != 4);
    }
}
