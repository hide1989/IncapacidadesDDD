package co.com.sofka.oursofka.incapacidad.vo;

import co.com.sofka.domain.generic.Identity;

public class ReporteIncapacidadId extends Identity {
    private ReporteIncapacidadId(String uuid) {
        super(uuid);
    }

    public ReporteIncapacidadId() {}
    public static ReporteIncapacidadId of(String uuid) {
        return new ReporteIncapacidadId(uuid);
    }
}
