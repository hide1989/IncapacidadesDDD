package co.com.sofka.oursofka.incapacidad.vo;

import co.com.sofka.domain.generic.ValueObject;


public class Sofkiano implements ValueObject<Sofkiano.Props>{

    private final String idSofkiano;
    private final Nombre nombre;
    private final String correo;
    private final String eps;
    private final String empresa;
    private final Rol rol;
    private final TipoDocumento tipoDocumento;

    public Sofkiano(String idSofkiano, Nombre nombre, String correo, String eps, String empresa, Rol rol, TipoDocumento tipoDocumento ){
        this.idSofkiano = idSofkiano;
        this.nombre = nombre;
        this.correo = correo;
        this.eps = eps;
        this.empresa = empresa;
        this.rol = rol;
        this.tipoDocumento = tipoDocumento;
    }

    @Override
    public Props value() {
        return new Props(){
            @Override
            public String getIdSofkiano(){return idSofkiano;}

            @Override
            public Nombre getNombre(){return nombre;}

            @Override
            public String getCorreo(){return correo;}

            @Override
            public String getEps(){return eps;}

            @Override
            public String getEmpresa(){return empresa;}

            @Override
            public Rol getRol(){return rol;}

            @Override
            public TipoDocumento getTipoDocumento(){return tipoDocumento;}
        };
    }

    public interface Props{
        String getIdSofkiano();
        Nombre getNombre();
        String getCorreo();
        String getEps();
        String getEmpresa();
        Rol getRol();
        TipoDocumento getTipoDocumento();
    }

}
