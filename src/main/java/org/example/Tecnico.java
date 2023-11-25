package org.example;

import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Tecnico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTec;
    private String nombre;
    //private String medioNotificacion;

    /*@ManyToMany(mappedBy = "Especialidad")
    @JoinTable(name = "tecnico_especialidad",
            joinColumns = @JoinColumn(name = "idTec"),
            inverseJoinColumns = @JoinColumn(name = "idEsp"))
    private List<Especialidad> especialidades;*/

}

