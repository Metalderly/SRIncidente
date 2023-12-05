package org.example;

//import jakarta.persistence.GenerationType;

import lombok.*;

import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "tipoProblema")
public class TipoProblema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTP;
    private String nombre;


    @OnetoOne (mappedBy = "tipoProblema")
    @JoinColumn(name = "idPro1", referencedColumName = "idPro")
    private Problema problemas;


}
