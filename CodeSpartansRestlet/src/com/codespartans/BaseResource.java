package com.codespartans;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.restlet.data.Form;
import org.restlet.data.MediaType;
import org.restlet.data.Parameter;
import org.restlet.ext.json.JsonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.representation.StringRepresentation;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

public abstract class BaseResource extends ServerResource {

	protected ResponseParseFactory parseFactory = null;
	protected Logger logger = Logger.getLogger(BaseResource.class);
	JSONArray jsonArray;
	private String jsonString = "";

	@SuppressWarnings("rawtypes")
	@Post("json")
	public Representation doPost(Representation entity) {
		Map json = null;
		parseFactory = new ResponseParseFactory();
		try {
			JsonRepresentation represent = new JsonRepresentation(entity);
			JSONObject jsonobject = represent.getJsonObject();
			JSONParser parser = new JSONParser();
			String jsonText = jsonobject.toString();
			json = (Map) parser.parse(jsonText);
			jsonString = processRequest(json, "post");
		} catch (Exception e) {
			e.printStackTrace();
			jsonString = parseFactory.getFailureJsonString(e.getMessage());
		}
		return new StringRepresentation(jsonString, MediaType.APPLICATION_JSON);
	}

	@SuppressWarnings("rawtypes")
	@Get
	public Representation doGet() {
		Map json = null;
		parseFactory = new ResponseParseFactory();
		jsonString = "";
		try {
			json = getMapFromParam(getRequest().getResourceRef().getQueryAsForm());
			parseFactory = new ResponseParseFactory();
			// jsonString = processRequest(json, "get");
			ScoresRetrieverImpl scoresRetriever = new ScoresRetrieverImpl();
			jsonArray = new JSONArray(scoresRetriever.getScores());

		} catch (Exception e) {
			e.printStackTrace();
			jsonString = parseFactory.getFailureJsonString(e.getMessage());
		}
		JsonRepresentation jsonRep = new JsonRepresentation(jsonArray);
		return new JsonRepresentation(jsonArray);
		// return new StringRepresentation(jsonString,
		// MediaType.APPLICATION_JSON);
	}

	public abstract String processRequest(Map json, String method);

	public static Map<String, String> getMapFromParam(Form form) {
		Map<String, String> map = new HashMap<String, String>();
		for (Parameter parameter : form) {
			map.put(parameter.getName(), parameter.getValue());
		}
		return map;
	}

}