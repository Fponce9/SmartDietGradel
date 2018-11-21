package edu.upc.oss.SmartDiet.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Ejercicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idpdejercicio;

    private String nombre;
    private String descripcion;
    private int rutinas;
    private int puntaje;
}