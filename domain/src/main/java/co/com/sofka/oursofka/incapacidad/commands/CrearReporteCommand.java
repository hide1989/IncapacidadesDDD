package co.com.sofka.oursofka.incapacidad.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.oursofka.incapacidad.vo.*;

import java.util.Date;

public class CrearReporteCommand implements Command {
    private Sofkiano sofkiano;
    private TipoIncapacidad tipoIncapacidad;
    private CertificadoIncapacidad certificadoIncapacidad;
    private HistoriaClinica historiaClinica;
    private Boolean esProrroga;

    public CrearReporteCommand(Sofkiano sofkiano, TipoIncapacidad tipoIncapacidad, Boolean esProrroga, CertificadoIncapacidad certificadoIncapacidad, HistoriaClinica historiaClinica) {
        this.sofkiano = sofkiano;
        this.tipoIncapacidad = tipoIncapacidad;
        this.esProrroga = esProrroga;
        this.certificadoIncapacidad = certificadoIncapacidad;
        this.historiaClinica = historiaClinica;
    }




    public CertificadoIncapacidad getCertificadoIncapacidad() {
        return certificadoIncapacidad;
    }


    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
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
