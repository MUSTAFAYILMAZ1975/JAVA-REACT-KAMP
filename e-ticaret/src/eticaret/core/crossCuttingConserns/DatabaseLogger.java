package eticaret.core.crossCuttingConserns;

public class DatabaseLogger extends Logger{

	@Override
	void log() {
		System.out.println("Data loglandý");
	}

}
