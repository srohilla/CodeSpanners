package com.codespartans;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.codespartans.dataTypes.Score;
import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;

public class ScoresRetrieverImpl implements ScoresRetriever {

	@Override
	public List<Score> getScores() {
		// TODO Auto-generated method stub
		MongoClient mongo = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
		MongoDatabase db = mongo.getDatabase("codeSpartans");
		FindIterable<Document> iterable = db.getCollection("highscores").find();
		List<Score> highscores = new ArrayList<Score>();
		int count = 0;
		iterable.forEach(new Block<Document>() {
			@Override
			public void apply(final Document document) {
				Score score = new Score();
				score.setUsername(document.get("username").toString());
				score.setHighscore(document.get("highscore").toString());
				highscores.add(score);
			}
		});

		// mongo.close();
		return highscores;
	}

	@Override
	public void setScores() {
		// TODO Auto-generated method stub

	}

}
