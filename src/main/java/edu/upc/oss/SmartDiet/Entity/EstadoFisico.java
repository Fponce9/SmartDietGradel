package edu.upc.oss.SmartDiet.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class EstadoFisico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdEFisico;
    private double Peso;
    private double Altura;
    private double IMC;
    private int Edad;
    private  String ActividadFisicaTotal;

}
