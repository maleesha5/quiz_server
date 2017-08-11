
package com.maleesha.quiz;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.maleesha.quiz.admin.AdminService;

@EnableWebSecurity
@EnableOAuth2Sso
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Bean
	public UserDetailsService mongoUserDetails() {
		return new AdminService();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		UserDetailsService userDetailsService = mongoUserDetails();
		auth.userDetailsService(userDetailsService);
	}

	// Configuring what to allow and what not for the public
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.csrf().disable().authorizeRequests().antMatchers("/**", "/products/**", "/customer/**", "/img/**")
				.permitAll().antMatchers("/admin/productForm", "/admin/saveAdmin").hasAnyAuthority("admin").anyRequest()
				.authenticated().and().formLogin().defaultSuccessUrl("/admin").loginPage("/login").permitAll().and()
				.logout().logoutSuccessUrl("/").permitAll();
	}

	// ****IN MEMORY USERS IN SPRING SECURITY****///

	/*
	 * @Autowired public void configureGlobal(AuthenticationManagerBuilder auth)
	 * throws Exception { auth .inMemoryAuthentication()
	 * .withUser("user").password("password").roles("USER"); }
	 */

}
