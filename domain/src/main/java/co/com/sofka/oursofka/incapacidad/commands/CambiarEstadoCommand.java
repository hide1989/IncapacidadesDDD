package co.com.sofka.oursofka.incapacidad.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.oursofka.incapacidad.vo.InfoEstado;

import java.util.Date;

public class CambiarEstadoCommand implements Command {

    private InfoEstado infoEstado;
