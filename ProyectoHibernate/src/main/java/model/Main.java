package model;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		RepositorioHibernateClienteImpl repohcli = new RepositorioHibernateClienteImpl();		
		RepositorioHibernatePedidosImpl repohped = new RepositorioHibernatePedidosImpl();
		
		
		Cliente prueba = new Cliente("123456789", "Gonzalo", "Ramirez", "gonzalo@gmail.com", "Av La Onu", "Cartagena",
		"Murcia");

		

		repohcli.count();

		//repohcli.deleteAll();
		
		//repohcli.save(prueba);

		//repohcli.deleteById(1L);

		//System.out.println(repohcli.existsById(1L));
		
		//System.out.println(repohcli.findAll());

		//System.out.println(repohcli.getByDni("123456789"));

		//System.out.println(repohcli.getById(1L));

		//System.out.println(repohcli.getMapAll());
		
		
		
		
		
		Pedidos pedprueba = new Pedidos(1L,"21/6/2021");
			
		//repohped.count();
		
		//repohped.save(pedprueba);

		//repohped.deleteAll();

		//repohped.deleteById(8L);

		//System.out.println(repohped.existsById(1L));

		//System.out.println(repohped.findAll());

		//System.out.println(repohped.getById(1L));

	}

}
