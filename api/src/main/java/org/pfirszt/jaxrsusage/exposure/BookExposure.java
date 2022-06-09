package org.pfirszt.jaxrsusage.exposure;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("books")
public class BookExposure {

    @GET
    @Produces("application/json")
    public Response getAllBooks() {
        return Response.ok().entity("books").build();
    }

}
