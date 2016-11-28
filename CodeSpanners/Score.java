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
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    } 
    
    @SuppressWarnings("unchecked")
	private static <K> HashMap<String, String> getScores() throws IOException {
		ClientResource clientResource = new ClientResource("hhttp://ec2-54-214-109-30.us-west-2.compute.amazonaws.com:8080/CodeSpannersRestlet/service/scores");
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
	private static <K> void postScores(String name, String highscore) throws IOException {
		HashMap<String, String> scoreMap = new HashMap<String, String>();
		scoreMap.put(name, highscore);
		JSONObject jsonObj = new JSONObject(scoreMap);
		JsonRepresentation jsonRes = new JsonRepresentation(jsonObj);
		System.out.println("scoreMap: " + scoreMap);
		ClientResource clientResource = new ClientResource("http://ec2-54-214-109-30.us-west-2.compute.amazonaws.com:8080/CodeSpannersRestlet/service/scores");
		Representation highscoresRep = clientResource.post(jsonRes, MediaType.APPLICATION_JSON);
		highscoresRep.write(System.out);
	}
    
}
