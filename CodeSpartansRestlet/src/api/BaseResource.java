package api;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.restlet.data.Form;
import org.restlet.data.Parameter;
import org.restlet.ext.json.JsonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

import api.Score;

public abstract class BaseResource extends ServerResource {

	protected ResponseParseFactory parseFactory = null;
	protected Logger logger = Logger.getLogger(BaseResource.class);
	JSONObject jsonObject;

	@SuppressWarnings("unchecked")
	@Post("application/json")
	public Representation doPost(Representation entity) {
		parseFactory = new ResponseParseFactory();
		try {
			JsonRepresentation represent = new JsonRepresentation(entity);
			JSONObject jsonScoreObject = represent.getJsonObject();
			Iterator<String> itr = jsonScoreObject.keys();
			String username = itr.next();
			Score score = new Score(username, jsonScoreObject.get(username).toString());

			ScoresRetrieverImpl scoresRetriever = new ScoresRetrieverImpl();
			jsonObject = new JSONObject(scoresRetriever.setScores(score));
		} catch (Exception e) {
			e.printStackTrace();
			parseFactory.getFailureJsonString(e.getMessage());
		}
		JsonRepresentation jsonRep = new JsonRepresentation(jsonObject);
		return jsonRep;
	}

	@Get
	public Representation doGet() {
		parseFactory = new ResponseParseFactory();
		try {
			parseFactory = new ResponseParseFactory();
			ScoresRetrieverImpl scoresRetriever = new ScoresRetrieverImpl();
			jsonObject = new JSONObject(scoresRetriever.getScores());
		} catch (Exception e) {
			e.printStackTrace();
			parseFactory.getFailureJsonString(e.getMessage());
		}
		JsonRepresentation jsonRep = new JsonRepresentation(jsonObject);
		return jsonRep;
	}

	public abstract JSONObject processRequest(Map json, String method);

	public static Map<String, String> getMapFromParam(Form form) {
		Map<String, String> map = new HashMap<String, String>();
		for (Parameter parameter : form) {
			map.put(parameter.getName(), parameter.getValue());
		}
		return map;
	}

}