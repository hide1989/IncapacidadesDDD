package co.com.sofka.oursofka.incapacidad.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.oursofka.incapacidad.vo.CertificadoIncapacidad;
import co.com.sofka.oursofka.incapacidad.vo.ReporteIncapacidadId;

public class CertificadoActualizado extends DomainEvent {

    private final CertificadoIncapacidad certificadoIncapacidad;
    private final ReporteIncapacidadId reporteId;

    public CertificadoActualizado(CertificadoIncapacidad certificadoIncapacidad) {
        super("incapacidad.CertificadoActualizado");
        this.certificadoIncapacidad=certificadoIncapacidad;
    }

}
