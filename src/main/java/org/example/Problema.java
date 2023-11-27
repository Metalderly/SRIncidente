package org.example;

//import jakarta.persistence.GenerationType;

import lombok.Data;

import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Data
@Entity
public class Problema {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long idPro;
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "tipo_problema_id")
    private TipoProblema tipoProblema;

    @OneToMany(mappedBy = "problema")
    private List<Incidente> incidentes;


}
