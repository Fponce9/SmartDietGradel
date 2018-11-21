package edu.upc.oss.SmartDiet.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class EstadoFisico {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEFisico")
    private int IdEFisico;

    @NotNull
    @Column(name = "Peso")
    private double Peso;

    @NotNull
    @Column(name = "Altura")
    private double Altura;

    @NotNull
    @Column(name = "IMC")
    private double IMC;

    @NotNull
    @Column(name = "Edad")
    private int Edad;

    @NotEmpty
    @Column(name = "ActividadFisicaTotal")
    private  String ActividadFisicaTotal;

    @JsonIgnore
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "usuario_idusuario")
    private Usuario usuario;
}
