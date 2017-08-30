import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Administrator on 2017/8/29.
 */
public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.debug("debug");
        logger.error("error");
        logger.info("info");
        logger.warn("warn");
        logger.trace("trace");
    }
}
