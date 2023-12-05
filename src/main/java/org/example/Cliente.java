package org.example;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idcli;
    private String razonSocial;
    private String cuit;

    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
    //@JoinColumn(name = "idCli1", referencedColumName = "id")
    private List<Incidente> incidentes;

    public String toString(){
        return "Cliente{" + "razonSocial = " + razonSocial + ", cuit = " + cuit + "}";

    }
}
