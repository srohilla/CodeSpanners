package api;

import java.util.HashMap;
import java.util.Map;

import org.bson.Document;

import api.Score;
import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;;

public class ScoresRetrieverImpl implements ScoresRetriever {

	@Override
	public Map<String, String> getScores() {
		MongoClient mongo = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
		MongoDatabase db = mongo.getDatabase("codeSpartans");

		FindIterable<Document> iterable = db.getCollection("highscores").find();
		Map<String, String> highscores = new HashMap<String, String>();
		iterable.forEach(new Block<Document>() {
			@Override
			public void apply(final Document document) {
				highscores.put(document.get("username").toString(), document.get("highscore").toString());
			}
		});

		// mongo.close();
		return highscores;
	}

	@Override
	public Map<String, String> setScores(Score score) {
		MongoClient mongo = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
		MongoDatabase db = mongo.getDatabase("codeSpartans");
		Map<String, Object> scores = new HashMap<String, Object>();
		scores.put("username", score.getUsername());
		scores.put("highscore", score.getHighscore());
		Document doc = new Document(scores);
		MongoCollection<Document> collection = db.getCollection("highscores");
		collection.insertOne(doc);

		FindIterable<Document> iterable = collection.find();
		Map<String, String> highscores = new HashMap<String, String>();
		iterable.forEach(new Block<Document>() {
			@Override
			public void apply(final Document document) {
				highscores.put(document.get("username").toString(), document.get("highscore").toString());
			}
		});

		// mongo.close();
		return highscores;
	}

}
