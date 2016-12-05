package api;
import org.restlet.*;
import org.restlet.data.Protocol;
import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class ServerApplication extends Application {
	public static void main(String[] args) throws Exception {
        Component server = new Component() ;
        server.getServers().add(Protocol.HTTP, 8080) ;
        server.getDefaultHost().attach(new ServerApplication()) ;
        server.start();
    }
	@Override
	public synchronized Restlet createInboundRoot() {
		Router router = new Router(getContext());
		router.attach("/scores", ServerResource.class);
		return router;
	}

}
