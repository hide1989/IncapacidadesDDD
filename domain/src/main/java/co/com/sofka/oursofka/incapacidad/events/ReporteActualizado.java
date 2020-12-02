package co.com.sofka.oursofka.incapacidad.events;

import co.com.sofka.domain.generic.DomainEvent;

public class ReporteActualizado extends DomainEvent {
    public ReporteActualizado() {
        super("Incapacidad.ReporteActualizado");
    }
}
