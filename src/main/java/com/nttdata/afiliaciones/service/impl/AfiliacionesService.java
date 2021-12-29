package com.nttdata.afiliaciones.service.impl;

import com.nttdata.afiliaciones.entity.Afiliaciones;
import com.nttdata.afiliaciones.repository.AfiliacionesRepository;
import com.nttdata.afiliaciones.service.IAfiliacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AfiliacionesService implements IAfiliacionesService {

    @Autowired
    private AfiliacionesRepository afiliacionesDao;

    @Override
    public List<Afiliaciones> listAll() {
        return this.afiliacionesDao.findAll();
    }

    @Override
    public List<Afiliaciones> getAfiliacion(String dni) {
        return this.afiliacionesDao.findAll().stream().filter(a->a.getNumeroDocumento().equals(dni)).collect(Collectors.toList());
    }

//    @Override
//    public Afiliaciones getAfiliacion(String dni) {
//        List<Afiliaciones> af= new ArrayList<>();
//        List<Afiliaciones>  listAfiliaciones = this.afiliacionesDao.findAll();
//        listAfiliaciones.forEach(a -> {
//            if(a.getNumeroDocumento() == dni){
//                af.add(a);
//            }
//        });
//        return af;
//    }

    @Override
    public Afiliaciones saveAfiliaciones(Afiliaciones afiliaciones) {
        return this.afiliacionesDao.save(afiliaciones);
    }

    @Override
    public void deleteAfiliaciones(int id) {
        this.afiliacionesDao.deleteById(id);
    }
}
