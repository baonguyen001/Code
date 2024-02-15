package com.luv2code.springboot.cruddemo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class DemoSecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){

        UserDetails join = User.builder()
                .username("join")
                .password("{noop}root")
                .roles("EMPLOYEE")
                .build();

        UserDetails math = User.builder()
                .username("math")
                .password("{noop}root")
                .roles("EMPLOYEE", "MANAGER")
                .build();

        UserDetails tom = User.builder()
                .username("tom")
                .password("{noop}root")
                .roles("EMPLOYEE", "MANAGER", "ADMIN")
                .build();

        return new InMemoryUserDetailsManager(join, math, tom);
    }

}
