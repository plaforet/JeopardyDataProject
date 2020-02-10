
public class Question {
	private String question;
	private String answer;
	private int value;
	private boolean dailyDouble;
	private int round;
	private String comments;
	private String airDate;
	private String notes;
	
	public Question() {
		
	}
	
	public Question (String quest, String ans) {
		this.question = quest;
		this.answer = ans;
	}
	
	public Question(String quest, String ans, int r, int val, boolean dub) {
		this(quest, ans);
		this.value = val;
		this.dailyDouble = dub;
		this.round = r;
	}
	
	public Question(String q, String a, int r, int v, boolean d, String c, String aD, String n) {
		this(q, a, r, v, d);
		this.comments = c;
		this.airDate = aD;
		this.notes = n;
	}
	
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public boolean isDailyDouble() {
		return dailyDouble;
	}
	public void setDailyDouble(boolean dailyDouble) {
		this.dailyDouble = dailyDouble;
	}
	public int getRound() {
		return round;
	}
	public void setRound(int round) {
		this.round = round;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getAirDate() {
		return airDate;
	}

	public void setAirDate(String airDate) {
		this.airDate = airDate;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
