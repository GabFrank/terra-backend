package franco.dev.terra.endpoint;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import franco.dev.terra.domain.Loteamiento;
import franco.dev.terra.service.LoteamientoService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/loteamientos")
@AllArgsConstructor
public class LoteamientoEndpoint {
	
	private LoteamientoService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Loteamiento> findAll(){
		return service.findAll();
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public Optional<Loteamiento> findById(@PathVariable("id") Integer id){
		return service.findById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Loteamiento save(@RequestBody Loteamiento entity){
		return service.save(entity);
	}
	
	@RequestMapping(value="/delete",method = RequestMethod.POST)
	public String delete(@RequestBody Loteamiento entity){
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
