package co.com.sofka.oursofka.usecase;

import co.com.sofka.oursofka.incapacidad.ReporteIncapacidad;
import reactor.core.publisher.Mono;

public interface ReporteIncapacidadRepositoy {
    Mono<String> reporteIncapacidad(ReporteIncapacidad reporteIncapacidad);
}
