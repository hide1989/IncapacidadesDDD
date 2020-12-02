package co.com.sofka.oursofka.incapacidad.events;

import co.com.sofka.domain.generic.DomainEvent;

public class ProrrogaAplicada extends DomainEvent {
    public ProrrogaAplicada() {
        super("incapacidad.ProrrogaAplicada");
    }
}
