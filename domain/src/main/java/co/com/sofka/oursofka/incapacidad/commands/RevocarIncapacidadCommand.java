package co.com.sofka.oursofka.incapacidad.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.oursofka.incapacidad.vo.ReporteIncapacidadId;


public class RevocarIncapacidadCommand implements Command {

    private ReporteIncapacidadId reporteIncapacidadId;

    public RevocarIncapacidadCommand(ReporteIncapacidadId reporteIncapacidadId){
        this.reporteIncapacidadId = reporteIncapacidadId;
    }
    public RevocarIncapacidadCommand(){}

    public ReporteIncapacidadId getReporteIncapacidadId(){
        return reporteIncapacidadId;
    }
}
