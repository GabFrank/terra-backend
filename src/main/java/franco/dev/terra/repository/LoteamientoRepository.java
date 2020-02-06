package franco.dev.terra.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import franco.dev.terra.domain.Loteamiento;

@Repository
public interface LoteamientoRepository extends CrudRepository<Loteamiento, Integer> {

}
