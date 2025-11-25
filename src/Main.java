import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        Directory directory = new Directory();

        System.out.println("Enter the directory path: ");
        String path = scanner.nextLine();

//        Create file object
        File dir = new File(path);

        if (!directory.isValidDirectory(path)) {
            System.out.println("Invalid directory");
            return;
        }


        int javaFiles = directory.countJavaFiles(dir);
        int solvedIssues = directory.countSolvedIssues(dir);

        System.out.println("Solved Issues: " + solvedIssues);
        System.out.println("Java Files: " + javaFiles);
    }
}