package franco.dev.terra.service.commons;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

public class CrudService<T, Repository extends CrudRepository<T, Integer>> {
	
	@Autowired
	private Repository repository;
	
	public List<T> findAll(){
		return (List<T>) repository.findAll();
	}
	
	public Optional<T> findById(Integer id) {
		return repository.findById(id);
	}
	
	public T save(T entity){
		return repository.save(entity);
	}
	
	public String delete(T entity) {
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
