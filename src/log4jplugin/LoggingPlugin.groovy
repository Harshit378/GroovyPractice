package log4jplugin

import org.apache.log4j.Logger
import org.apache.log4j.Level;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.FileAppender;

/**
 * Created by Harshit_Tiwari on 5/12/2017.
 */
class LoggingPlugin {

    static Logger log = Logger.getLogger(LoggingPlugin.getName())

    static def initLogger(){
        // setting up a FileAppender dynamically...
        SimpleLayout layout = new SimpleLayout();
        FileAppender appender = new FileAppender(layout,"your filename",false);
        log.addAppender(appender);

        log.setLevel((Level) Level.DEBUG);

        log.debug("Here is some DEBUG");
        log.info("Here is some INFO");
        log.warn("Here is some WARN");
        log.error("Here is some ERROR");
        log.fatal("Here is some FATAL");
    }


}
