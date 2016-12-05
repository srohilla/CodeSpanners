package api;

public class Score {

	private String username;
	private String highscore;

	public Score(String username, String highscore) {
		this.username = username;
		this.highscore = highscore;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getHighscore() {
		return highscore;
	}

	public void setHighscore(String highscore) {
		this.highscore = highscore;
	}

}
