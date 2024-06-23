import java.util.*;

public class Tratamiento {

    public Tratamiento(Integer idTratamiento, String descripcion, CitaMedica citaMedica, Date fechaRealizacion) {
        this.idTratamiento = idTratamiento;
        this.descripcion = descripcion;
        this.citaMedica = citaMedica;
        this.fechaRealizacion = fechaRealizacion;
    }

    private Integer idTratamiento;

    private String descripcion;

    private CitaMedica citaMedica;

    private Date fechaRealizacion;

    public Integer getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(Integer idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public CitaMedica getCitaMedica() {
        return citaMedica;
    }

    public void setCitaMedica(CitaMedica citaMedica) {
        this.citaMedica = citaMedica;
    }

    public Date getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(Date fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

}