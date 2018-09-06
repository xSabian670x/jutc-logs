package lab3.jutc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import lab3.jutc.samples.MainSample;

public class App {
	
	private static Logger logger;
	
	public static Logger getLogger(){
		if(logger == null){
			logger =  LogManager.getRootLogger();
		}
		return logger;
	}
	
	public static void main(String[] args){
		getLogger().info("Running Main");
		new MainSample();
	}

}
