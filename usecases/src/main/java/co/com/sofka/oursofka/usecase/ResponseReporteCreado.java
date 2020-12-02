package co.com.sofka.oursofka.usecase;

import co.com.sofka.business.generic.UseCase;
import reactor.core.publisher.Mono;

public class ResponseReporteCreado implements UseCase.ResponseValues {

    private final Mono<String> id;

    public ResponseReporteCreado(Mono<String> id){
        this.id = id;
    }

    public Mono<String> getId() {
        return id;
    }

}
