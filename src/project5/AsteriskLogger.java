package project5;

public class AsteriskLogger implements Logger {
	
	@Override
	public void log(String log) {
		int length = log.length() + 6;
		System.out.println("*".repeat(length));
		System.out.println("***" + log + "***");
		System.out.println("*".repeat(length));
		
		
	}

	@Override
	public void error(String error) {
		int length = error.length() + 13;
		System.out.println("*".repeat(length));
		System.out.println("***Error: " + error  + "***");
		System.out.println("*".repeat(length));
		
	}

}
