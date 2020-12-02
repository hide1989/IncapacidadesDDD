package co.com.sofka.oursofka.incapacidad;

import co.com.sofka.oursofka.usecase.ReporteIncapacidadRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class MongoResporteIncapacidadRepository implements ReporteIncapacidadRepositoy {

    @Autowired
    private ReactiveMongoTemplate mongoTemplate;


    @Override
    public Mono<String> reporteIncapacidad(ReporteIncapacidad reporteIncapacidad) {
        return mongoTemplate.save(reporteIncapacidad, "reporteIncapacidad")
                .map(object -> object.identity().value());
    }
}
