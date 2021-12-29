package com.nttdata.afiliaciones.controller;

import com.nttdata.afiliaciones.dto.ResponseDTO;
import com.nttdata.afiliaciones.entity.Afiliaciones;
import com.nttdata.afiliaciones.service.IAfiliacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/afiliaciones")
public class AfiliacionesController {
    @Autowired
    private IAfiliacionesService afiliacionesService;

    @GetMapping("")
    public ResponseEntity<List<Afiliaciones>> listAll() {
        return new ResponseEntity<>(this.afiliacionesService.listAll(), HttpStatus.OK);
    }

    @GetMapping("/{dni}")
    public ResponseEntity<?> afiliadoByDni(@PathVariable("dni")String dni){
        ResponseDTO response = new ResponseDTO();
        response.setMessage("Afiliado por DNI");
        response.setSucces(Boolean.TRUE);
        response.setData(this.afiliacionesService.getAfiliacion(dni));
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/insert")
    public ResponseEntity<?> saveAfiliado(@RequestBody Afiliaciones afiliaciones) {
        ResponseDTO response = new ResponseDTO();
        response.setMessage("Se ha insertado una nueva afiliacion");
        response.setSucces(Boolean.TRUE);
        response.setData(this.afiliacionesService.saveAfiliaciones(afiliaciones));
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO> deleteAfiliaciones(@PathVariable("id") int id){
        ResponseDTO response = new ResponseDTO();
        this.afiliacionesService.deleteAfiliaciones(id);
        response.setSucces(Boolean.TRUE);
        response.setMessage("Se ha eliminado la afiliacion:" + id);
        return ResponseEntity.ok(response);
    }


}
