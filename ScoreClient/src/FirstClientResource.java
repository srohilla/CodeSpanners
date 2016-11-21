import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

import org.json.JSONException;
import org.json.JSONObject;
import org.restlet.data.MediaType;
import org.restlet.representation.Representation;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

public class FirstClientResource extends ClientResource {

	public static void main(String[] args) throws ResourceException, IOException {
		getScores();
		postScores("ashay", "154616");
	}

	@SuppressWarnings("unchecked")
	private static <K> void getScores() throws IOException {
		ClientResource clientResource = new ClientResource("http://localhost:8080/CodeSpartansRestlet/service/scores");
		Representation highscoresRep = clientResource.get(new MediaType("application/json"));
		try {
			JSONObject jsonRes = new JSONObject(highscoresRep.getText());
			HashMap<String, String> scoreMap = new HashMap<String, String>();

			Iterator<String> scoreItr = jsonRes.keys();
			while (scoreItr.hasNext()) {
				String name = scoreItr.next();
				scoreMap.put(name, jsonRes.get(name).toString());
			}
			System.out.println("Scores:" + scoreMap);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	private static <K> void postScores(String name, String highscore) throws IOException {
		HashMap<String, String> scoreMap = new HashMap<String, String>();
		scoreMap.put(name, highscore);
		JSONObject jsonRes = new JSONObject(scoreMap);
		System.out.println("scoreMap: " + scoreMap);
		ClientResource clientResource = new ClientResource("http://localhost:8080/CodeSpartansRestlet/service/scores");
		Representation highscoresRep = clientResource.post(jsonRes, new MediaType("application/json"));
		try {
			JSONObject jsonResScore = new JSONObject(highscoresRep.getText());
			HashMap<String, String> scoreMap1 = new HashMap<String, String>();

			Iterator<String> scoreItr = jsonResScore.keys();
			while (scoreItr.hasNext()) {
				String name1 = scoreItr.next();
				scoreMap.put(name1, jsonRes.get(name1).toString());
			}
			System.out.println("Scores:" + scoreMap1);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
