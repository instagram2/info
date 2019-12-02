package v1;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@ApplicationScoped
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("info")
public class SeminarResource {
    @GET
    public Seminar getInfo() {
        Seminar s = new Seminar();
        s.setClani(["mm3600, jm6531"]);
        s.setOpis_projekta("Instagram2 je aplikacije za delejene slik.");
        s.setMikrostoritve(["http://35.227.141.201/v1/images", "http://35.203.185.148/v1/comments"]);
        s.setGithub(["https://github.com/instagram2/image-catalog", "https://github.com/instagram2/comments"]);
        s.setDockerhub(["https://hub.docker.com/r/instagram2/image-catalog", "https://hub.docker.com/r/instagram2/comments"]);
        s.setTravis(["https://travis-ci.org/instagram2/image-catalog", "https://travis-ci.org/instagram2/comments"]);
        return s;
    }

}
