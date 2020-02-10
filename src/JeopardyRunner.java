import java.util.ArrayList;

import core.data.*;

public class JeopardyRunner {

	public static void main(String[] args) {
		DataSource ds = DataSource.connect("C:\\Users\\blafo\\eclipse-workspace\\JeopardyDataProject\\files\\Jeopardy1.csv");
		ds.setCacheTimeout(15*60);
		ds.load();
		ArrayList<Category> tempCategories = ds.fetchList("Category", "categoryTitle", "question", "answer", "round", "value", "dailyDouble");
		ArrayList<Category> categories = new ArrayList<Category>();
		for(Category c : tempCategories) {
			for(Category cat : categories) {
				if(!cat.newCategory(categories)) {
					
				}
			}
		}
	}

}
