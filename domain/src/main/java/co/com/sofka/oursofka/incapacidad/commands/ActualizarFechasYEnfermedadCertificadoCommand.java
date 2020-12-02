package co.com.sofka.oursofka.incapacidad.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.oursofka.incapacidad.vo.Enfermedad;
import co.com.sofka.oursofka.incapacidad.vo.ReporteIncapacidadId;

import java.util.Date;

public class ActualizarFechasYEnfermedadCertificadoCommand implements Command {

    private final Enfermedad enfermedad;
    private final Date fechaInicio;
    private final Date fechaFin;
    private final ReporteIncapacidadId reporteId;

    public ActualizarFechasYEnfermedadCertificadoCommand(Enfermedad enfermedad,Date fechaInicio, Date fechaFin,ReporteIncapacidadId reporteId) {
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
