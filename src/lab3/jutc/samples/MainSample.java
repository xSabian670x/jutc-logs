package lab3.jutc.samples;

import lab3.jutc.App;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainSample {
	
//	Static property
	private static Logger logger;
	
//	Static Constructor
	static {
		logger = LogManager.getLogger(MainSample.class);
//		May also be written as
//		logger = LogManager.getRootLogger();
	}
	
	public MainSample(){
		super();
		try {
		    logger.trace(MainSample.class.getName()+" initialized");
		    if(logger != null){
		       throw new ClassNotFoundException();
		    }else{
		       throw new NullPointerException();
		    }
		    
		}catch(ClassNotFoundException | NullPointerException e){
			logger.error("We caught the exception we included",e);	
		}catch(Exception e){
			logger.error("There was another exception",e);
			
		}
		
		App.getLogger().info("We got access to logger from lab3.");
		
	}

}
