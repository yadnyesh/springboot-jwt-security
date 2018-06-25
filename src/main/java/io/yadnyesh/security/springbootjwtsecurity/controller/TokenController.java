package io.yadnyesh.security.springbootjwtsecurity.controller;

import io.yadnyesh.security.springbootjwtsecurity.model.JwtUser;
import io.yadnyesh.security.springbootjwtsecurity.security.JwtTokenGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/token")
public class TokenController {
	
	@Autowired
	JwtTokenGenerator jwtTokenGenerator;

	@PostMapping
	public String generateJwtToken (@RequestBody final JwtUser jwtUser) {
		System.out.println(jwtUser.toString());
		return jwtTokenGenerator.generate(jwtUser);
	}
	
	@PutMapping
	public void printToken(@RequestBody final JwtUser jwtUser) {
		System.out.println(jwtUser.toString());
	}
	
}
