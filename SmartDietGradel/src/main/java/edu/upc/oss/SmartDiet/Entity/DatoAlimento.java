package edu.upc.oss.SmartDiet.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DatoAlimento {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddatoalimento")
    private int iddatoalimento;

    @NotEmpty
    @Column(name = "nombre")
    private String nombre;

    @NotNull
    @Column(name = "proteina")
    private int proteina;

    @NotNull
    @Column(name = "carbohidratos")
    private int carbohidratos;

    @NotNull
    @Column(name = "grasas")
    private int grasas;


}
