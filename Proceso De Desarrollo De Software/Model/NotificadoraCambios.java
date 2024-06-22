import java.util.*;


public class NotificadoraCambios {

    private Suscriptor suscriptores;
    private String evento


 
    public List<Suscriptor> getSuscriptores() {
        return suscriptores;
    }

    public void setSuscriptores(List<Suscriptor> suscriptores) {
        this.suscriptores = suscriptores;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

  
    public void agregarSuscriptor(Suscriptor suscriptor) {
        this.suscriptores.add(suscriptor);
    }

    
    public void eliminarSuscriptor(Suscriptor suscriptor) {
        this.suscriptores.remove(suscriptor);
    }


    public void notificarSuscriptores(String evento) {
        for (Suscriptor suscriptor : suscriptores) {
            suscriptor.notificar(evento);
        }
    }
}