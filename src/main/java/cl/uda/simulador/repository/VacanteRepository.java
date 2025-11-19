package cl.uda.simulador.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cl.uda.simulador.model.Vacante;

@Repository
public interface VacanteRepository extends JpaRepository<Vacante, Integer> {

    // Para cargar solo los nombres de carreras
    List<Vacante> findAllByOrderByNombreCarreraAsc();

    // Para obtener solo nombres sin repetir
    @Query("SELECT DISTINCT v.nombreCarrera FROM Vacante v ORDER BY v.nombreCarrera")
    List<String> findDistinctNombreCarrera();

    @Query("""
                SELECT DISTINCT v.codigoCarrera, v.nombreCarrera
                FROM Vacante v
                ORDER BY v.nombreCarrera
            """)
    List<Object[]> findDistinctCodigoNombre();

}