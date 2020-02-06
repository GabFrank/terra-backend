package franco.dev.terra.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import franco.dev.terra.domain.Loteamiento;
import franco.dev.terra.service.commons.CrudService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LoteamientoService extends CrudService<Loteamiento, CrudRepository<Loteamiento,Integer>> {


}
