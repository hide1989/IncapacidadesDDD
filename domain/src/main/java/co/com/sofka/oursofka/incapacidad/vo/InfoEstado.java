package co.com.sofka.oursofka.incapacidad.vo;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;
import java.util.Objects;

enum Estado {PENDIENTE, APROBADOO, NO_VALIDO}
enum MotivoInvalidez { DOCUMENTO_ILEGIBLE, DOCUMENTO_INCORRECTO, FALTA_HISTORIA_CLINICA, NO_APLICA }

public class InfoEstado implements ValueObject<InfoEstado.Props> {

    private final Date fecha;
    private Estado estado;
    private MotivoInvalidez motivoInvalidez;

    public InfoEstado(Date fecha, Estado estado, MotivoInvalidez motivoInvalidez){
        this.fecha = Objects.requireNonNull(fecha, "No se permite fecha null");
        this.estado = Objects.requireNonNull(estado, "No se permite estado null");
        this.motivoInvalidez = Objects.requireNonNull(motivoInvalidez, "No se permite motivo null");
    }

    public Props value(){
        return new Props() {
            @Override
            public Date getFecha() {
                return fecha;
            }

            @Override
            public Estado getEstado() {
                return estado;
            }

            @Override
            public MotivoInvalidez getMotivoInvalidez() {
                return motivoInvalidez;
            }
        };
    }

    public interface Props{
        Date getFecha();
        Estado getEstado();
        MotivoInvalidez getMotivoInvalidez();
    }

}
