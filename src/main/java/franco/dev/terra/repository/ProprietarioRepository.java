package franco.dev.terra.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import franco.dev.terra.domain.Proprietario;

@Repository
public interface ProprietarioRepository extends CrudRepository<Proprietario, Integer> {

}
