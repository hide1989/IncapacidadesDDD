package co.com.sofka.oursofka.incapacidad.vo;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class HistoriaClinicaUrl implements ValueObject<String> {

    private final String historioClinica;
//TODO: CREAR EXPRECION REGULAR PARA CONFIRMAR URL

    public HistoriaClinicaUrl(String historioClinica){
        this.historioClinica = Objects.requireNonNull(historioClinica, "No se puede una ruta null") ;
    }

    @Override
    public String value() {
        return historioClinica;
    }

}
