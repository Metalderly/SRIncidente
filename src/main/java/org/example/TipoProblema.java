package org.example;

//import jakarta.persistence.GenerationType;

import lombok.Data;

import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Data
@Entity
public class TipoProblema {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long idTP;
    private String nombre;

    @OneToMany(mappedBy = "tipoProblema")
    private List<Problema> problemas;


}
