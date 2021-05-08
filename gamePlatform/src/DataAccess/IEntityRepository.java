package src.DataAccess;



import java.util.List;

public interface IEntityRepository <T>{

	List <T> gettall();
	void add(T entity);
	void delete(T entity);
	void update(T entity);
}
	
