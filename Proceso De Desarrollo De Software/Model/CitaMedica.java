
import java.util.*;

/**
 * 
 */
public class CitaMedica {

    /**
     * Default constructor
     */
    public CitaMedica() {
    }

    /**
     * 
     */
    private Paciente paciente;

    /**
     * 
     */
    private Medico medicoAsignado;

    /**
     * 
     */
    private LocalDate fechaHora;

    /**
     * 
     */
    private String motivoConsulta;

    /**
     * 
     */
    private String estado;

    /**
     * 
     */
    public void Attribute1;

    /**
     * 
     */
    private String especialidadMedica;

    /**
     * 
     */
    private double costoCitaMedica;

    /**
     * 
     */
    private Lista<Tratamiento> tratamientos;

    /**
     * 
     */
    public void <constructor>+CitaMedica(paciente: Paciente, medicoAsignado: Medico, fechaHora: LocalDate, motivoConsulta: String)() {
        // TODO implement here
    }

    /**
     * @return
     */
    public String obtenerInformacionPaciente() {
        // TODO implement here
        return "";
    }

    /**
     * @param nuevoEstado 
     * @return
     */
    public void cambiarEstado(String nuevoEstado) {
        // TODO implement here
        return null;
    }

    /**
     * @param costoCitaMedica 
     * @param especialidadMedica 
     * @param descuento 
     * @return
     */
    public double calcularPrecioTotal(double costoCitaMedica, String especialidadMedica, int descuento) {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @param tratamiento 
     * @return
     */
    public void agregarTratamiento(Tratamiento tratamiento) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Lista<Tratamiento> obtenerTratamientos() {
        // TODO implement here
        return null;
    }

}