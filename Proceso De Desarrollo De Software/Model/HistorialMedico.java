
import java.util.*;


public class HistorialMedico {
    private Paciente paciente;
    private List<CitaMedica> citasMedicas;
    private int prueba;


    public HistorialMedico(Paciente paciente, List<CitaMedica> citasMedicas) {
        this.paciente = paciente;
        this.citasMedicas = citasMedicas;
    }

    
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

   
    public List<CitaMedica> getCitasMedicas() {
        return citasMedicas;
    }

    public void setCitasMedicas(List<CitaMedica> citasMedicas) {
        this.citasMedicas = citasMedicas;
    }

    //agregar al diagrama
    public void agregarCitaMedica(CitaMedica cita) {
        this.citasMedicas.add(cita);
    }

    public List<CitaMedica> obtenerCitasMedicas() {
        return this.citasMedicas;
    }
}
