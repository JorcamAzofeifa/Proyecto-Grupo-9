import javax.swing.JOptionPane;

public class ClaseGym {
    private int idClase;
    private String nombreClase;
    private String horario;
    private int cupoMaximo;
    private int cupoDisponible;

    public ClaseGym(int idClase, String nombreClase, String horario, int cupoMaximo) {
        this.idClase = idClase;
        this.nombreClase = nombreClase;
        this.horario = horario;
        this.cupoMaximo = cupoMaximo;
        this.cupoDisponible = cupoMaximo; 
    }

    public int getIdClase() {
        return idClase;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public String getHorario() {
        return horario;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public int getCupoDisponible() {
        return cupoDisponible;
    }

    public void reservarCupo() {
        if (cupoDisponible > 0) {
            cupoDisponible--;
        } else {
            JOptionPane.showMessageDialog(null, "No hay cupos disponibles para esta clase", "Clase Llena", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void cancelarCupo() {
        if (cupoDisponible < cupoMaximo) {
            cupoDisponible++;
        }
    }
}
