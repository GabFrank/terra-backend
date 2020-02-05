package franco.dev.terra.repository.commons;

public interface CrudRepository<T> {

	public void save(T t);

	public T findById(int id);

	public T findAll(String name);

	public T delete(int id);
}
