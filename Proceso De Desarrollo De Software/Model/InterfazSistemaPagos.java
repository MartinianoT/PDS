
import java.util.*;

/**
 * 
 */
public class InterfazSistemaPagos {

   private PagosAdapter pagosAdapter;
    public InterfazSistemaPagos() {
         this.pagosAdapter = new PagosAdapter();
    }

    /**
     * @param factura 
     * @return
     */
    public void procesarPago(Factura factura) {
       if (factura == null) {
            throw new IllegalArgumentException("La factura no puede ser nula");
        }
        
        pagosAdapter.procesarPago(factura);
    }

    /**
     * @param cita 
     * @return
     */
    public void enviarRecordatorioPago(CitaMedica cita) {
    if (cita == null) {
            throw new IllegalArgumentException("La cita médica no puede ser nula");
        }
        
        // Simular el envío de un recordatorio de pago
        System.out.println("Enviando recordatorio de pago para la cita: " + cita.getId() + " - " + cita.getDescripcion());
    }
hola tontin
}
