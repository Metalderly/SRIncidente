package org.example;

import lombok.*;

import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "incidente")
public class Incidente {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int idInc;
    private String descripcion;
    private String estado;
    private String fechaResolucion;

    @ManyToOne
    @JoinColumn(name = "idCli1", referencedColumName = "idCli")
    private Cliente cliente;

    @OnetoOne (mappedBy = "incidente")
    private Tecnico tecnicos;

    @ManyToMany
    private List<Problema> problemas;



}
