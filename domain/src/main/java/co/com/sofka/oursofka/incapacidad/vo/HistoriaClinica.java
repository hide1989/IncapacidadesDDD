package co.com.sofka.oursofka.incapacidad.vo;

import co.com.sofka.domain.generic.ValueObject;

public class HistoriaClinica implements ValueObject<String> {

    private final String historioClinica;

    public HistoriaClinica(String historioClinica){
        this.historioClinica = historioClinica;
    }

    @Override
    public String value() {
        return historioClinica;
    }


}
