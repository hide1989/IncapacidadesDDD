package co.com.sofka.oursofka.incapacidad.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.oursofka.incapacidad.vo.CertificadoIncapacidad;
import co.com.sofka.oursofka.incapacidad.vo.Enfermedad;
import co.com.sofka.oursofka.incapacidad.vo.ReporteIncapacidadId;

import java.util.Date;

public class FechaYEnfermedadCertificadoActualizadas extends DomainEvent {

    private final Enfermedad enfermedad;
    private final Date fechaInicio;
    private final Date fechaFin;
    private final ReporteIncapacidadId reporteId;

        public FechaYEnfermedadCertificadoActualizadas(Enfermedad enfermedad,Date fechaInicio, Date fechaFin,ReporteIncapacidadId reporteId) {
        super("incapacidad.CertificadoActualizado");
        this.enfermedad=enfermedad;
        this.fechaInicio=fechaInicio;
        this.fechaFin=fechaFin;
        this.reporteId=reporteId;
    }

    public Enfermedad getEnfermedad() {
        return enfermedad;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public ReporteIncapacidadId getReporteId() {
        return reporteId;
    }
}
