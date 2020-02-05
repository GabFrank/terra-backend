package franco.dev.terra.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import franco.dev.terra.domain.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {


}
