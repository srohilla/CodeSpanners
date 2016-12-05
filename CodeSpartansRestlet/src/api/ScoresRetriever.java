package api;

import java.util.Map;

import org.restlet.resource.Get;
import org.restlet.resource.Post;

import api.Score;

public interface ScoresRetriever {

	@Get
	public Map<String, String> getScores();

	@Post
	public Map<String, String> setScores(Score score);

}
