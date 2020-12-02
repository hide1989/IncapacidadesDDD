package co.com.sofka.oursofka.incapacidad;


import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.AggregateRoot;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.oursofka.incapacidad.events.*;
import co.com.sofka.oursofka.incapacidad.vo.*;

import java.util.Date;
import java.util.List;

public class ReporteIncapacidad extends AggregateRoot<ReporteIncapacidadId> {

    protected Sofkiano sofkiano;
    protected TipoIncapacidad tipoIncapacidad;
    protected CertificadoIncapacidad certificadoIncapacidad;
    protected boolean esProrroga;
    protected HistoriaClinicaUrl historiaClinicaUrl;
    protected InfoEstado infoEstado;
    protected Date fechaActual;
    protected List<CertificadoIncapacidad> listadoProrroga;
    protected Boolean esRevokado;


    public ReporteIncapacidad(ReporteIncapacidadId id,Sofkiano sofkiano,TipoIncapacidad tipoIncapacidad, boolean esProrroga,CertificadoIncapacidad certificadoIncapacidad, HistoriaClinicaUrl historiaClinicaUrl) {
        super(id);
        this.sofkiano = sofkiano;
        this.tipoIncapacidad = tipoIncapacidad;
        this.esProrroga = esProrroga;
        this.certificadoIncapacidad = certificadoIncapacidad;
        this.historiaClinicaUrl = historiaClinicaUrl;
    }

    private ReporteIncapacidad(ReporteIncapacidadId id) {
        super(id);
    }


    public void cambiarEstado(InfoEstado infoEstado){

    }

    public void actualizarFechasYEnfermedadCertificado(Enfermedad enfermedad,Date fechaInicio, Date fechaFin,ReporteIncapacidadId reporteId){
;
    }

    public void enviarCorreoPorEstadoNoValido(){

    }

    public void asociarReporte(){

    }

    public void revisarReporteIncapacidad(){

    }

    public void actualizarReporte(){

    }

    public void aplicarProrroga(){

    }

    public void revocarIncapacidad(ReporteIncapacidadId id){

    }

}
