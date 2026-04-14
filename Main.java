import javax.swing.JOptionPane;

public class ProyectoGrupo9 {

    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal() {
        int opcion = 0;

        do {
            String entrada = JOptionPane.showInputDialog(
                    "=== MENU PRINCIPAL ===\n"
                    + "1. Gestion de Clientes\n"
                    + "2. Gestion de Clases\n"
                    + "3. Gestion de Reservas\n"
                    + "4. Salir\n\n"
                    + "Seleccione una opcion:"
            );

            if (entrada == null) {
                return;
            }

            opcion = Integer.parseInt(entrada);

            if (opcion == 1) {
                MenuClientes.menuClientes();
            } else if (opcion == 2) {
                MenuClases.menuClases();
            } else if (opcion == 3) {
                MenuReservas.menuReservas();
            } else if (opcion == 4) {
                JOptionPane.showMessageDialog(null, "Saliendo...");
            } else {
                JOptionPane.showMessageDialog(null, "Opcion invalida.");
                opcion = 0;
            }

        } while (opcion != 4);
    }
}
