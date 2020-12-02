package co.com.sofka.oursofka.incapacidad.vo;


import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;

public class CertificadoIncapacidad implements ValueObject<CertificadoIncapacidad.Props> {

    private final String rutaCertificado;
    private final  Enfermedad enfermedad;
    private final Date fechaInicio;
    private final Date fechaFin;

    public CertificadoIncapacidad(String rutaCertificado, Enfermedad enfermedad, Date fechaInicio, Date fechaFin ){
        this.rutaCertificado = rutaCertificado;
        this.enfermedad = enfermedad;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    @Override
    public Props value(){
        return new Props() {
            @Override
            public String getRutaCertificado() {
                return rutaCertificado;
            }

            @Override
            public Date getFechaInicio() {
                return fechaInicio;
            }

            @Override
            public Date getFechaFin() {
                return fechaFin;
            }

            @Override
            public Enfermedad getEnfermedad() {
                return enfermedad;
            }
        };
    }


    public interface Props{
        String getRutaCertificado();
        Date getFechaInicio();
        Date getFechaFin();
        Enfermedad getEnfermedad();
    }


}
