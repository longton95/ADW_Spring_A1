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
//                    .antMatchers("/", "/login", "/css/**", "/webjars/**").permitAll()
//                    .antMatchers("/profile/**").access("hasRole('USER') or hasRole('ADMIN')")
//                    .antMatchers("/admin").hasRole("ADMIN")
//                    .antMatchers("/user").hasRole("ADMIN")
//                .anyRequest().authenticated()

                .anyRequest().permitAll()

                    .and()

                .formLogin()
                    .loginPage("/login")
                    .failureUrl("/login-error")

                    .and()

                .logout()
                    .logoutUrl("/logout")
                    .permitAll()
                    .logoutSuccessUrl("/index")
                    .invalidateHttpSession(true)

                    .and()

                .exceptionHandling()
                    .accessDeniedPage("/403")

                    .and()

                .csrf();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser(User.withDefaultPasswordEncoder().username("user").password("password").roles("ADMIN"));
    }
}