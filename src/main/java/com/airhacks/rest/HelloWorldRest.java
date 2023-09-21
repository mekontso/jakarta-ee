/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.airhacks.rest;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author LenovoP51
 */
@Path("hello")
public class HelloWorldRest {

    @Path("{name}")
    public JsonObject greet(@PathParam("name") String name) {
        return Json.createObjectBuilder()
                .add("name", name)
                .add("greeting", "Hello " + name)
                .add("message", "Hello from jakarta EE")
                .build();
    }
}
