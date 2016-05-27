package dao;

import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Oferta;
import datos.TicketConsumo;

public class TicketConsumoDao {
	
	private static Session session;
	private Transaction tx;

	private void iniciaOperacion() throws HibernateException {
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}

	private void manejaExcepcion(HibernateException he) throws HibernateException {
		tx.rollback();
		throw new HibernateException("ERROR en la capa de acceso a datos", he);
	}

	public TicketConsumo traerTicketConsumo(long idTicketConsumo)throws HibernateException  {
		TicketConsumo objeto = null;
		try {
			iniciaOperacion();
			objeto = (TicketConsumo) session.get(TicketConsumo.class, idTicketConsumo);
		} finally {
			session.close();
		}
		return objeto;
	}

	public int agregar(TicketConsumo objeto)throws HibernateException  {
		int id = 0;
		try {
			iniciaOperacion();
			id = Integer.parseInt(session.save(objeto).toString());
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session.close();
		}
		return id;
	}

	public void actualizar(TicketConsumo objeto) throws HibernateException {
		try {
			iniciaOperacion();
			session.update(objeto);
			tx.commit();
			} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
			} finally {

			session.close();
			}
	}

	public void eliminar(TicketConsumo objeto) throws HibernateException {
		try {
			iniciaOperacion();
			session.delete(objeto);
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session.close();
		}
	}
	@SuppressWarnings("unchecked")
	public List<TicketConsumo> traerTicketConsumo() throws HibernateException {
		List<TicketConsumo> lista=null;
		try {
		iniciaOperacion();
		lista=session.createQuery("from TicketConsumo tc order by tc.idTicketConsumo asc ").list();
		} finally {
		session.close();
		}
		return lista;
	}

}
