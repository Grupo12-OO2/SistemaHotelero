package datos;
import java.util.*; 
public class TicketMantenimiento {
		private long idTicketMantenimiento;
		private  String ticketMantenimiento;
		private  GregorianCalendar fecha;
		private  boolean realizado;
		private  Login login;
		
		public TicketMantenimiento(){}

		public TicketMantenimiento(String ticketMantenimiento, GregorianCalendar fecha, boolean realizado,
				Login login) {
			super();
			this.ticketMantenimiento = ticketMantenimiento;
			this.fecha = fecha;
			this.realizado = realizado;
			this.login = login;
		}

		public long getIdTicketMantenimiento() {
			return idTicketMantenimiento;
		}

		protected void setIdTicketMantenimiento(long idTicketMantenimiento) {
			this.idTicketMantenimiento = idTicketMantenimiento;
		}

		public String getTicketMantenimiento() {
			return ticketMantenimiento;
		}

		public void setTicketMantenimiento(String ticketMantenimiento) {
			this.ticketMantenimiento = ticketMantenimiento;
		}

		public GregorianCalendar getFecha() {
			return fecha;
		}

		public void setFecha(GregorianCalendar fecha) {
			this.fecha = fecha;
		}

		public boolean isRealizado() {
			return realizado;
		}

		public void setRealizado(boolean realizado) {
			this.realizado = realizado;
		}

		public Login getLogin() {
			return login;
		}

		public void setLogin(Login login) {
			this.login = login;
		}

		@Override
		public String toString() {
			return "TicketMantenimiento [idTicketMantenimiento=" + idTicketMantenimiento + ", ticketMantenimiento="
					+ ticketMantenimiento + ", fecha=" + fecha + ", realizado=" + realizado + ", login=" + login + "]";
		}
		
		
		
}
