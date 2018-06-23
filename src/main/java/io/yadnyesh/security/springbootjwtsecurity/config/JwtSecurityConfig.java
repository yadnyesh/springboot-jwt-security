package io.yadnyesh.security.springbootjwtsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableGlobalMethodSecurity(prePostEnabled = true) //Enables Method level access control.
@EnableWebSecurity
@Configuration
public class JwtSecurityConfig {

}
