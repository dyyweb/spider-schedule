package tf56.spider.schedule.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author: dy
 * @date: 2017.2.16
 */
public class SpringContext {
    private static volatile ApplicationContext context = null;
    private static final String SPRING_FILE = "classpath:config/applicationContext*.xml";

    public static void init() {
        synchronized (SpringContext.class) {
            if (context == null) {
                context = new FileSystemXmlApplicationContext(SPRING_FILE);
            }
        }
    }

    public static Object getBean(String name) {
        if (context == null) {
            init();
        }
        return context.getBean(name);
    }
}