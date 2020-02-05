package franco.dev.terra.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import franco.dev.terra.domain.Cliente;
import franco.dev.terra.repository.ClienteRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ClienteService {
	
	private ClienteRepository repository;
	
	public List<Cliente> findAll(){
		return (List<Cliente>) repository.findAll();
	}
	
	public Optional<Cliente> findById(Integer id) {
		return repository.findById(id);
	}
	
	public Cliente save(Cliente entity){
		return repository.save(entity);
	}
	
	public String delete(Cliente entity) {
		try {
			repository.delete(entity);
			return "Success";
		} catch (Exception e) {
			return e.getMessage().toString();
		}
	}
	
	public String deleteById(Integer id) {
		try {
			repository.deleteById(id);
			return "Success";
		} catch (Exception e) {
			return e.getMessage().toString();
		}
	}
	
	public Long count() {
		return repository.count();
	}

}
