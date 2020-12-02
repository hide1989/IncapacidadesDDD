package co.com.sofka.oursofka.incapacidad;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.oursofka.incapacidad.events.FechaYEnfermedadCertificadoActualizadas;
import co.com.sofka.oursofka.incapacidad.events.EstadoCambiado;
import co.com.sofka.oursofka.incapacidad.events.IncapacidadRevocada;
import co.com.sofka.oursofka.incapacidad.events.ReporteCreado;
import co.com.sofka.oursofka.incapacidad.vo.CertificadoIncapacidad;

import java.util.ArrayList;
import java.util.Date;

public class ReporteEventChange extends EventChange {

    public ReporteEventChange(ReporteIncapacidad reporte){
        apply((ReporteCreado event) -> {
            reporte.tipoIncapacidad = event.getTipoIncapacidad();
            reporte.certificadoIncapacidad = event.getCertificadoIncapacidad();
            reporte.historiaClinicaUrl = event.getHistoriaClinica();
            reporte.esProrroga = event.isProrroga();
            reporte.sofkiano = event.getSofkiano();
            reporte.listadoProrroga = new ArrayList<>();
            reporte.fechaActual = new Date();
            reporte.esRevokado = false;
        });

        apply((FechaYEnfermedadCertificadoActualizadas event) -> {
            var rutaCertificado = reporte.certificadoIncapacidad.value().getRutaCertificado();
            reporte.certificadoIncapacidad=new CertificadoIncapacidad(
                    rutaCertificado,event.getEnfermedad(),
                    event.getFechaInicio(),event.getFechaFin()
            );

        });

        apply((EstadoCambiado event) -> {
            reporte.infoEstado = event.getInfoEstado();
        });

        apply((IncapacidadRevocada event) -> {
            reporte.esRevokado=true;
        });

        apply((FechaYEnfermedadCertificadoActualizadas event) -> {
            var rutaCertificado=reporte.certificadoIncapacidad.value().getRutaCertificado();
            reporte.certificadoIncapacidad=new CertificadoIncapacidad(rutaCertificado,event.getEnfermedad(),event.getFechaInicio(),event.getFechaFin());
        });
    }
}
