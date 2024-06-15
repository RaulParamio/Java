package model;

import java.sql.Date;
import java.util.List;

public interface IRepositorioPedido extends IRepositorio<Pedidos,Long>{

	List<Pedidos> findByFecha(Date Fecha);
}
