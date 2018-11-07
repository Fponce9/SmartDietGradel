package edu.upc.oss.SmartDiet.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Alimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idalimento;

    private String nombre;
    private int proteina;
    private int carbohidratos;
    private int grasas;
    private int cantidad;
    private int idUsuario;


}
