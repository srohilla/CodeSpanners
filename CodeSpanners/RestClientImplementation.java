import org.restlet.resource.ClientResource;
/**
 * Write a description of class RestClientImplementation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RestClientImplementation implements RestClient
{
    private String url;

    public RestClientImplementation(){
        this.url = "http://ec2-54-214-109-30.us-west-2.compute.amazonaws.com:8080/CodeSpannersRestlet/service/scores";
    }

    @Override
    public ClientResource getClientResource(){
        return new ClientResource(url);
    }
}