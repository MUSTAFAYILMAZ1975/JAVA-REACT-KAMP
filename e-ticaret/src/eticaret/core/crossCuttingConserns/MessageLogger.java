package eticaret.core.crossCuttingConserns;

public class MessageLogger extends Logger {

	@Override
	void log() {
		System.out.println("Mesaj gönderildi.");
		
	}

}
