import java.util.ArrayList;

import core.data.*;

public class JeopardyRunner {

	public static void main(String[] args) {
		DataSource ds = DataSource.connect("D:\\Projects\\Jeopardy\\Jeopardy Questions.csv");
		ds.setCacheTimeout(15*60);
		ds.load();
		ds.printUsageString();
		
	}

}
