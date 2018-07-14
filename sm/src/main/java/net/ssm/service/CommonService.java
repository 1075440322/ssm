package net.ssm.service;


import java.util.List;
import net.ssm.util.Pager;



public interface CommonService<T> {
	void save(T object);
	void delete(T object);
	void delete(Integer id);
	void delete(String ids);
	void update(T object);
	T findById(Integer id);
	List<T> findAll();
	List<T> findAll(T object);
	List<T> findAll(Pager pager);
	List<T> findAll(Pager pager,T object);
	int getDataCount();
	int getDataCount(T object);        //object用来携带查询的条件，所有非空属性都作为查询条件
	
}









