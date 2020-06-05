package selenium.uj.project.utils;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CustomFile {

    public Path getResourceFilePath(String fileName) {
        try {
            return Paths.get(
                    new File(getClass()
                            .getClassLoader()
                            .getResource(fileName)
                            .getFile())
                            .getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getResourceFilePathString(String fileName) {
        try {
            return Paths.get(
                    new File(getClass()
                            .getClassLoader()
                            .getResource(fileName)
                            .getFile())
                            .getAbsolutePath()).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getProjectPath () {
        return  System.getProperty("user.dir");
    }
}