package org.example;

//import jakarta.persistence.GenerationType;

import lombok.*;

import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "problema")
public class Problema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPro;
    private String descripcion;

    @ManyToMany(mappedBy = "problemas")
    private List<Incidente> incidentes;

    @OnetoOne(mappedBy = "problema")
    private TipoProblema tipoProblema;
}
