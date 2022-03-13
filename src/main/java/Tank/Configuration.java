package Tank;

public enum Configuration {
    instance;

    public final String fileSeperator = System.getProperty("file.separator");
    public final String userDirectory = System.getProperty("user.dir");
    public final String pathToJavaArchive = userDirectory + fileSeperator + "mixingPlant" + fileSeperator + "jar" + fileSeperator;
}
