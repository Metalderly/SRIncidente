package org.example;

//import jakarta.persistence.GenerationType;

import lombok.Data;

import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Incidente {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long idInc;
    private String descripcion;
    private String estado;
    private Date fechaResolucion;

    @ManyToOne
    @JoinColumn(name = "cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "tecnico")
    private Tecnico tecnico;

    @ManyToOne
    @JoinColumn(name = "problema")
    private Problema problema;

}
