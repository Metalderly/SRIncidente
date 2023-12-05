package org.example;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "tecnico")
public class Tecnico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTec;
    private String nombre;
    private String medioNotificacion;

    @ManyToOne
    @JoinColumn(name = "idInc1", referencedColumName = "idInc")
    private Incidente incidentes;

    @ManyToMany(mappedBy = "tecnico")
    private List<Especialidad> especialidad;
}

