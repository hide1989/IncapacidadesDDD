package co.com.sofka.oursofka.incapacidad.vo;

import co.com.sofka.domain.generic.ValueObject;

public class Nombre implements ValueObject<Nombre.Props> {

    private final String nombre;
    private final String apellidos;

    public Nombre(String nombre, String apellidos){
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    @Override
    public Props value(){
        return new Props() {
            @Override
            public String getNombre() {
                return nombre;
            }

            @Override
            public String getApellidos() {
                return apellidos;
            }

        };
    }


    public interface Props{
        String getNombre();
        String getApellidos();
    }

}
