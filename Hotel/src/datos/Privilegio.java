package datos;
import java.util.*;
public class Privilegio {
	
	private long  idPrivilegio;
	private String privilegio;
	private String descripcion;
	
	public Privilegio (){}
	public Privilegio(String privilegio, String descripcion) {
			super();
			this.privilegio = privilegio;
			this.descripcion = descripcion;
		}
	
	
	public long getIdPrivilegio() {
		return idPrivilegio;
	}

	protected void setIdPrivilegio(long idPrivilegio) {
		this.idPrivilegio = idPrivilegio;
	}

	public String getPrivilegio() {
		return privilegio;
	}

	public void setPrivilegio(String privilegio) {
		this.privilegio = privilegio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Privilegio [idPrivilegio=" + idPrivilegio + ", privilegio=" + privilegio + ", descripcion="
				+ descripcion + "]";
	}

	

}
