package org.example;

//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;

import lombok.Data;

import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Tecnico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTec;
    private String nombre;
    private String medioNotificacion;



}

