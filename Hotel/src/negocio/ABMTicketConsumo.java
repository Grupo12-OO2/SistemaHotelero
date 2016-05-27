package negocio;

import java.util.GregorianCalendar;
import java.util.List;
import java.util.Set;

import dao.TicketConsumoDao;
import dao.UsuarioDao;
import datos.ItemTicket;
import datos.Login;
import datos.TicketConsumo;


public class ABMTicketConsumo {

	TicketConsumoDao dao=new TicketConsumoDao();
	
	
	public TicketConsumo traerTicketConsumo(long idTicketConsumo) {
		TicketConsumo tc = dao.traerTicketConsumo(idTicketConsumo);
		// implementar si c es null lanzar Exception
		return tc;
	}


	public int agregar( GregorianCalendar fecha, boolean pagado,
			Set<ItemTicket> itemsTickets, Login login) {
		// consultar si existe un cliente con el mismo dni, si existe arrojar la
		// Excepcion
		TicketConsumo tc = new TicketConsumo (fecha, pagado,itemsTickets,login);
		return dao.agregar(tc);
	}

	public void modificar(TicketConsumo tc) {
		/*
		 * implementar antes de actualizar que no exista un cliente con el mismo
		 * documento a modificar y con el mismo id, lanzar la Exception
		 */
		dao.actualizar(tc);
	}

	public void eliminar(
			long idTicketConsumo ) {/*
								 * en este caso es física en gral. no se se
								 * aplicaría este caso de uso, si se hiciera
								 * habría que validar que el cliente no tenga
								 * dependencias
								 */
		TicketConsumo  tc = dao.traerTicketConsumo(idTicketConsumo);
		// Implementar que si es null que arroje la excepción la Excepción
		dao.eliminar(tc);
	}

	public List<TicketConsumo > traerTicketConsumo () {
		return dao.traerTicketConsumo();
	}

	
	
	
}
