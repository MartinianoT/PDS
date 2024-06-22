
import java.util.*;

/**
 * 
 */
public class AdministradorClinicaMedica {

    /**
     * Default constructor
     */
    public AdministradorClinicaMedica() {
    }

    /**
     * 
     */
    private Lista<Paciente> pacientes;

    /**
     * 
     */
    private Lista<CitaMedica> citasMedicas;

    /**
     * 
     */
    private NotificadoraCambios notificador;

    /**
     * 
     */
    private singleton instancia;

    /**
     * 
     */
    public void <constructor>+AdministradorClinicaMedica(pacientes: <List>{Paciente}, citasMedicas: <List>{CitaMedica}, notificador: NotificadoraCambios)() {
        // TODO implement here
    }

    /**
     * @param paciente 
     * @return
     */
    public void registrarNuevoPaciente(Paciente paciente) {
        // TODO implement here
        return null;
    }

    /**
     * @param cita 
     * @return
     */
    public void programarCitaMedica(CitaMedica cita) {
        // TODO implement here
        return null;
    }

    /**
     * @param especialidad 
     * @param medico 
     * @param fecha 
     * @return
     */
    public Lista<CitaMedica> filtrarCitasMedicas(Especialidad? especialidad, Medico? medico, Date? fecha) {
        // TODO implement here
        return null;
    }

    /**
     * @param cita 
     * @return
     */
    public Factura generarFactura(CitaMedica cita) {
        // TODO implement here
        return null;
    }

    /**
     * @param cita 
     * @return
     */
    public void notificarCambioCita(CitaMedica cita) {
        // TODO implement here
        return null;
    }

    /**
     * @param cita 
     * @return
     */
    public void registrarCambioCita(CitaMedica cita) {
        // TODO implement here
        return null;
    }

    /**
     * @param message 
     * @return
     */
    public void notificar(String message) {
        // TODO implement here
        return null;
    }

    /**
     * 
     */
    private void Singleton() {
        // TODO implement here
    }

    /**
     * @return
     */
    public Singleton getInstancia() {
        // TODO implement here
        return null;
    }

}