package tf56.spider.schedule;

import ch.qos.logback.ext.spring.LogbackConfigurer;
import org.slf4j.LoggerFactory;
import tf56.spider.schedule.util.SpringContext;

public class App {
    private static final org.slf4j.Logger log = LoggerFactory.getLogger(App.class);

    static {
        try {
            LogbackConfigurer.initLogging("classpath:config/logback.xml");
        } catch (Exception e) {
            log.error("accountSchedule 任务启动异常!", e);
        }
    }

    public static void main(String[] args) {
        SpringContext.init();
        log.info("<== *********** accountSchedule 任务启动成功 ***********");
    }
}
