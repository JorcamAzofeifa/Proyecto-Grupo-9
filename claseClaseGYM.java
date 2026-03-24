import javax.swing.JOptionPane;

public class MenuClases {

    public static void menuClases() {
        int opcion;

        do {
            String menu = "=== MENÚ CLASES ===\n"
                    + "1. Crear clase\n"
                    + "2. Listar clases\n"
                    + "3. Volver\n\n"
                    + "Seleccione una opción:";

            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            if (opcion == 1) {
                JOptionPane.showMessageDialog(null, "Función crearClase");
            } else if (opcion == 2) {
                JOptionPane.showMessageDialog(null, "Función listarClases");
            } else if (opcion == 3) {
                JOptionPane.showMessageDialog(null, "Volviendo...");
            } else {
                JOptionPane.showMessageDialog(null, "Opción inválida.");
            }

        } while (opcion != 3);
    }
}
