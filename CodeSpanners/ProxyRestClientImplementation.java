import org.restlet.resource.ClientResource;
/**
 * class ProxyRestImplementation here.
 **/ 
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