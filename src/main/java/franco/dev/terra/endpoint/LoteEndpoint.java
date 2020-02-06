package franco.dev.terra.endpoint;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import franco.dev.terra.domain.Lote;
import franco.dev.terra.service.LoteService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/lotes")
@AllArgsConstructor
public class LoteEndpoint {
	
	private LoteService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Lote> findAll(){
		return service.findAll();
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public Optional<Lote> findById(@PathVariable("id") Integer id){
		return service.findById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Lote save(@RequestBody Lote entity){
		return service.save(entity);
	}
	
	@RequestMapping(value="/delete",method = RequestMethod.POST)
	public String delete(@RequestBody Lote entity){
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
