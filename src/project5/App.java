package project5;

public class App {

	public static void main(String[] args) {
		
		Logger logger1 = new AsteriskLogger();
		
		Logger logger2 = new SpacedLogger();
		
		logger1.log("Hello");
		
		logger1.log("Banana");
		
		logger1.error("Error");
		
		logger1.error("Woops! Try Again!");
		
		logger2.log("Banana");
		
		logger2.error("Try Again!");

	}

}
