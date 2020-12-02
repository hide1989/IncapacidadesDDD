package co.com.sofka.oursofka.usecase;


import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.oursofka.incapacidad.ReporteIncapacidad;
import co.com.sofka.oursofka.incapacidad.commands.CrearReporteCommand;
import co.com.sofka.oursofka.incapacidad.vo.ReporteIncapacidadId;
import reactor.core.publisher.Flux;

public class CrearReporteIncapacidadUseCase implements UseCase<CrearReporteCommand, String> {


    private final ReporteIncapacidadRepositoy repositoy;

    public CrearReporteIncapacidadUseCase(ReporteIncapacidadRepositoy repositoy){

        this.repositoy = repositoy;
    }

    @Override
    public Flux<String> executeUseCase(RequestCommand<CrearReporteCommand> crearReporteCommandRequestCommand) {
        var command = crearReporteCommandRequestCommand.getCommand();
        var id = repositoy.reporteIncapacidad(new ReporteIncapacidad(
                new ReporteIncapacidadId(),
                command.getSofkiano(),
                command.getTipoIncapacidad(),
                command.getEsProrroga(),
                command.getCertificadoIncapacidad(),
                command.getHistoriaClinica()
        ));
        return id.flux();

        //requestUseCase()
    }
}
