import java.util.*;


public class Paciente implements InterfazPaciente {

    private String nombre;
    private String apellido;
    private String dni;
    private Date fechaNacimiento;
    private String direccion;
    private String telefono;
    private String obraSocial;
    private HistorialMedico historialMedico;
    private AdministradorClinicaMedica adminClinica;


    public Paciente(String nombre, String apellido, String dni, Date fechaNacimiento, String direccion, String telefono, String obraSocial) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.obraSocial = obraSocial;
        this.historialMedico = new HistorialMedico(this); 
        this.adminClinica = AdministradorClinicaMedica.getInstance(); 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }

    public HistorialMedico getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(HistorialMedico historialMedico) {
        this.historialMedico = historialMedico;
    }

    //agregar al diagrama
    public void solicitarCitaMedica(Medico medico, Date fechaHora, String motivoConsulta) {
        CitaMedica nuevaCita = new CitaMedica(this, medico, fechaHora, motivoConsulta);
        adminClinica.registrarNuevaCitaMedica(nuevaCita);
        System.out.println("Cita médica solicitada para la fecha: " + fechaHora);
    }

    
    public void verHistorialMedico() {
        List<CitaMedica> citas = historialMedico.obtenerCitasMedicas();
        System.out.println("Historial médico de " + nombre + " " + apellido + ":");
        for (CitaMedica cita : citas) {
            System.out.println("Fecha: " + cita.getFechaHora() + " Médico: " + cita.getMedico().getNombre() + " Motivo: " + cita.getMotivoConsulta());
        }
    }
}