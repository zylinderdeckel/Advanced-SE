package alles;

import Quiz.QuizMain;

public class HandleExit {

	public static void perform(String string, String[] args) throws InterruptedException {
		switch(string) {
			case "Start":
				alles.Main.main(args);
				break;
			case "Exit":
				System.exit(0);
				break;
			case "Themen":
				QuizMain.main(args);
				break;
		}
	}

}
