
import java.util.*;

/**
 * 
 */
public class PagosAdapter extends InterfazPagos {

    /**
     * Default constructor
     */
    public PagosAdapter() {
        this.adaptador = new ServicioExterno();
    }

    /**
     * 
     */
    private ServicioExterno adaptador;

    /**
     * @param factura
     */
    public void procesarPago(Factura factura) {
        if (factura == null) {
            throw new IllegalArgumentException("La factura no puede ser nula");
        }
        
        try {
            boolean resultado = adaptador.procesarPago(factura);
            
            if (resultado) {
                factura.setEstadoPago(true);
                System.out.println("Pago procesado exitosamente para la factura con cita: " + factura.getCita().getId());
            } else {
                System.out.println("Fallo al procesar el pago para la factura con cita: " + factura.getCita().getId());
            }
        } catch (Exception e) {
            System.err.println("Error al procesar el pago: " + e.getMessage());
        }
    }
        // TODO implement here
    }

}
