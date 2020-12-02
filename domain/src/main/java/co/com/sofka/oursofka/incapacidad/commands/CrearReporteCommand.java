package co.com.sofka.oursofka.incapacidad.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.oursofka.incapacidad.vo.*;

import java.util.Date;

public class CrearReporteCommand implements Command {
    private String correoElectronico;
    private Nombre nombre;
    private TipoDocumento tipoDocumento;
    private Integer numeroDocumento;
    private TipoIncapacidad tipoIncapacidad;
    private Date fechaInicio;
    private Date fechaFin;
    private Boolean isProrroga;
    private String codigoEnfermedad;
    private String nombreEnfermedad;
    private CertificadoIncapacidad certificadoIncapacidad;
    private HistoriaClinica historiaClinica;

    public CrearReporteCommand(String correoElectronico, Nombre nombre, TipoDocumento tipoDocumento, Integer numeroDocumento, TipoIncapacidad tipoIncapacidad, Date fechaInicio, Date fechaFin, Boolean isProrroga, String codigoEnfermedad, String nombreEnfermedad, CertificadoIncapacidad certificadoIncapacidad, HistoriaClinica historiaClinica) {
        this.correoElectronico = correoElectronico;
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.tipoIncapacidad = tipoIncapacidad;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.isProrroga = isProrroga;
        this.codigoEnfermedad = codigoEnfermedad;
        this.nombreEnfermedad = nombreEnfermedad;
        this.certificadoIncapacidad = certificadoIncapacidad;
        this.historiaClinica = historiaClinica;
    }

    public String getcorreoElectronico() {
        return correoElectronico;
    }

    public void setcorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Integer getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(Integer numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public TipoIncapacidad getTipoIncapacidad() {
        return tipoIncapacidad;
    }

    public void setTipoIncapacidad(TipoIncapacidad tipoIncapacidad) {
        this.tipoIncapacidad = tipoIncapacidad;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Boolean getProrroga() {
        return isProrroga;
    }

    public void setProrroga(Boolean prorroga) {
        isProrroga = prorroga;
    }

    public String getCodigoEnfermedad() {
        return codigoEnfermedad;
    }

    public void setCodigoEnfermedad(String codigoEnfermedad) {
        this.codigoEnfermedad = codigoEnfermedad;
    }

    public String getnombreEnfermedad() {
        return nombreEnfermedad;
    }

    public void setnombreEnfermedad(String nombreEnfermedad) {
        this.nombreEnfermedad = nombreEnfermedad;
    }

    public CertificadoIncapacidad getCertificadoIncapacidad() {
        return certificadoIncapacidad;
    }

    public void setCertificadoIncapacidad(CertificadoIncapacidad certificadoIncapacidad) {
        this.certificadoIncapacidad = certificadoIncapacidad;
    }

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }
}
