package co.com.sofka.oursofka.incapacidad.vo;


import co.com.sofka.domain.generic.ValueObject;

public class TipoIncapacidad implements ValueObject<String> {

    public enum incapacidad {GENERAL,ACCIDENTE_TRABAJO}

    public TipoIncapacidad(){

    }

    @Override
    public String value() {
        return null;
    }

}


