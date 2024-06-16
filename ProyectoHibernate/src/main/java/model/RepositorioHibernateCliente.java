package model;

import java.util.Map;

public interface RepositorioHibernateCliente extends IRepositorio<Cliente,Long>{

	Map<String,Cliente> getMapAll();
	
	Cliente getByDni(String dni);

}