package log;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Main {
	private static final Logger log=Logger.getLogger(Main.class);
	public static void main(String[] args) {
		PropertyConfigurator.configure("C:\\project\\work\\jwork\\springphonebook\\src\\main\\java\\log\\log4j.properties");
		log.debug("start");
		//log.info("log info");
	}
}
