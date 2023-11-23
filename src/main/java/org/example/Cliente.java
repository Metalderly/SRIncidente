package org.example;

import jakarta.persistence.GenerationType;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String razonSocial;
    private String cuit;

    @OneToMany(mappedBy = "cliente")
    private List<Incidente> incidentes;
}
