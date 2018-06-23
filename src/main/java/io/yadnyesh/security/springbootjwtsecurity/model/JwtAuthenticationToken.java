package io.yadnyesh.security.springbootjwtsecurity.model;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class JwtAuthenticationToken extends UsernamePasswordAuthenticationToken {
	
	public JwtAuthenticationToken(Object principal, Object credentials) {
		super(principal, credentials);
	}

}
