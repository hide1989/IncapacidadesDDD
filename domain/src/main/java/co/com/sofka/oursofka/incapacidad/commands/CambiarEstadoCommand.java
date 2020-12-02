package co.com.sofka.oursofka.incapacidad.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.oursofka.incapacidad.vo.InfoEstado;

public class CambiarEstadoCommand implements Command {

    private InfoEstado infoEstado;

    public CambiarEstadoCommand(InfoEstado infoEstado){
        this.infoEstado = infoEstado;
    }

    public InfoEstado getInfoEstado(){
        return infoEstado;
    }
}
