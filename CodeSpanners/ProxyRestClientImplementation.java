import org.restlet.resource.ClientResource;
/**
 * Write a description of class ProxyRestImplementation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProxyRestClientImplementation implements RestClient
{
    private RestClientImplementation restletClient;
    private String url;

    public ProxyRestClientImplementation(String url){
        this.url = url;
    }

    @Override
    public ClientResource getClientResource(){
        if(restletClient == null){
            restletClient = new RestClientImplementation();
        }
        return restletClient.getClientResource();
    };
}