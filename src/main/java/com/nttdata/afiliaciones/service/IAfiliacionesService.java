package com.nttdata.afiliaciones.service;

import com.nttdata.afiliaciones.entity.Afiliaciones;

import java.util.List;

public interface IAfiliacionesService {
    List<Afiliaciones> listAll();
    List<Afiliaciones> getAfiliacion(String dni);
    Afiliaciones saveAfiliaciones(Afiliaciones afiliaciones);
    void deleteAfiliaciones(int id);
}
