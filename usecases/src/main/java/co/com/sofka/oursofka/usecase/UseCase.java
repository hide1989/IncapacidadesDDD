package co.com.sofka.oursofka.usecase;

import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.Command;
import reactor.core.publisher.Flux;

public interface UseCase<R extends Command, T> {
    Flux<T> executeUseCase(RequestCommand<R> command);
}
