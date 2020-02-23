package com.mfh.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author mfh
 * @date 2020/2/23 9:27
 */
@Configuration
@EnableWebSecurity
public class WebAppSecurity extends WebSecurityConfigurerAdapter {
}
