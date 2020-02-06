package franco.dev.terra.endpoint;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import franco.dev.terra.domain.Proprietario;
import franco.dev.terra.service.ProprietarioService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/proprietarios")
@AllArgsConstructor
public class ProprietarioEndpoint {
	
	private ProprietarioService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Proprietario> findAll(){
		return service.findAll();
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public Optional<Proprietario> findById(@PathVariable("id") Integer id){
		return service.findById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Proprietario save(@RequestBody Proprietario entity){
		return service.save(entity);
	}
	
	@RequestMapping(value="/delete",method = RequestMethod.POST)
	public String delete(@RequestBody Proprietario entity){
		return service.delete(entity);
	}
	
	@RequestMapping(value="/deleteById", method = RequestMethod.POST)
	public String deleteById(@RequestBody Integer id){
		return service.deleteById(id);
	}
	
	@RequestMapping(value="/count", method = RequestMethod.GET)
	public Long count(){
		return service.count();
	}
	
}
