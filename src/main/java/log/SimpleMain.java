package log;

import org.apache.log4j.Logger;

import ch.qos.logback.classic.BasicConfigurator;

public class SimpleMain {

	private static final Logger log=Logger.getLogger(SimpleMain.class.getName());
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.info("[INFO] hello log4j");
		
	
	}

}
