package com.pgiecek.appengine.helloworld.service

/**
 * Greeting service.
 */
interface GreetingService {

    /**
     * Returns the greeting for the given name.
     *
     * @param name the name
     * @return the greeting for the given name
     */
    String sayHello(String name)
}