package idv.mission.example;

import org.apache.log4j.Logger;

public class Test {
	
//	static Logger logger = Logger.getLogger(Test.class.getName());
	static Logger example1 = Logger.getLogger("idv.mission.example1");
	static Logger example2 = Logger.getLogger("idv.mission.example2");
	
    public static void main(String[] args) {
//    	logger.info("Logger Info Test");
//    	logger.debug("Logger Debug Test");
    	example1.info("example1 Info Test");
    	example1.debug("example1 Debug Test");
    	example2.info("example2 Info Test");
    	example2.debug("example2 Debug Test");
    }
}
