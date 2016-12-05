import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

import org.json.JSONException;
import org.json.JSONObject;
import org.restlet.data.MediaType;
import org.restlet.representation.Representation;
import org.restlet.ext.json.JsonRepresentation;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

/**
 * Class that interacts with the Server using proxy and fetches/posts the score
 * 
 */
public class Score extends Actor
{   public static String playerName;
    public static int score;
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    } 
    
    @SuppressWarnings("unchecked")
	public static HashMap<String, String> getScores() throws IOException {
		ClientResource clientResource = new ClientResource("http://ec2-54-214-109-30.us-west-2.compute.amazonaws.com:8080/CodeSpannersRestlet/service/scores");
		Representation highscoresRep = clientResource.get(new MediaType("application/json"));
		HashMap<String, String> scoreMap = new HashMap<String, String>();
		try {
			JSONObject jsonRes = new JSONObject(highscoresRep.getText());
			Iterator<String> scoreItr = jsonRes.keys();
			while (scoreItr.hasNext()) {
				String name = scoreItr.next();
				scoreMap.put(name, jsonRes.get(name).toString());
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return scoreMap;
	}

	@SuppressWarnings("unchecked")
	public static void postScores() throws IOException {
		HashMap<String, String> scoreMap = new HashMap<String, String>();
		String sc=String.valueOf(score);
		playerName=playerName.toUpperCase();
		scoreMap.put(playerName,sc);
		JSONObject jsonObj = new JSONObject(scoreMap);
		JsonRepresentation jsonRes = new JsonRepresentation(jsonObj);
		//System.out.println("scoreMap: " + scoreMap);
		//ClientResource clientResource = new ClientResource("http://ec2-54-214-109-30.us-west-2.compute.amazonaws.com:8080/CodeSpannersRestlet/service/scores");
		ProxyRestClientImplementation proxyRestlet = new ProxyRestClientImplementation("");
		ClientResource clientResource = proxyRestlet.getClientResource();
		Representation highscoresRep = clientResource.post(jsonRes, new MediaType("application/json"));
		//highscoresRep.write(System.out);
	}
    
}
