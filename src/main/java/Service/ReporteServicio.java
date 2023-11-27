package Service;

import org.example.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.*;

import java.util.List;

@Service
public class ReporteServicio {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private IncidenteRepository incidenteRepository;

    @Autowired
    private TecnicoRepository tecnicoRepository;

    @Autowired
    private EspecialidadRepository especialidadRepository;

    @Autowired
    private ProblemaRepository problemaRepository;

    @Autowired
    private TipoProblemaRepository tipoProblemaRepository;


    @Autowired
    public ReporteServicio(ClienteRepository clienteRepository,
                           IncidenteRepository incidenteRepository,
                           TecnicoRepository tecnicoRepository,
                           EspecialidadRepository especialidadRepository,
                           ProblemaRepository problemaRepository,
                           TipoProblemaRepository tipoProblemaRepository) {
        this.clienteRepository = clienteRepository;
        this.incidenteRepository = incidenteRepository;
        this.tecnicoRepository = tecnicoRepository;
        this.especialidadRepository = especialidadRepository;
        this.problemaRepository = problemaRepository;
        this.tipoProblemaRepository = tipoProblemaRepository;
    }


    public List<Cliente> obtenerTodosLosClientes() {
        return clienteRepository.findAll();
    }


    public List<Incidente> obtenerTodosLosIncidentes() {
        return incidenteRepository.findAll();
    }


    public List<Tecnico> obtenerTodosLosTecnicos() {
        return tecnicoRepository.findAll();
    }

    public List<Especialidad> obtenerTodasLasEspecialidades(){
        return especialidadRepository.findAll();
    }

    public List<Problema> obtenerTodosLosProblema(){
        return problemaRepository.findAll();
    }

    public  List<TipoProblema> obtenerLosTiposDeProblemas(){
        return  tipoProblemaRepository.findAll();
    }

}

