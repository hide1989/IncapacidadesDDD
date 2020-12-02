package co.com.sofka.oursofka.incapacidad.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.oursofka.incapacidad.vo.*;

public class CrearReporteCommand implements Command {
    private Sofkiano sofkiano;
    private TipoIncapacidad tipoIncapacidad;
    private CertificadoIncapacidad certificadoIncapacidad;
    private HistoriaClinicaUrl historiaClinicaUrl;
    private Boolean esProrroga;

    public CrearReporteCommand(Sofkiano sofkiano, TipoIncapacidad tipoIncapacidad, Boolean esProrroga, CertificadoIncapacidad certificadoIncapacidad, HistoriaClinicaUrl historiaClinicaUrl) {
        this.sofkiano = sofkiano;
        this.tipoIncapacidad = tipoIncapacidad;
        this.esProrroga = esProrroga;
        this.certificadoIncapacidad = certificadoIncapacidad;
        this.historiaClinicaUrl = historiaClinicaUrl;
    }

    public CrearReporteCommand(){

    }


    public CertificadoIncapacidad getCertificadoIncapacidad() {
        return certificadoIncapacidad;
    }


    public HistoriaClinicaUrl getHistoriaClinica() {
        return historiaClinicaUrl;
    }


    public Sofkiano getSofkiano() {
        return sofkiano;
    }

    public TipoIncapacidad getTipoIncapacidad() {
        return tipoIncapacidad;
    }

    public Boolean getEsProrroga() {
        return esProrroga;
    }
}
