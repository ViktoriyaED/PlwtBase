package runner;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ProjectProperties {

    private static final String ENV_BROWSER_OPTIONS = "BROWSER_OPTIONS";

    public static Properties properties = init_properties();

    public static final String BROWSER_TYPE = properties.getProperty("browserType").trim();
    public static final String BASE_URL = properties.getProperty("baseURL");
    public static final boolean HEADLESS_MODE = Boolean.parseBoolean(properties.getProperty("headlessMode").trim());
    public static final double SLOW_MO_MODE = Double.parseDouble(properties.getProperty("slowMoMode").trim());
    public static final int SCREEN_SIZE_WIDTH = Integer.parseInt(properties.getProperty("screenSizeWidth").trim());
    public static final int SCREEN_SIZE_HEIGHT = Integer.parseInt(properties.getProperty("screenSizeHeight").trim());
    public static final boolean TRACING_MODE = Boolean.parseBoolean(properties.getProperty("tracingMode").trim());
    public static final boolean VIDEO_MODE = Boolean.parseBoolean(properties.getProperty("videoMode").trim());

    private static Properties init_properties() {
        if (properties == null) {
            properties = new Properties();
            if (isServerRun()) {
                if (System.getenv(ENV_BROWSER_OPTIONS) != null) {
                    for (String option : System.getenv(ENV_BROWSER_OPTIONS).split(";")) {
                        String[] browserOptionArr = option.split("=");
                        properties.setProperty(browserOptionArr[0], browserOptionArr[1]);
                    }
                }
            } else {
                try {
                    FileInputStream fileInputStream = new FileInputStream("./src/test/resources/config/config.properties");
                    properties.load(fileInputStream);
                } catch (IOException ignore) {
                    System.out.println("ERROR: The \u001B[31mconfig.properties\u001B[0m file not found.");
                    System.out.println("You need to create it from config.properties.TEMPLATE file.");
                    System.exit(1);
                }
            }
        }
        return properties;
    }

    static boolean isServerRun() {
        return System.getenv("CI_RUN") != null;
    }
}
