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
public class Pago {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpago")
    private int idpago;

    @NotNull
    @Column(name = "numTarjeta")
    private int numTarjeta;

    @NotNull
    @Column(name = "CCV")
    private int CCV;

    @NotEmpty
    @Column(name = "NombTarjeta")
    private String NombTarjeta;


    @JsonIgnore
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "usuario_idusuario")
    private Usuario usuario;
}
