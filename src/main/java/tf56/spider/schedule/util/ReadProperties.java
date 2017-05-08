package tf56.spider.schedule.util;

import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

/**
 * @author: dy
 * @date: 2017.2.16
 */
public class ReadProperties {

    private static Properties properties;

    public static Properties loadProp(String path)
    {
        synchronized (ReadProperties.class) {
            if(properties == null)
            {
                properties = new Properties();
                String paths[] = path.split("\\;");
                if(paths.length > 0)
                {
                    for(String s : paths)
                    {
                        try {
                            properties.putAll(PropertiesLoaderUtils.loadAllProperties(s));
                        } catch (IOException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        return properties;
    }
}
