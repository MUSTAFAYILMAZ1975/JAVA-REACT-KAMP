package src.Manager;

import java.util.List;

public interface IServiceRepository <T>{
	
	List <T> gettAll();
	List<T> getbById(int id);
	void add(T entity);
	void delete(T entity);
	void update(T entity);

}
