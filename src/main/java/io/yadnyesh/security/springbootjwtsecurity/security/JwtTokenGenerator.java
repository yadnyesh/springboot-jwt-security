package io.yadnyesh.security.springbootjwtsecurity.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.yadnyesh.security.springbootjwtsecurity.model.JwtUser;

public class JwtTokenGenerator {
	
	public String generate(JwtUser jwtUser) {
		Claims claims = Jwts.claims()
						.setSubject(jwtUser.getUserName());
		
		claims.put("userId", String.valueOf(jwtUser.getUserId()));
		claims.put("role", jwtUser.getRole());
		
		return Jwts.builder()
				.setClaims(claims)
				.signWith(SignatureAlgorithm.HS512, "youtube")
				.compact();
	}
}
