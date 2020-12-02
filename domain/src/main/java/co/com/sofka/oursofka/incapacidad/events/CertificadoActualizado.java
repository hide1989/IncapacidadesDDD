package co.com.sofka.oursofka.incapacidad.events;

import co.com.sofka.domain.generic.DomainEvent;

public class CertificadoActualizado extends DomainEvent {
    public CertificadoActualizado() {
        super("incapacidad.CertificadoActualizado");
    }

}
