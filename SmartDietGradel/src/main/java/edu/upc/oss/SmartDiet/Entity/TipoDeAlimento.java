package edu.upc.oss.SmartDiet.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@Entity
public class TipoDeAlimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdTipoDA;

    private String nombre;
}