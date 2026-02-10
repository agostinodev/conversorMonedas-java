package conversor.modelo;

public record Conversion( String base_code,
                          String target_code,
                          double conversion_rate,
                          String time_last_update_utc,
                          String time_next_update_utc
)  {

    public double convertir( double monto){
        return monto * conversion_rate;
    }

}
