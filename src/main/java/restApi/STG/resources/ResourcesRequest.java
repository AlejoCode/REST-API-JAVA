package restApi.STG.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("resources")
public class ResourcesRequest {
	
	ResourceDao repo = new ResourceDao();
	
	@GET
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<ResourcesObj> getResources() {		
		System.out.println("getResources() called ...");
		return repo.getResources();
	}
	
	@GET
    @Path("resource/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public ResourcesObj getResource(@PathParam("id") int id) {
		System.out.println("getResource() called ...");

		return repo.getResource(id);
	}
	
	@POST
	@Path("createResource")
	public ResourcesObj createResource(ResourcesObj a1) {
		System.out.println("createResource() called ...");
		System.out.println(a1);
		repo.createResource(a1);
		return a1;
	}

}

