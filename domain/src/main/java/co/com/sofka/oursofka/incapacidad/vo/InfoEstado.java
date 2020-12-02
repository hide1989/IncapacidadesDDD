package co.com.sofka.oursofka.incapacidad.vo;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;

enum Estado {PENDIENTE, APROBADOO, NO_VALIDO}
enum MotivoInvalidez { DOCUMENTO_ILEGIBLE, DOCUMENTO_INCORRECTO, FALTA_HISTORIA_CLINICA, NO_APLICA }

public class InfoEstado implements ValueObject<InfoEstado.Props> {

    private final Date fecha;
    private Estado estado;
    private MotivoInvalidez motivoInvalidez;

    public InfoEstado(Date fecha, Estado estado, MotivoInvalidez motivoInvalidez){
        this.fecha = fecha;
        this.estado = estado;
        this.motivoInvalidez = motivoInvalidez;
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
