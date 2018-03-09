package idv.mission.example;

import org.apache.log4j.Logger;

public class RepeatlyTest {
	
	static Logger logger = Logger.getLogger(RepeatlyTest.class);
	
    public static void main(String[] args) {
    	for(int x = 0; x < 10; x++) {
    		logger.info("Info Test");
    		logger.debug("Debug Test");
    		try {
				Thread.sleep(500);
			}
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	System.out.println("Done");
    }
    
}
