package project5;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		StringBuilder spacedMessage = new StringBuilder();
		for(char ch: log.toCharArray()) {
			spacedMessage.append(ch).append(" ");
		}
		System.out.println(spacedMessage.toString());
		
	}

	@Override
	public void error(String error) {
		
		StringBuilder spacedMessage = new StringBuilder();
		for(char ch: error.toCharArray()) {
			spacedMessage.append(ch).append(" ");
		}
		System.out.println("Error: " + spacedMessage.toString());
		
	}

	

}
