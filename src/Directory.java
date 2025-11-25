import java.io.File;

public class Directory {

    public boolean isValidDirectory(String path) {
        File file = new File(path);
        return file.exists() && file.isDirectory();
    }

    public int countJavaFiles(File directory) {
        int count = 0;
        File[] files = directory.listFiles();

        if (files == null) return 0;

        for (File f : files)  {
            if (f.isFile() && f.getName().endsWith(".java")){
                count ++;
            }
        }
        return count;
    }

    public int countSolvedIssues(File directory) {
        int issues = 0;
        File[] files = directory.listFiles();

        if (files == null) return 0;

        for (File f : files) {
            if (f.isFile() && f.getName().toLowerCase().contains("solved")){
                issues++;
            }
        }
        return issues;
    }
}
