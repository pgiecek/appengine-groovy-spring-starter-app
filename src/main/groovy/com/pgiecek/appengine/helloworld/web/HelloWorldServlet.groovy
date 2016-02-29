package com.pgiecek.appengine.helloworld.web

import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

import static groovy.json.JsonOutput.toJson

class HelloWorldServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {

        def json = toJson([greeting: 'Hello World!'])

        def writer = response.writer
        writer.println json
    }
}
