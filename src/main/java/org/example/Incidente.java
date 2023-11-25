package org.example;

import jakarta.persistence.GenerationType;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Incidente {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;
    private String estado;
    private Date fechaResolucion;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "tecnico_id")
    private Tecnico tecnico;

    @ManyToOne
    @JoinColumn(name = "problema_id")
    private Problema problema;

}
