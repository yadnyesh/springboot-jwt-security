package io.yadnyesh.security.springbootjwtsecurity.controller;

import io.yadnyesh.security.springbootjwtsecurity.model.JwtUser;
import io.yadnyesh.security.springbootjwtsecurity.security.JwtTokenGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/token")
public class TokenController {
	
	@Autowired
	JwtTokenGenerator jwtTokenGenerator;

	@PostMapping("/{userName}")
	public String generateJwtToken (@RequestBody final JwtUser jwtUser) {
		
		JwtTokenGenerator jwtTokenGenerator = JwtTokenGenerator();
		return jwtTokenGenerator.generate(jwtUser);
	}
}
