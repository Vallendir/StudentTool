package model.entity;
// Generated 2016-12-09 16:03:21 by Hibernate Tools 5.1.0.Alpha1

/**
 * StUserDetails generated by hbm2java
 */
public class UserDetails extends Entity {
	private static final long serialVersionUID = 3013666824412519533L;
	private Integer userRoleId;
	private String login;
	private String role;

	public UserDetails() {
	}

	public UserDetails(String login, String role) {
		this.login = login;
		this.role = role;
	}

	public Integer getUserRoleId() {
		return this.userRoleId;
	}

	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}