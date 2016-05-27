package negocio;

import java.util.GregorianCalendar;
import java.util.List;

import dao.TicketMantenimientoDao;
import datos.Login;
import datos.TicketMantenimiento;


public class ABMTicketMantenimiento {
	
	TicketMantenimientoDao dao=new TicketMantenimientoDao();
	
	
	public TicketMantenimiento traerTicketMantenimiento(long idTicketMantenimiento) {
		TicketMantenimiento tm = dao.traerTicketMantenimiento(idTicketMantenimiento);
		// implementar si tm es null lanzar Exception
		return tm;
	}
	

	public int agregar(String ticketMantenimiento, GregorianCalendar fecha, boolean realizado,
			Login login) {
		// consultar si existe un cliente con el mismo dni, si existe arrojar la
		// Excepcion
		TicketMantenimiento tm = new TicketMantenimiento( ticketMantenimiento,fecha,realizado, login);
		return dao.agregar(tm);
	}

	public void modificar(TicketMantenimiento tm) {
		/*
		 * implementar antes de actualizar que no exista un cliente con el mismo
		 * documento a modificar y con el mismo id, lanzar la Exception
		 */
		dao.actualizar(tm);
	}

	public void eliminar(
			long idTicketMantenimiento) {/*
								 * en este caso es física en gral. no se se
								 * aplicaría este caso de uso, si se hiciera
								 * habría que validar que el cliente no tenga
								 * dependencias
								 */
		TicketMantenimiento tm = dao.traerTicketMantenimiento(idTicketMantenimiento);
		// Implementar que si es null que arroje la excepción la Excepción
		dao.eliminar(tm);
	}

	public List<TicketMantenimiento> traerTicketMantenimiento() {
		return dao.traerTicketMantenimiento();
	}
	

}
