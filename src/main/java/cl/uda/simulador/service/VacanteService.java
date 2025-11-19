package cl.uda.simulador.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.uda.simulador.model.Vacante;
import cl.uda.simulador.repository.VacanteRepository;

@Service
public class VacanteService {

    @Autowired
    private VacanteRepository repo;

    public List<String> obtenerCarreras() {
        return repo.findDistinctNombreCarrera();
    }

    public List<Vacante> listarTodo() {
        return repo.findAll();
    }

   public List<Object[]> obtenerCarrerasDistinct(){
        return repo.findDistinctCodigoNombre();
   };
}
