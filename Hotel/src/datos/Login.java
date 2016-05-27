package datos;
import java.util.*;
public class Login {
	
	private long idLogin;
	private String nickname;
	private String clave;
	private Privilegio privilegio;
	
	public Login(){}

	public Login( String nickname, String clave, Privilegio privilegio) {
		super();
		this.nickname = nickname;
		this.clave = clave;
		this.privilegio = privilegio;
	}

	public long getIdLogin() {
		return idLogin;
	}

	protected void setIdLogin(long idLogin) {
		this.idLogin = idLogin;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Privilegio getPrivilegio() {
		return privilegio;
	}

	public void setPrivilegio(Privilegio privilegio) {
		this.privilegio = privilegio;
	}

	@Override
	public String toString() {
		return "Login [idLogin=" + idLogin + ", nickname=" + nickname + ", clave=" + clave + ", privilegio="
				+ privilegio + "]";
	}
	
	

}
