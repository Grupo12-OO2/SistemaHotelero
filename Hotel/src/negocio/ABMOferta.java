package negocio;

import java.util.GregorianCalendar;
import java.util.List;

import dao.OfertaDao;

import datos.Oferta;


public class ABMOferta {
	OfertaDao dao=new OfertaDao();
	
	
	public Oferta traerOferta(long idOferta) {
		Oferta o = dao.traerOferta(idOferta);
		// implementar si c es null lanzar Exception
		return o;
	}
	

	public int agregar(String oferta, int cantidadDias, float valorOferta, GregorianCalendar fechaInicioOferta,
			GregorianCalendar fechaFinOferta) {
		// consultar si existe un cliente con el mismo dni, si existe arrojar la
		// Excepcion
		Oferta o = new Oferta( oferta, cantidadDias, valorOferta,fechaInicioOferta,fechaFinOferta);
		return dao.agregar(o);
	}

	public void modificar(Oferta o) {
		/*
		 * implementar antes de actualizar que no exista un cliente con el mismo
		 * documento a modificar y con el mismo id, lanzar la Exception
		 */
		dao.actualizar(o);
	}

	public void eliminar(
			long idOferta) {/*
								 * en este caso es física en gral. no se se
								 * aplicaría este caso de uso, si se hiciera
								 * habría que validar que el cliente no tenga
								 * dependencias
								 */
		Oferta o = dao.traerOferta(idOferta);
		// Implementar que si es null que arroje la excepción la Excepción
		dao.eliminar(o);
	}

	public List<Oferta> traerOferta() {
		return dao.traerOferta();
	}

	
	
	
	
}
