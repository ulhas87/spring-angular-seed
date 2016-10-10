package com.app.controllers;

import com.app.models.Hello;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * A Hello World Controller
 * @author Ulhas Pai
 */
@Path("/home")
@RequestScoped
public class HelloWorldController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Hello get() {
        return new Hello("world");
    }

}
