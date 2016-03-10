package com.pgiecek.appengine.helloworld.service

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * Service layer configuration.
 */
@Configuration
class ServiceConfig {

    @Bean
    GreetingService greetingService() {
        return new GreetingServiceImpl()
    }
}
