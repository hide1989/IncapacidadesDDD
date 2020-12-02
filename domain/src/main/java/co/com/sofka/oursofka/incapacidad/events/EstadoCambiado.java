package co.com.sofka.oursofka.incapacidad.events;

import co.com.sofka.domain.generic.DomainEvent;

public class EstadoCambiado extends DomainEvent {

    public EstadoCambiado() {
        super("incapacidad.EstadoCambiado");
    }
}
