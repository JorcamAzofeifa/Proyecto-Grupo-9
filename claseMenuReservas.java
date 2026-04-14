import javax.swing.JOptionPane;

public class MenuReservas {

    static Reserva[] reservas = new Reserva[20];
    static int cantidadReservas = 4;
    static int siguienteIdReserva = 5;

    static {
        reservas[0] = new Reserva(1, "Luis Martinez", "Spinning", EstadoReserva.ACTIVA);
        reservas[1] = new Reserva(2, "Ana Rodriguez", "Yoga", EstadoReserva.ACTIVA);
        reservas[2] = new Reserva(3, "Carlos Sanchez", "Crossfit", EstadoReserva.ACTIVA);
        reservas[3] = new Reserva(4, "Sofia Herrera", "Zumba", EstadoReserva.ACTIVA);
    }

    public static void menuReservas() {
        int opcion = 0;

        do {
            String entrada = JOptionPane.showInputDialog(
                    "=== MENU RESERVAS ===\n"
                    + "1. Realizar reserva\n"
                    + "2. Cancelar reserva\n"
                    + "3. Listar reservas\n"
                    + "4. Volver\n\n"
                    + "Seleccione una opcion:"
            );

            if (entrada == null) {
                return;
            }

            opcion = Integer.parseInt(entrada);

            if (opcion == 1) {
                realizarReserva();
            } else if (opcion == 2) {
                cancelarReserva();
            } else if (opcion == 3) {
                listarReservas();
            } else if (opcion != 4) {
                JOptionPane.showMessageDialog(null, "Opcion invalida.");
                opcion = 0;
            }

        } while (opcion != 4);
    }

    public static void realizarReserva() {
        if (cantidadReservas >= reservas.length) {
            JOptionPane.showMessageDialog(null, "No se pueden registrar mas reservas.");
            return;
        }

        if (MenuClientes.cantidadClientes == 0) {
            JOptionPane.showMessageDialog(null, "No hay clientes registrados.");
            return;
        }

        if (MenuClases.cantidadClases == 0) {
            JOptionPane.showMessageDialog(null, "No hay clases registradas.");
            return;
        }

        String listaClientes = "=== CLIENTES DISPONIBLES ===\n\n";
        for (int i = 0; i < MenuClientes.cantidadClientes; i++) {
            listaClientes += "ID: " + MenuClientes.clientes[i].getIdCliente()
                    + " | Nombre: " + MenuClientes.clientes[i].getNombreCliente() + "\n";
        }

        String idClienteTexto = JOptionPane.showInputDialog(listaClientes + "\nIngrese el ID del cliente:");
        if (idClienteTexto == null || idClienteTexto.equals("")) {
            return;
        }

        int posicionCliente = buscarClientePorId(Integer.parseInt(idClienteTexto));

        if (posicionCliente == -1) {
            JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
            return;
        }

        String nombreCliente = MenuClientes.clientes[posicionCliente].getNombreCliente();

        String idClaseTexto = JOptionPane.showInputDialog(MenuClases.obtenerListaClases() + "\nIngrese el ID de la clase:");
        if (idClaseTexto == null || idClaseTexto.equals("")) {
            return;
        }

        int posicionClase = MenuClases.buscarClasePorId(Integer.parseInt(idClaseTexto));

        if (posicionClase == -1) {
            JOptionPane.showMessageDialog(null, "Clase no encontrada.");
            return;
        }

        String nombreClase = MenuClases.nombresClases[posicionClase];

        reservas[cantidadReservas] = new Reserva(siguienteIdReserva, nombreCliente, nombreClase, EstadoReserva.ACTIVA);
        cantidadReservas++;
        siguienteIdReserva++;

        int activas = MenuClientes.clientes[posicionCliente].getReservasActivas();
        MenuClientes.clientes[posicionCliente].setReservasActivas(activas + 1);

        JOptionPane.showMessageDialog(null, "Reserva realizada correctamente.");
    }

    public static void cancelarReserva() {
        if (cantidadReservas == 0) {
            JOptionPane.showMessageDialog(null, "No hay reservas registradas.");
            return;
        }

        String lista = "=== RESERVAS DISPONIBLES ===\n\n";
        for (int i = 0; i < cantidadReservas; i++) {
            lista += "ID: " + reservas[i].getIdReserva()
                    + " | Cliente: " + reservas[i].getNombreCliente()
                    + " | Clase: " + reservas[i].getNombreClase()
                    + " | Estado: " + reservas[i].getEstadoReserva() + "\n";
        }

        String idTexto = JOptionPane.showInputDialog(lista + "\nIngrese el ID de la reserva a cancelar:");
        if (idTexto == null || idTexto.equals("")) {
            return;
        }

        int posicionReserva = buscarReservaPorId(Integer.parseInt(idTexto));

        if (posicionReserva == -1) {
            JOptionPane.showMessageDialog(null, "No se encontro una reserva con ese ID.");
            return;
        }

        if (reservas[posicionReserva].getEstadoReserva() == EstadoReserva.CANCELADA) {
            JOptionPane.showMessageDialog(null, "Esa reserva ya esta cancelada.");
            return;
        }

        reservas[posicionReserva].setEstadoReserva(EstadoReserva.CANCELADA);

        int posicionCliente = buscarClientePorNombre(reservas[posicionReserva].getNombreCliente());
        if (posicionCliente != -1) {
            int activas = MenuClientes.clientes[posicionCliente].getReservasActivas();
            if (activas > 0) {
                MenuClientes.clientes[posicionCliente].setReservasActivas(activas - 1);
            }
        }

        JOptionPane.showMessageDialog(null, "Reserva cancelada correctamente.");
    }

    public static int buscarClientePorId(int id) {
        for (int i = 0; i < MenuClientes.cantidadClientes; i++) {
            if (MenuClientes.clientes[i].getIdCliente() == id) {
                return i;
            }
        }
        return -1;
    }

    public static int buscarClientePorNombre(String nombre) {
        for (int i = 0; i < MenuClientes.cantidadClientes; i++) {
            if (MenuClientes.clientes[i].getNombreCliente().equalsIgnoreCase(nombre)) {
                return i;
            }
        }
        return -1;
    }

    public static int buscarReservaPorId(int id) {
        for (int i = 0; i < cantidadReservas; i++) {
            if (reservas[i].getIdReserva() == id) {
                return i;
            }
        }
        return -1;
    }

    public static void listarReservas() {
        if (cantidadReservas == 0) {
            JOptionPane.showMessageDialog(null, "No hay reservas registradas.");
            return;
        }

        String lista = "=== LISTA DE RESERVAS ===\n\n";
        for (int i = 0; i < cantidadReservas; i++) {
            lista += reservas[i].mostrarInfoReserva() + "\n-------------------------\n";
        }

        JOptionPane.showMessageDialog(null, lista);
    }
}
