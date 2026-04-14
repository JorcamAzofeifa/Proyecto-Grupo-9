package com.mycompany.proyectogrupo9;

import javax.swing.JOptionPane;

public class MenuClientes {

    static Cliente[] clientes = new Cliente[20];
    static int cantidadClientes = 5;
    static int siguienteIdCliente = 6;

    static {
        clientes[0] = new Cliente(1, "Luis Martinez", "8888-1111", 1);
        clientes[1] = new Cliente(2, "Ana Rodriguez", "8888-2222", 1);
        clientes[2] = new Cliente(3, "Carlos Sanchez", "8888-3333", 1);
        clientes[3] = new Cliente(4, "Sofia Herrera", "8888-4444", 1);
        clientes[4] = new Cliente(5, "Diego Fernandez", "8888-5555", 0);
    }

    public static void menuClientes() {
        int opcion = 0;

        do {
            String entrada = JOptionPane.showInputDialog(
                    "=== MENU CLIENTES ===\n"
                    + "1. Registrar cliente\n"
                    + "2. Listar clientes\n"
                    + "3. Volver\n\n"
                    + "Seleccione una opcion:"
            );

            if (entrada == null) {
                return;
            }

            opcion = Integer.parseInt(entrada);

            if (opcion == 1) {
                registrarCliente();
            } else if (opcion == 2) {
                listarClientes();
            } else if (opcion != 3) {
                JOptionPane.showMessageDialog(null, "Opcion invalida.");
                opcion = 0;
            }

        } while (opcion != 3);
    }

    public static void registrarCliente() {
        if (cantidadClientes >= clientes.length) {
            JOptionPane.showMessageDialog(null, "No se pueden registrar mas clientes.");
            return;
        }

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
        if (nombre == null || nombre.equals("")) {
            return;
        }

        String telefono = JOptionPane.showInputDialog("Ingrese el telefono del cliente:");
        if (telefono == null || telefono.equals("")) {
            return;
        }

        clientes[cantidadClientes] = new Cliente(siguienteIdCliente, nombre, telefono, 0);
        cantidadClientes++;
        siguienteIdCliente++;

        JOptionPane.showMessageDialog(null, "Cliente registrado correctamente.");
    }

    public static void listarClientes() {
        if (cantidadClientes == 0) {
            JOptionPane.showMessageDialog(null, "No hay clientes registrados.");
            return;
        }

        String lista = "=== LISTA DE CLIENTES ===\n\n";

        for (int i = 0; i < cantidadClientes; i++) {
            lista += clientes[i].mostrarInfoCliente() + "\n-------------------------\n";
        }

        JOptionPane.showMessageDialog(null, lista);
    }
}
