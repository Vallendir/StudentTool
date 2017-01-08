package model.entity;
// Generated 2016-12-09 16:03:21 by Hibernate Tools 5.1.0.Alpha1

/**
 * Users generated by hbm2java
 */
public class Users extends Entity {
	private static final long serialVersionUID = -2082437761674163920L;
	private String login;
	private String password;
	private byte enabled;

	public Users() {
	}

	public Users(String login, String password, byte enabled) {
		this.login = login;
		this.password = password;
		this.enabled = enabled;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public byte getEnabled() {
		return this.enabled;
	}

	public void setEnabled(byte enabled) {
		this.enabled = enabled;
	}

}
