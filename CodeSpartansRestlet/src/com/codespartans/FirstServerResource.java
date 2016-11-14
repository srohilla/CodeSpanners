package com.codespartans;

import java.util.Map;

public class FirstServerResource extends BaseResource {

	/*
	 * public static void main(String[] args) throws Exception { // Create the
	 * new Server(Protocol.HTTP, 8182, FirstServerResource.class).start(); }
	 */

	@Override
	public String processRequest(Map json, String method) {
		String returnString = "";
		ScoresRetrieverImpl scoresRetriever = new ScoresRetrieverImpl();
		System.out.println("1234567890");
		returnString = new ResponseParseFactory()
				.getSuccessJsonString(json.get(scoresRetriever.getScores()).toString());
		System.out.println("return string: " + returnString);
		return returnString;
	}

	/*
	 * public static void main(String[] args) throws Exception { // Create the
	 * HTTP server and listen on port 8182 // MongoClient mongo = new
	 * MongoClient("localhost", 27017);
	 * 
	 * new Server(Protocol.HTTP, 8182, FirstServerResource.class).start(); }
	 */

	/*
	 * @Post("json") public void postScore() { MongoClient mongo = new
	 * MongoClient("localhost", 27017); MongoDatabase db =
	 * mongo.getDatabase("codeSpartans"); MongoCollection<Score> collection =
	 * db.getCollection("highscores", Score.class);
	 * 
	 * }
	 */

}
