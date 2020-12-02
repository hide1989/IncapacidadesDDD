package co.com.sofka.oursofka.incapacidad;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.oursofka.incapacidad.events.CertificadoActualizado;
import co.com.sofka.oursofka.incapacidad.events.EstadoCambiado;
import co.com.sofka.oursofka.incapacidad.events.IncapacidadRevocada;
import co.com.sofka.oursofka.incapacidad.events.ReporteCreado;

import java.util.ArrayList;
import java.util.HashMap;

public class ReporteEventChange extends EventChange {

    public ReporteEventChange(ReporteIncapacidad reporte){
        apply((ReporteCreado event) -> {
            reporte.tipoIncapacidad = event.getTipoIncapacidad();
            reporte.certificadoIncapacidad= event.getCertificadoIncapacidad();
            reporte.historiaClinica= event.getHistoriaClinica();
            reporte.prorroga= event.isProrroga();
            reporte.sofkiano= event.getSofkiano();
            reporte.listadoProrroga=new ArrayList<>();
            //reporte.fechaActual=

        });

        apply((EstadoCambiado event) -> {

        });

        apply((IncapacidadRevocada event) -> {

        });

        apply((CertificadoActualizado event) -> {

        });
    }
}
