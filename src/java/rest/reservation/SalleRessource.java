/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest.reservation;

import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author Orion
 */
@Path("salles")
public class SalleRessource {

    @Context
    private UriInfo context;

    public SalleRessource() {
    }

    @GET
    @Produces("application/xml")
    @Valid
    public List<Salle> getSalles() {
        System.out.println("getSalles");
        return ReservationBDD.getSalles();
    }

    @GET
    @Path("salle-{nom}")
    @Produces("application/xml")
    public Salle getSalle(@NotNull @PathParam("nom") String nom) {
        Salle salle = null;

        for (Salle current : ReservationBDD.getSalles()) {
            if (current.getNom().equals(nom)) {
                salle = current;
            }
        }
        return salle;
    }

}
