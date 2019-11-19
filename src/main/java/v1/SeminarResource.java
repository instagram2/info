package v1;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("demo/info")
public class SeminarResource {
    @GET
    public Seminar getInfo() {
        Seminar s = new Seminar();
        s.setClani("mm3600, jm6531");
        s.setOpis_projekta("Instagram2 je aplikacije za delejene slik.");
        s.setMikrostoritve("");
        s.setGithub("");
        s.setDockerhub("");
        s.setTravis("");
        return s;
    }

}
