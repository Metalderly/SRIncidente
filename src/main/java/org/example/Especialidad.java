package org.example;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Data
@Entity
public class Especialidad {
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Id
    private Long idEsp;
    private String nombre;

    @ManyToMany(mappedBy = "especialidades")
    private List<Tecnico> tecnicos;

}
