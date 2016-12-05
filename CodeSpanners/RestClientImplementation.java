import org.restlet.resource.ClientResource;
/**
 * Class for proxy Pattern
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