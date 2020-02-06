package franco.dev.terra.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import franco.dev.terra.domain.Lote;
import franco.dev.terra.service.commons.CrudService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LoteService extends CrudService<Lote, CrudRepository<Lote,Integer>> {


}
