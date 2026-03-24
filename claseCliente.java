import javax.swing.JOptionPane;

public class MenuClientes {

    public static void menuClientes() {
        int opcion;

        do {
            String menu = "=== MENÚ CLIENTES ===\n"
                    + "1. Registrar cliente\n"
                    + "2. Listar clientes\n"
                    + "3. Volver\n\n"
                    + "Seleccione una opción:";

            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            if (opcion == 1) {
                JOptionPane.showMessageDialog(null, "Función registrarCliente");
            } else if (opcion == 2) {
                JOptionPane.showMessageDialog(null, "Función listarClientes");
            } else if (opcion == 3) {
                JOptionPane.showMessageDialog(null, "Volviendo...");
            } else {
                JOptionPane.showMessageDialog(null, "Opción inválida.");
            }

        } while (opcion != 3);
    }
}
