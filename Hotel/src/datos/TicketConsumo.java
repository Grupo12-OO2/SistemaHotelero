package datos;
import java.util.*;
public class TicketConsumo {
		private  long idTicketConsumo ;
		private  GregorianCalendar fecha ;
		private  boolean pagado ;
		private   Set<ItemTicket> itemsTickets; //nesesita la clase itemticket
		
		
		
		public TicketConsumo(long idTicketConsumo, GregorianCalendar fecha, boolean pagado,
				Set<ItemTicket> itemsTickets, Login login) {
			super();
			this.idTicketConsumo = idTicketConsumo;
			this.fecha = fecha;
			this.pagado = pagado;		
			this.itemsTickets = itemsTickets;
			this.login = login;
		}

		public long getIdTicketConsumo() {
			return idTicketConsumo;
		}

		public void setIdTicketConsumo(long idTicketConsumo) {
			this.idTicketConsumo = idTicketConsumo;
		}

		public GregorianCalendar getFecha() {
			return fecha;
		}

		public void setFecha(GregorianCalendar fecha) {
			this.fecha = fecha;
		}

		public boolean isPagado() {
			return pagado;
		}

		public void setPagado(boolean pagado) {
			this.pagado = pagado;
		}

		public ItemTicket getItemsTickets() {
			return itemsTickets;
		}

		public void setItemsTickets(ItemTicket itemsTickets) {
			this.itemsTickets = itemsTickets;
		}

		public Login getLogin() {
			return login;
		}

		public void setLogin(Login login) {
			this.login = login;
		}

		private   Login login;

		public TicketConsumo(){}

		


}

