package co.com.sofka.oursofka.incapacidad.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.oursofka.incapacidad.vo.*;

public class ReporteCreado extends DomainEvent {

    private  ReporteIncapacidadId reporteId;
    private  Sofkiano sofkiano;
    private TipoIncapacidad tipoIncapacidad;
    private  boolean prorroga;
    private  HistoriaClinica historiaClinica;
    private  CertificadoIncapacidad certificadoIncapacidad;



    public ReporteCreado(String type) {
        super(type);
    }

    public ReporteCreado(ReporteIncapacidadId id, Sofkiano sofkiano, TipoIncapacidad tipoIncapacidad, boolean prorroga, CertificadoIncapacidad certificadoIncapacidad,HistoriaClinica historiaClinica) {
        super("incapacidad.ReporteCreado");
        this.reporteId=id;
        this.certificadoIncapacidad=certificadoIncapacidad;
        this.historiaClinica=historiaClinica;
        this.prorroga=prorroga;
        this.sofkiano=sofkiano;
        this.tipoIncapacidad=tipoIncapacidad;
    }


    public ReporteIncapacidadId getReporteId() {
        return reporteId;
    }

    public Sofkiano getSofkiano() {
        return sofkiano;
    }

    public TipoIncapacidad getTipoIncapacidad() {
        return tipoIncapacidad;
    }

    public boolean isProrroga() {
        return prorroga;
    }

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public CertificadoIncapacidad getCertificadoIncapacidad() {
        return certificadoIncapacidad;
    }
}
