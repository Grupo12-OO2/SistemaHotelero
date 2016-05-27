package datos;
import java.util.*;
public class Oferta {
	
	private long idOferta;
	private String oferta;
	private int cantidadDias;
	private float valorOferta;
	private GregorianCalendar fechaInicioOferta;
	private GregorianCalendar fechaFinOferta;
	
	
	
	public Oferta(){}



	public Oferta(String oferta, int cantidadDias, float valorOferta, GregorianCalendar fechaInicioOferta,
			GregorianCalendar fechaFinOferta) {
		super();
		this.oferta = oferta;
		this.cantidadDias = cantidadDias;
		this.valorOferta = valorOferta;
		this.fechaInicioOferta = fechaInicioOferta;
		this.fechaFinOferta = fechaFinOferta;
	}



	public long getIdOferta() {
		return idOferta;
	}



	protected void setIdOferta(long idOferta) {
		this.idOferta = idOferta;
	}



	public String getOferta() {
		return oferta;
	}



	public void setOferta(String oferta) {
		this.oferta = oferta;
	}



	public int getCantidadDias() {
		return cantidadDias;
	}



	public void setCantidadDias(int cantidadDias) {
		this.cantidadDias = cantidadDias;
	}



	public float getValorOferta() {
		return valorOferta;
	}



	public void setValorOferta(float valorOferta) {
		this.valorOferta = valorOferta;
	}



	public GregorianCalendar getFechaInicioOferta() {
		return fechaInicioOferta;
	}



	public void setFechaInicioOferta(GregorianCalendar fechaInicioOferta) {
		this.fechaInicioOferta = fechaInicioOferta;
	}



	public GregorianCalendar getFechaFinOferta() {
		return fechaFinOferta;
	}



	public void setFechaFinOferta(GregorianCalendar fechaFinOferta) {
		this.fechaFinOferta = fechaFinOferta;
	}



	@Override
	public String toString() {
		return "Oferta [idOferta=" + idOferta + ", oferta=" + oferta + ", cantidadDias=" + cantidadDias
				+ ", valorOferta=" + valorOferta + ", fechaInicioOferta=" + fechaInicioOferta + ", fechaFinOferta="
				+ fechaFinOferta + "]";
	}
	
	
}
