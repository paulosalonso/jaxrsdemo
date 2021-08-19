package com.github.paulosalonso.jaxrsdemo.controller;

import com.github.paulosalonso.jaxrsdemo.dto.DemoDTO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/jersey")
@Produces(MediaType.APPLICATION_JSON)
public class JerseyController {

    @GET
    public Response get() {
        return Response.ok()
                .entity(DemoDTO.builder()
                        .description("My first Jersey controller")
                        .build())
                .build();
    }
}
