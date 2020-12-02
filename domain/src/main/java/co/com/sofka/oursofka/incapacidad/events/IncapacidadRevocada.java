package co.com.sofka.oursofka.incapacidad.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.oursofka.incapacidad.vo.ReporteIncapacidadId;

public class IncapacidadRevocada extends DomainEvent {

    private final ReporteIncapacidadId reporteIncapacidadId;

    public IncapacidadRevocada(ReporteIncapacidadId reporteIncapacidadId){
        super("incapacidad.IncapacidadRevocada");
        this.reporteIncapacidadId = reporteIncapacidadId;
    }

    public ReporteIncapacidadId getReporteIncapacidadId(){
        return reporteIncapacidadId;
    }

}
