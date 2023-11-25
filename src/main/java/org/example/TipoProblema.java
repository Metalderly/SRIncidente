package org.example;

import jakarta.persistence.GenerationType;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class TipoProblema {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @OneToMany(mappedBy = "tipoProblema")
    private List<Problema> problemas;


}
