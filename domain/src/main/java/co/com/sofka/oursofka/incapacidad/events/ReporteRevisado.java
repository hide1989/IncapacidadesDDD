package co.com.sofka.oursofka.incapacidad.events;

import co.com.sofka.domain.generic.DomainEvent;

public class ReporteRevisado extends DomainEvent {
    public ReporteRevisado() {
        super("incapacidad.ReporteRevisado");
    }
}
