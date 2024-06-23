import java.util.*;

public class CostoConDescuento implements CostoStrategy {

    public double obtenerMontoFinal(double descuentoFinal, double monto) {
        return monto * descuentoFinal / 100;
    }

}