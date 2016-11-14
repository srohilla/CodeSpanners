package com.codespartans;

import java.util.List;

import org.restlet.resource.Get;
import org.restlet.resource.Post;

import com.codespartans.dataTypes.Score;

public interface ScoresRetriever {

	@Get
	public List<Score> getScores();

	@Post
	public void setScores();

}
