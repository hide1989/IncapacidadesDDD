package co.com.sofka.oursofka.incapacidad;

import co.com.sofka.oursofka.usecase.CrearReporteIncapacidadUseCase;
import co.com.sofka.oursofka.usecase.ReporteIncapacidadRepositoy;
import com.google.gson.Gson;
import com.mongodb.reactivestreams.client.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

@Configuration
public class AppConfig {

    private MongoClient mongoClient;

    @Bean
    public CrearReporteIncapacidadUseCase crearReporteIncapacidad(ReporteIncapacidadRepositoy repositoy){
        return new CrearReporteIncapacidadUseCase(repositoy);
    }

    @Bean
    public Gson gson() {
        return new Gson();
    }
}
