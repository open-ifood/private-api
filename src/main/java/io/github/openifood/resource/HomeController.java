package io.github.openifood.resource;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
public class HomeController {

    @GET
    public String get() {
        return "private-api";
    }

}
