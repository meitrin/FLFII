package Tank;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;

public class MixingPlantFactory {
    @SuppressWarnings("unchecked")
    public static Object build() {
        Object componentPort = null;

        try {
            URL[] urls = {new File(Configuration.instance.pathToJavaArchive + "mixingPlant.jar").toURI().toURL()};
            URLClassLoader urlClassLoader = new URLClassLoader(urls, MixingPlantFactory.class.getClassLoader());
            Class mixingPlantClass = Class.forName("MixingPlant",true,urlClassLoader);
            Object instance = mixingPlantClass.getMethod("getInstance").invoke(null);
            componentPort = mixingPlantClass.getDeclaredField("port").get(instance);
        }catch (Exception e){e.printStackTrace();}

        return componentPort;
    }
}
