package com.example.springAssignment.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;


@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    // @formatter:off
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                    .antMatchers("/", "/login", "/css/**", "/webjars/**").permitAll()
                    .antMatchers("/profile/**").access("hasRole('USER') or hasRole('ADMIN')")
                    .antMatchers("/admin").hasRole("ADMIN")
                    .antMatchers("/user").hasRole("ADMIN")
                    .anyRequest().authenticated()

                    .and()

                .formLogin()
                    .loginPage("/login")
                    .failureUrl("/login-error")

                    .and()

                .logout()
                    .logoutUrl("/logout")
                    .logoutSuccessUrl("/index")
                    .invalidateHttpSession(true)

                    .and()

                .exceptionHandling()
                    .accessDeniedPage("/403")

                    .and()

                .csrf();
    }
    // @formatter:on

    // @formatter:off
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser(User.withDefaultPasswordEncoder().username("user").password("password").roles("ADMIN"));
    }
    // @formatter:on
}