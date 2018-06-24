package io.yadnyesh.security.springbootjwtsecurity.controller;

import io.yadnyesh.security.springbootjwtsecurity.model.JwtUser;
import io.yadnyesh.security.springbootjwtsecurity.security.JwtTokenGenerator;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/token")
public class TokenController {


	@PostMapping("/{userName}")
	public String generateJwtToken (@RequestBody final JwtUser jwtUser) {
		
		JwtTokenGenerator jwtTokenGenerator = new JwtTokenGenerator();
		return jwtTokenGenerator.generate(jwtUser);
	}
}
