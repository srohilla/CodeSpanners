package com.codespartans;

import java.util.Map;

import org.restlet.resource.Get;
import org.restlet.resource.Post;

import com.codespartans.dataTypes.Score;

public interface ScoresRetriever {

	@Get
	public Map<String, String> getScores();

	@Post
	public Map<String, String> setScores(Score score);

}
