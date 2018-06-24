package io.yadnyesh.security.springbootjwtsecurity.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JwtSuccesHandler implements AuthenticationSuccessHandler {
	
	public JwtSuccesHandler() {
	}
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
		System.out.println("User Authenticated Successfully");
	}
}
