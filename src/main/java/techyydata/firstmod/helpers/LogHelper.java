package techyydata.firstmod.helpers;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import techyydata.firstmod.Reference;

/**
 * Created by fabbe on 22/12/2017 - 3:35 AM.
 */
public class LogHelper {
    private static void log(Level level, Object object) {
        getLogger().log(level, "[" + Reference.MOD_ID + "]: " + object);
    }

    private static Logger logger;
    private static Logger getLogger() {
        return logger;
    }

    public static void setLogger(Logger logger) {
        LogHelper.logger = logger;
    }

    public static void all(Object object) {log(Level.ALL, object);}
    public static void debug(Object object) {log(Level.DEBUG, object);}
    public static void error(Object object) {log(Level.ERROR, object);}
    public static void fatal(Object object) {log(Level.FATAL, object);}
    public static void info(Object object) {{log(Level.INFO, object);}}
    public static void off(Object object) {log(Level.OFF, object);}
    public static void trace(Object object) {log(Level.TRACE, object);}
    public static void warn(Object object) {log(Level.WARN, object);}
}
