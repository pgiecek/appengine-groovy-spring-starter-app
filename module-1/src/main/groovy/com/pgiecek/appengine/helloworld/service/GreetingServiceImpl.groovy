package com.pgiecek.appengine.helloworld.service

/**
 * Implementation of {@link GreetingService}.
 */
class GreetingServiceImpl implements GreetingService {

    @Override
    String sayHello(String name) {
        "Hello $name!"
    }
}
