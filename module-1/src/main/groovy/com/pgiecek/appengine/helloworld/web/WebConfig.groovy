package com.pgiecek.appengine.helloworld.web

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter

/**
 * Web layer configuration.
 */
@EnableWebMvc
@Configuration
@ComponentScan
class WebConfig extends WebMvcConfigurerAdapter {

    // Customize the imported configuration via overriding individual methods
}
