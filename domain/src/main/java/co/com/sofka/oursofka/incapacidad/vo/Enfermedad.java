package co.com.sofka.oursofka.incapacidad.vo;

import co.com.sofka.domain.generic.ValueObject;

public class Enfermedad implements ValueObject<Enfermedad.Props> {

    private final String codigoEnfermedad;
    private final String nombreEnfermedad;

    public Enfermedad(String codigoEnfermedad, String nombreEnfermedad){
        this.codigoEnfermedad = codigoEnfermedad;
        this.nombreEnfermedad = nombreEnfermedad;
    }

    @Override
    public Props value(){
        return new Props() {
            @Override
            public String geetCodigoEnfermedad() {
                return codigoEnfermedad;
            }

            @Override
            public String getNombreEnfermedad() {
                return nombreEnfermedad;
            }
        };
    }

    public interface Props{
        String geetCodigoEnfermedad();
        String getNombreEnfermedad();
    }
}
