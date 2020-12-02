package co.com.sofka.oursofka.incapacidad.events;

import co.com.sofka.domain.generic.DomainEvent;

public class CorreoEnviado extends DomainEvent {
    public CorreoEnviado() {
        super("incapacidad.CorreoEnviado");
    }
}
