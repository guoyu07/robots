package com.imdrissi.rbc.ace.robots.security;

import com.imdrissi.rbc.ace.robots.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component("authenticationProvider")
public class AuthenticationProvider extends DaoAuthenticationProvider {

  @Autowired
  public void setUserDetailsService(UserDetailsService userDetailsService) {
    super.setUserDetailsService(userDetailsService);
    super.setPasswordEncoder(passwordEncoder());
  }

  @Override
  public Authentication authenticate(Authentication authentication) {
    return super.authenticate(authentication);
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }
}
