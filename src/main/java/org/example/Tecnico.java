package org.example;

import jakarta.persistence.GenerationType;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Tecnico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String medioNotificacion;

    @ManyToMany(mappedBy = "tecnico")
    @JoinTable(name = "tecnico_especialidad",
            joinColumns = @JoinColumn(name = "tecnico_id"),
            inverseJoinColumns = @JoinColumn(name = "especialidad_id"))
    private List<Especialidad> especialidades;


}

