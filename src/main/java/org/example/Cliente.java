package org.example;

import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcli;
    private String razonSocial;
    private String cuit;

    @OneToMany(mappedBy = "cliente")
    private List<Incidente> incidente;
}
