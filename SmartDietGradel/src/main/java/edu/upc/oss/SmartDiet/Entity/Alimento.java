package edu.upc.oss.SmartDiet.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.annotations.Type;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Alimento {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idalimento")
    private int idalimento;


    @NotNull
    @Column(name = "idusuario")
    private int idusuario;

    @NotNull
    @Column(name = "cantidad")
    private double cantidad;

    @NotNull
    @Type(type = "date")
    @Column(name = "fecha")
    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "iddatoalimento")
    private DatoAlimento datoAlimento;




}
