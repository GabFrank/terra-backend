package franco.dev.terra.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import franco.dev.terra.domain.Lote;

@Repository
public interface LoteRepository extends CrudRepository<Lote, Integer> {

}
