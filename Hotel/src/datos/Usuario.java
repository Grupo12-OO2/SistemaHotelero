package datos;
import java.util.*;
public class Usuario {
		private  long idUsuario;
		private  int dni;
		private  String nombre;
		private  String Apellido;
		
		
		public Usuario(){}


		public Usuario(int dni, String nombre, String apellido) {
			super();
			this.dni = dni;
			this.nombre = nombre;
			Apellido = apellido;
		}


		public long getIdUsuario() {
			return idUsuario;
		}


		protected void setIdUsuario(long idUsuario) {
			this.idUsuario = idUsuario;
		}


		public int getDni() {
			return dni;
		}


		public void setDni(int dni) {
			this.dni = dni;
		}


		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public String getApellido() {
			return Apellido;
		}


		public void setApellido(String apellido) {
			Apellido = apellido;
		}


		@Override
		public String toString() {
			return "Usuario [idUsuario=" + idUsuario + ", dni=" + dni + ", nombre=" + nombre + ", Apellido=" + Apellido
					+ "]";
		}
		
		
}
