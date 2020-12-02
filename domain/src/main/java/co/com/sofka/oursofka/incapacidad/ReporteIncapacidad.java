package co.com.sofka.oursofka.incapacidad;


import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.oursofka.incapacidad.events.*;
import co.com.sofka.oursofka.incapacidad.vo.*;

import java.util.Date;
import java.util.List;

public class ReporteIncapacidad extends AggregateEvent<ReporteIncapacidadId> {

    protected Sofkiano sofkiano;
    protected TipoIncapacidad tipoIncapacidad;
    protected CertificadoIncapacidad certificadoIncapacidad;
    protected boolean prorroga;
    protected HistoriaClinica historiaClinica;
    protected InfoEstado infoEstado;
    protected Date fechaActual;
    protected List<CertificadoIncapacidad> listadoProrroga;


    public ReporteIncapacidad(ReporteIncapacidadId id,Sofkiano sofkiano,TipoIncapacidad tipoIncapacidad, boolean prorroga,CertificadoIncapacidad certificadoIncapacidad, HistoriaClinica historiaClinica) {
        super(id);
        appendChange(new ReporteCreado( id, sofkiano,tipoIncapacidad,prorroga,certificadoIncapacidad,historiaClinica)).apply();

    }

    private ReporteIncapacidad(ReporteIncapacidadId id) {
        super(id);
        subscribe(new ReporteEventChange(this));
    }

    public static ReporteIncapacidad from(ReporteIncapacidadId entityId, List<DomainEvent> eventList) {
        var reporte = new ReporteIncapacidad(entityId);
        eventList.forEach(reporte::applyEvent);
        return reporte;
    }

    public void cambiarEstado(){
        appendChange(new EstadoCambiado()).apply();
    }

    public void actualizarCertificado(){
        appendChange(new CertificadoActualizado()).apply();
    }

    public void enviarCorreoPorEstadoNoValido(){
        appendChange(new CorreoEnviado()).apply();
    }

    public void asociarReporte(){
        appendChange(new ReporteAsociado()).apply();
    }

    public void revisarReporteIncapacidad(){
        appendChange(new ReporteRevisado()).apply();
    }

    public void actualizarReporte(){
        appendChange(new ReporteActualizado()).apply();
    }

    public void aplicarProrroga(){
        appendChange(new ProrrogaAplicada()).apply();
    }

    public void revocarIncapacidad(ReporteIncapacidadId id){
        appendChange(new IncapacidadRevocada(id)).apply();
    }

    public void guardarProrrogaEnReporteBase(){

    }

}
