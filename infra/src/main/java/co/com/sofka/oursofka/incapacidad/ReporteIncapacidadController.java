package co.com.sofka.oursofka.incapacidad;

import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.oursofka.incapacidad.commands.CrearReporteCommand;
import co.com.sofka.oursofka.usecase.CrearReporteIncapacidadUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/reporteincapacidad")
public class ReporteIncapacidadController {

    @Autowired
    private CrearReporteIncapacidadUseCase reporteIncapacidadUseCase;

    @PostMapping
    public Mono<String> guardarReporte(@RequestBody CrearReporteCommand command){
        return reporteIncapacidadUseCase.executeUseCase(new RequestCommand<>(command))
                .single();
    }

}
