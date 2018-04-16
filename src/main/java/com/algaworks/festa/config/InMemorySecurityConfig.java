package com.algaworks.festa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@Configuration
public class InMemorySecurityConfig {
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder builder) throws Exception {
		builder
			.inMemoryAuthentication()
			.withUser("Vinicius").password("123").roles("USER")
			.and()
			.withUser("teste").password("123").roles("USER")
			.and()
			.withUser("Vinnyzera").password("123").roles("USER");
	}
}