package medical.entity;

public class User {
	private int id;
	private String username;
	private String password;
	private int idphanquyen;
	public User(String username, String password, int idphanquyen) {
		super();
		this.username = username;
		this.password = password;
		this.idphanquyen = idphanquyen;
	}
	
	public User(String username) {
		super();
		this.username = username;
	}

	public User() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getIdphanquyen() {
		return idphanquyen;
	}
	public void setIdphanquyen(int idphanquyen) {
		this.idphanquyen = idphanquyen;
	}
	
	
}
