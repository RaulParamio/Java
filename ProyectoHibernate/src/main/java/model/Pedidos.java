package model;

import javax.persistence.*;

@Entity
@Table(name = "Pedidos")
public class Pedidos {

	@Id
	@Column(name = "numPedido")
	private Long numPedido;

	@Column(name = "idCliente")
	private Long idCliente;

	@Column(name = "fecha")
	private String fecha;

	public Pedidos(Long numPedido, Long idCliente, String fecha) {
		super();
		this.numPedido = numPedido;
		this.idCliente = idCliente;
		this.fecha = fecha;
	}

	public Pedidos(Long idCliente, String fecha) {
		super();
		this.idCliente = idCliente;
		this.fecha = fecha;
	}

	public Pedidos() {
		super();
	}

	public Long getNumPedido() {
		return numPedido;
	}

	public void setNumPedido(Long numPedido) {
		this.numPedido = numPedido;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Pedidos [numPedido=" + numPedido + ", idCliente=" + idCliente + ", fecha=" + fecha + "]";
	}
	
	
	
	
	
	
	
	
}