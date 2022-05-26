package com.example.port4clondelgentejava11;

import javax.servlet.http.HttpServletResponse;

import com.example.port4clondelgentejava11.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;



@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserRepo userRepository;
  //  @Autowired
    //private JwtTokenFilter jwtTokenFilter;
    
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(
            username -> userRepository.findByEmail(username)
                .orElse(null));
    }
 
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }  
 
    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
    http.csrf().disable();
    http.sessionManagement()
    .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
     
    http.authorizeRequests()
            .antMatchers("/auth/login")
            .permitAll()
            .anyRequest()
            .authenticated();
                     
            
            //http.addFilterBefore(jwtTokenFilter, UsernamePasswordAuthenticationFilter.class);
            //http.addFilterBefore(jwtTokenFilter, UsernamePasswordAuthenticationFilter.class);
    http.exceptionHandling()
        .authenticationEntryPoint(
            (request, response, ex) -> {
                response.sendError(
                    HttpServletResponse.SC_UNAUTHORIZED,
                    ex.getMessage()
                );
            }
        );
 
    //http.addFilterBefore(jwtTokenFilter, UsernamePasswordAuthenticationFilter.class);
}
    
}
