import java.util.*;

public class Factura {

    private CitaMedica cita;

    private Double monto;

    private boolean estadoPago;
    
    private String seguroMedico;

    private int descuento;

    private CostoStrategy descuentoFinal;

    public Factura(CitaMedica cita, Double monto, boolean estadoPago, Boolean jubilado, String seguroMedico,
            int descuento, CostoStrategy descuentoFinal) {
        this.cita = cita;
        this.monto = monto;
        this.estadoPago = estadoPago;
        this.seguroMedico = seguroMedico;
        this.descuento = descuento;
        this.descuentoFinal = descuentoFinal;
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

    public CostoStrategy getdescuentoFinal() {
        return descuentoFinal;
    }

    public void setdescuentoFinal(CostoStrategy descuentoFinal) {
        if( getJubilado() == true && descuento != 0){
            this.descuentoFinal = descuento + 15;
        }
        elif (getJubilado() == true && descuento == 0);{
            this.descuentoFinal = 15;
        }
        elif (getJubilado() == false && descuento != 0);{
            this.descuentoFinal = descuento;
        }
        elif (getJubilado() == false || descuento == 0);{
            this.descuentoFinal = 0;
        }
    }

    public double obtenerMontoFinal(double descuentoFinal, double monto){
        return descuentoFinal.obtenerMontoFinal(descuentoFinal, monto);
    }

}