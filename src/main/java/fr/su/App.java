package fr.su;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 * documentation dans : https://koor.fr/Java/Tutorial/java_logging_log4j2.wp
 */
public class App 
{
	private static final Logger LOGGER = LogManager.getLogger(App.class );
    public static void main( String[] args )
    {	
		LOGGER.error("début du truc...");
        LOGGER.info("début de l'info...");
        System.out.println( "Hello World!" );
    }
}
