
import java.util.*;

/**
 * 
 */
public class ServicioExterno implements InterfazServicioExterno {

    /**
     * Default constructor
     */
    public ServicioExterno() {
    }

    /**
     * @param factura
     */
    public void procesarPago(Factura factura) {
        Aquí retornamos true si el pago es exitoso, false en caso contrario
        boolean pagoExitoso = true; 
        factura.setEstadoPago(pagoExitoso);// Valor de retorno simulado
    }

    /**
     * @param factura
     */
    public void procesarPago(Factura factura) {
        // TODO implement here
    }

}
