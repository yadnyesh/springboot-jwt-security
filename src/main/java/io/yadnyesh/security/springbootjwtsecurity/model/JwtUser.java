package io.yadnyesh.security.springbootjwtsecurity.model;

public class JwtUser {
	
	private String userName;
	
	private Long userId;
	
	private String role;
	
	public void setId(long userId) {
	}
	
	public void setRole(String role) {
	}
	
	public void setUserName(String subject) {
	}
	
	public String getUserName() {
		return userName;
	}
	
	public Long getUserId() {
		return userId;
	}
	
	public String getRole() {
		return role;
	}
}
