package app.api;

import org.springframework.stereotype.Component;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Component
@Path("/calculo")
public class Calculo {

    @GET
    @Path("/adicionar/{valor1}/{valor2}")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public Response adicionar(@PathParam("valor1") double valor1,
            @PathParam("valor2") double valor2) {
        double resultado = valor1 + valor2;
        return Response.status(200).entity(resultado).build();
    }

}
