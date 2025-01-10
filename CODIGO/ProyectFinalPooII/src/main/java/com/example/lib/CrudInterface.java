package com.example.lib;

import java.util.List;

public interface CrudInterface {

	public abstract List<Object> listAll();
	public abstract Object guardar(Object obj);
	public abstract void delete(int id);
	
}
