package franco.dev.terra.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import franco.dev.terra.domain.Proprietario;
import franco.dev.terra.service.commons.CrudService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProprietarioService extends CrudService<Proprietario, CrudRepository<Proprietario,Integer>> {

}
