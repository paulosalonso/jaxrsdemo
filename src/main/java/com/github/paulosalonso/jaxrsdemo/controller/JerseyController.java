package com.github.paulosalonso.jaxrsdemo.controller;

import com.github.paulosalonso.jaxrsdemo.dto.DemoDTO;
import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Slf4j
@Path("/jersey")
public class JerseyController {

    @GET
    @Produces(APPLICATION_JSON)
    public Response get() {
        return Response.ok()
                .entity(DemoDTO.builder()
                        .description("My first Jersey controller")
                        .build())
                .build();
    }

    @POST
    @Consumes(APPLICATION_JSON)
    public Response post(DemoDTO input) {
        log.info("{}", input);

        return Response.noContent().build();
    }
}
