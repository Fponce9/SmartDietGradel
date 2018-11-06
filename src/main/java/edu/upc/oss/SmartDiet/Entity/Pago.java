package edu.upc.oss.SmartDiet.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Pago {
    @Id
    private int idUsuario;

    private int numTarjeta;
    private int CCV;
    private String NombTarjeta;
}
