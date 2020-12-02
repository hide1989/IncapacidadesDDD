package co.com.sofka.oursofka.incapacidad.vo;

import co.com.sofka.domain.generic.ValueObject;

public class Empresa implements ValueObject<Empresa.Props> {

    private final String nit;
    private final  String nombre;

    public Empresa(String nit, String nombre ){
        this.nit = nit;
        this.nombre = nombre;
    }

    @Override
    public Props value(){
        return new Props() {
            @Override
            public String getNit() {
                return nit;
            }

            @Override
            public String getNombre() {
                return nombre;
            }
        };
    }

    public interface Props{
        String getNit();
        String getNombre();
    }
}
