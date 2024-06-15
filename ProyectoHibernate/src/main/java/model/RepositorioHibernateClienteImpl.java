package model;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;

import java.util.Map;

import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

public class RepositorioHibernateClienteImpl implements RepositorioHibernateCliente {

	Session session = HibernateUtil.getSessionFactory().openSession();

	public long count() {

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		String counthql = "SELECT COUNT(*)from Cliente";
		long contador = (long) session.createSQLQuery(counthql).uniqueResult();

		session.close();

		return contador;

	}

	public void deleteById(Long id) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		Cliente clientedelid = session.load(Cliente.class, id);
		if (clientedelid != null) {
			session.delete(clientedelid);
		} else {
			System.out.println("NO SE PUEDE BORRAR, NO EXISTEN CLIENTES CON ESE ID...");
		}

		session.getTransaction().commit();

		session.close();

	}

	public void deleteAll() {

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		session.delete(Cliente.class);
		session.getTransaction().commit();

		session.close();

	}

	public boolean existsById(Long id) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		boolean idexiste = false;
		session.beginTransaction();

		if (session.get(Cliente.class, id) != null) {
			idexiste = true;
		} else {
			idexiste = false;
			System.out.println("NO HAY CLIENTES CON ESE ID");
		}
		session.close();

		return idexiste;

	}

	@SuppressWarnings("unchecked")
	public List<Cliente> findAll() {

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		List<Cliente> lista = session.createQuery("FROM Cliente").list();

		session.close();

		return lista;

	}

	@Override

	public Cliente getById(Long id) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		Cliente clienteretid = session.byId(Cliente.class).load(id);

		session.close();

		return clienteretid;

	}

	@Override

	public <S extends Cliente> S save(S entity) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		session.save(entity);

		session.getTransaction().commit();

		session.close();

		return entity;

	}

	@SuppressWarnings("unchecked")
	@Override

	public Map<String, Cliente> getMapAll() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		List<Cliente> listacli = new ArrayList<Cliente>();
		Map<String, Cliente> mapacli = new HashMap<String, Cliente>();
		listacli = session.createQuery("SELECT l FROM Clientes l").list();
		for (Cliente clientegma : listacli) {
			mapacli.put(clientegma.getDni(), clientegma);
		}
		session.close();

		return mapacli;

	}

	@Override

	public Cliente getByDni(String dni) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		Cliente clientee = new Cliente();

		clientee = (Cliente) session.createQuery("SELECT FROM Cliente WHERE dni=:").setParameter(1, dni);

		session.close();

		return clientee;
	}

}