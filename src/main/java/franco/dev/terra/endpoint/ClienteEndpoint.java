package franco.dev.terra.endpoint;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import franco.dev.terra.domain.Cliente;
import franco.dev.terra.service.ClienteService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/clientes")
@AllArgsConstructor
public class ClienteEndpoint {
	
	private ClienteService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Cliente> findAll(){
		return service.findAll();
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public Optional<Cliente> findById(@PathVariable("id") Integer id){
		return service.findById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Cliente save(@RequestBody Cliente entity){
		return service.save(entity);
	}
	
	@RequestMapping(value="/delete",method = RequestMethod.POST)
	public String delete(@RequestBody Cliente entity){
		return service.delete(entity);
	}
	
	@RequestMapping(value="/deleteById/{id}", method = RequestMethod.POST)
	public String deleteById(@PathVariable("id") Integer id){
		return service.deleteById(id);
	}
	
	@RequestMapping(value="/count", method = RequestMethod.GET)
	public Long count(){
		return service.count();
	}
	
}
