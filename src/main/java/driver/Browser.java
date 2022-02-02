package driver;

public class Browser {

    protected static String name;
    protected String version;
    protected String platform;

    public static String getName() {
        return name;
    }

    protected void setName(String name) {
        Browser.name = name;
    }

    protected String getVersion() {
        return version;
    }

    protected void setVersion(String version) {
        this.version = version;
    }

    protected String getPlatform() {
        return platform;
    }

    protected void setPlatform(String platform) {
        this.platform = platform;
    }


}
