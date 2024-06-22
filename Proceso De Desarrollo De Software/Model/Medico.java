
import java.util.*;

public class Medico {

    private String nombre;

    private String apellido;

    private EspecialidadMedica especialidad;

    private Integer iDMedico;

    /**
     * Default constructor
     */
    public Medico(String nombre, String apellido, EspecialidadMedica especialidad, Integer iDMedico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.iDMedico = iDMedico;
    }

    /* Getters */
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public EspecialidadMedica getEspecialidad() {
        return especialidad;
    }

    public Integer getiDMedico() {
        return iDMedico;
    }

    /* Setters */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEspecialidad(EspecialidadMedica especialidad) {
        this.especialidad = especialidad;
    }

    public void setiDMedico(Integer iDMedico) {
        this.iDMedico = iDMedico;
    }

}
