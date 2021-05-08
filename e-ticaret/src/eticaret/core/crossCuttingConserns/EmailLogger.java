package eticaret.core.crossCuttingConserns;

public class EmailLogger extends Logger{

	@Override
	void log() {
		System.out.println("E-mail gönderildi.");
		
	}

}
