package negocio;

import java.util.List;

import dao.LoginDao;
import datos.Login;
import datos.Privilegio;



public class ABMLogin {
	LoginDao dao=new LoginDao();
	
	
	public Login traerLogin(long idLogin) {
		Login l = dao.traerLogin(idLogin);
		// implementar si c es null lanzar Exception
		return l;
	}
	
	public int agregar(String nickname, String clave, Privilegio privilegio) {
		// consultar si existe un cliente con el mismo dni, si existe arrojar la
		// Excepcion
		Login l = new Login( nickname, clave,privilegio);
		return dao.agregar(l);
	}

	public void modificar(Login l) {
		/*
		 * implementar antes de actualizar que no exista un cliente con el mismo
		 * documento a modificar y con el mismo id, lanzar la Exception
		 */
		dao.actualizar(l);
	}

	public void eliminar(
			long idLogin) {/*
								 * en este caso es física en gral. no se se
								 * aplicaría este caso de uso, si se hiciera
								 * habría que validar que el cliente no tenga
								 * dependencias
								 */
		Login u = dao.traerLogin(idLogin);
		// Implementar que si es null que arroje la excepción la Excepción
		dao.eliminar(u);
	}

	public List<Login> traerLogin() {
		return dao.traerLogin();
	}

	

}
