package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("goodbye")
public class GoodbyeRestService {
	
	@GET
    @Path("response")
    @Produces(MediaType.APPLICATION_JSON)
    public String goodbye(){
        return "Goodbye";
    }

}
