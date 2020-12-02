package co.com.sofka.oursofka.incapacidad.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.oursofka.incapacidad.vo.InfoEstado;

public class EstadoCambiado extends DomainEvent {

    private final InfoEstado infoEstado;

    public EstadoCambiado(InfoEstado infoEstado) {
        super("incapacidad.EstadoCambiado");
        this.infoEstado = infoEstado;
    }

    public InfoEstado getInfoEstado() {
        return infoEstado;
    }
}
