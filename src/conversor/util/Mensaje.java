package conversor.util;

import conversor.modelo.Conversion;

public class Mensaje {

    public void mostrarInfo (Conversion conversion, double monto){

        System.out.println("-------------------------");
        System.out.println("Moneda a convertir: " + conversion.base_code());
        System.out.println("Convertir a: " + conversion.target_code());
        System.out.println("Tasa: "+ conversion.conversion_rate());
        System.out.println("El resultado es: " + conversion.convertir(monto) + " " + conversion.target_code());
        System.out.println("Ultima actualización: "+ conversion.time_last_update_utc());
        System.out.println("Próxima actualización: "+ conversion.time_next_update_utc());
        System.out.println("-------------------------");
    }
    
}
