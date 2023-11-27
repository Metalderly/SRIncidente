package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import repository.*;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"repository"})
@EntityScan(basePackages = {"org.example"})
//@ComponentScan(basePackages = {"org.example", "repository", "Servicio"})
public class Main {


        /*public static Connection ConectarBD(){
            Connection conexion;
            String host = "jdbc:mysql://localhost/";
            String user = "deo";
            String pass = "osvaldo999";
            String bd = "BDIncidente";

            System.out.println("Conectando........");

            try {
                conexion = DriverManager.getConnection(host+bd,user,pass);
                System.out.println("Conexion Exitosa!!!");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                throw new RuntimeException(e);
            }

            return conexion;
        }*/

        public static void main(String[] args) {

        //Connection bd = ConectarBD();

            ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);


            ClienteRepository clienteRepository = context.getBean(ClienteRepository.class);
            IncidenteRepository incidenteRepository = context.getBean(IncidenteRepository.class);
            TecnicoRepository tecnicoRepository = context.getBean(TecnicoRepository.class);
            EspecialidadRepository especialidadRepository = context.getBean(EspecialidadRepository.class);
            ProblemaRepository problemaRepository = context.getBean(ProblemaRepository.class);
            TipoProblemaRepository tipoProblemaRepository = context.getBean(TipoProblemaRepository.class);


            System.out.println("Clientes: " + clienteRepository.findAll());
            System.out.println("Incidentes: " + incidenteRepository.findAll());
            System.out.println("Técnicos: " + tecnicoRepository.findAll());
            System.out.println("Especialidad" + especialidadRepository.findAll());
            System.out.println("Problemas: " + problemaRepository.findAll());
            System.out.println("Tipo de Problemas: " + tipoProblemaRepository.findAll());
        }

}