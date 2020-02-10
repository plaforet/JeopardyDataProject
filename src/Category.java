import java.util.ArrayList;

public class Category {
	private String categoryTitle;
	private ArrayList<Question> questions;
	
	public Category() {
		
	}
	
	public Category(String t, String q, String a, int r, int v, boolean d ) {
		this.categoryTitle = t;
		this.addQuestion(q, a, r, v, d);
	}
	
	public boolean newCategory(ArrayList<Category> cat) {
		ArrayList<String> titles = new ArrayList<String>();
		for(Category c : cat) {
			if(titles.contains(c.categoryTitle)) {
				return false;
			}
			else {
				titles.add(c.getCategoryTitle());
			}
		}
		return true;
	}
	
	public void addQuestion(String q, String a, int r, int v, boolean d) {
		this.questions.add(new Question(q, a, r, v, d));
	}

	public String getCategoryTitle() {
		return categoryTitle;
	}

	public void setCategoryTitle(String categoryTitle) {
		this.categoryTitle = categoryTitle;
	}

	public ArrayList<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(ArrayList<Question> questions) {
		this.questions = questions;
	}
}
