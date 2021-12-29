package com.nttdata.afiliaciones.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "tb_afiliaciones")
@Data
public class Afiliaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "numero_documento", unique = true, nullable = false, length = 8)
    private String numeroDocumento;

    @Column(name ="nombres", nullable = false, length = 50)
    private String nombres;

    @Column(name="ape_paterno", nullable = false, length = 80)
    private String apePaterno;

    @Column(name = "ape_materno", nullable = false, length = 80)
    private String apeMaterno;

    @Column(name="direccion", nullable = false, length = 500)
    private String direccion;
    // deberia traer un id de autorizado
    @Column(name="ubigeo", nullable = false, length = 6)
    private String ubigeo;
}
