import java.util.*;

public class Factura {

    private CitaMedica cita;

    private Double monto;

    private boolean estadoPago;
    
    private String seguroMedico;

    private int descuento;

    public Factura(CitaMedica cita, Double monto, boolean estadoPago, Boolean jubilado, String seguroMedico,
            int descuento) {
        this.cita = cita;
        this.monto = monto;
        this.estadoPago = estadoPago;
        this.seguroMedico = seguroMedico;
        this.descuento = descuento;
    }

    public CitaMedica getCita() {
        return cita;
    }

    public void setCita(CitaMedica cita) {
        this.cita = cita;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public boolean isEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(boolean estadoPago) {
        this.estadoPago = estadoPago;
    }

    public String getSeguroMedico() {
        return seguroMedico;
    }

    public void setSeguroMedico(String seguroMedico) {
        this.seguroMedico = seguroMedico;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public CostoStrategy obtenerMontoFinal() {
        return Contexto();
    }

/*public class Contexto {
    
private CostoStrategy estrategia;

public Contexto(CostoStrategy estrategia){
    this.estrategia = estrategia;   
}

public CostoStrategy getEstrategia() {
    return estrategia;
}

public void setEstrategia(CostoStrategy estrategia) {
    if(Factura.getJubilado() == true || Factura.getDescuento() != 0);
}

public double obtenerCosto(){
    
}

}
*/
}