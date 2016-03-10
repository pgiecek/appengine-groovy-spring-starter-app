package com.pgiecek.appengine.helloworld.web

import com.pgiecek.appengine.helloworld.service.GreetingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

import static groovy.json.JsonOutput.toJson

/**
 * Greeting controller.
 */
@RestController
class GreetingController {

    @Autowired
    private GreetingService greetingService

    /**
     * Returns greeting for the given name in thr form of JSON.
     *
     * @param name the name
     * @return greeting for the given name
     */
    @RequestMapping(value = '/greeting', method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    def greeting(@RequestParam(name = 'name', defaultValue = 'World') String name) {

        def greeting = greetingService.sayHello(name)
        def json = toJson([greeting: greeting])

        json
    }
}
