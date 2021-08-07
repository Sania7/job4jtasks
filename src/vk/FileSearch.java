package vk;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
// поиск файлов на диске
public class FileSearch {
    public static void main(String[] args) {
        ArrayList<File> fileArrayList = new ArrayList<>();
        searchFile(new File("Macintosh HD"), fileArrayList);
        for (File file : fileArrayList) {
            System.out.println(file.getAbsolutePath());
        }
    }


    private static void searchFile(File rootFile, List<File> fileList) {
        if (rootFile.isDirectory()) {
            System.out.println("searching at: " + rootFile.getAbsolutePath());
            File[] directoryFile = rootFile.listFiles();
            if (directoryFile != null) {
                for (File file : directoryFile) {
                    if (file.isDirectory()) {
                        searchFile(file, fileList);
                    } else {
                        if (file.getName().toLowerCase().endsWith(".jpg")) ;
                        fileList.add(file);
                    }
                }
            }
        }
    }
}