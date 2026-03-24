public class SistemaReservasGym {
    
    // Arreglos basicos con un tamaño maximo definido
    private static Cliente[] clientes = new Cliente[100];
    private static ClaseGym[] clases = new ClaseGym[100];
    private static Reserva[] reservas = new Reserva[100];
    
    // Contadores para llevar el control de los espacios ocupados
    private static int cantidadClientes = 0;
    private static int cantidadClases = 0;
    private static int cantidadReservas = 0;

    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal() {
        int opcion = 0;
        do {
            String menu = "MENU PRINCIPAL\n"
                        + "1 Gestion de cliente\n"
                        + "2 Gestion de clases\n"
                        + "3 Gestion de reservas\n"
                        + "4 Salir";
            
            String entrada = JOptionPane.showInputDialog(null, menu);
            
            if (entrada == null) {
                opcion = 4;
            } else {
                try {
                    opcion = Integer.parseInt(entrada);
                } catch (NumberFormatException e) {
                    opcion = 0;
                }
            }

            switch (opcion) {
                case 1:
                    menuClientes();
                    break;
                case 2:
                    menuClases();
                    break;
                case 3:
                    menuReservas();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
            }
        } while (opcion != 4);
    }

    public static void menuClientes() {
        int opcion = 0;
        do {
            String menu = "GESTION DE CLIENTES\n"
                        + "1 Registrar cliente\n"
                        + "2 Listar clientes\n"
                        + "3 Volver";
            
            String entrada = JOptionPane.showInputDialog(null, menu);
            
            if (entrada == null) {
                opcion = 3;
            } else {
                try {
                    opcion = Integer.parseInt(entrada);
                } catch (NumberFormatException e) {
                    opcion = 0;
                }
            }

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Opcion Registrar cliente en construccion");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Opcion Listar clientes en construccion");
                    break;
                case 3:
                    break; 
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
            }
        } while (opcion != 3);
    }

    public static void menuClases() {
        int opcion = 0;
        do {
            String menu = "GESTION DE CLASES\n"
                        + "1 Crear clase\n"
                        + "2 Listar clases\n"
                        + "3 Volver";
            
            String entrada = JOptionPane.showInputDialog(null, menu);
            
            if (entrada == null) {
                opcion = 3;
            } else {
                try {
                    opcion = Integer.parseInt(entrada);
                } catch (NumberFormatException e) {
                    opcion = 0;
                }
            }

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Opcion Crear clase en construccion");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Opcion Listar clases en construccion");
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
            }
        } while (opcion != 3);
    }

    public static void menuReservas() {
        int opcion = 0;
        do {
            String menu = "GESTION DE RESERVAS\n"
                        + "1 Realizar reserva\n"
                        + "2 Cancelar reserva\n"
                        + "3 Listar reservas\n"
                        + "4 Volver";
            
            String entrada = JOptionPane.showInputDialog(null, menu);
            
            if (entrada == null) {
                opcion = 4;
            } else {
                try {
                    opcion = Integer.parseInt(entrada);
                } catch (NumberFormatException e) {
                    opcion = 0;
                }
            }

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Opcion Realizar reserva en construccion");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Opcion Cancelar reserva en construccion");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Opcion Listar reservas en construccion");
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
            }
        } while (opcion != 4);
    }
}
