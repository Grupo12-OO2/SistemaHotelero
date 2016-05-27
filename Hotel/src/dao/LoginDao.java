package dao;

import java.util.List;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Login;

public class LoginDao {
	
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
	

	public void eliminar(Login objeto) throws HibernateException {
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
	public List<Login> traerLogin() {
		List<Login> lista=null;
		try {
		iniciaOperacion();
		lista=session.createQuery("from Login l order by c.nickname asc ").list();
		} finally {
		session.close();
		}
		return lista;
	}

	public Login traerLogin(long idLogin) throws HibernateException {
		Login objeto = null;
		try {
			iniciaOperacion();
			objeto = (Login) session.get(Login.class, idLogin);
		} finally {
			session.close();
		}
		return objeto;
	}

	public void actualizar(Login objeto)throws HibernateException  {
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

	public int agregar(Login objeto) throws HibernateException {
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


}
