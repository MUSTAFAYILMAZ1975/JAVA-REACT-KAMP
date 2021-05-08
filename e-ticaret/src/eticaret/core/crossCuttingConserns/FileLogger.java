package eticaret.core.crossCuttingConserns;

public class FileLogger extends Logger{

	@Override
	void log() {
		System.out.println("Dosyaya loglandý.");
		
	}

}
