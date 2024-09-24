package Structural;

import java.util.ArrayList;
import java.util.List;

interface FileComponent {
    public void printDetails();
}

class File implements FileComponent {
    private final String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void printDetails() {
        System.out.println("The File name is: " + this.name);
    }
}

class Folder implements FileComponent {
    private final String name;
    private final List<FileComponent> files = new ArrayList<>();
    public Folder(String name) {
        this.name = name;
    }
    public void addFile(FileComponent file) {
        this.files.add(file);
    }
    public void removeFile() {
        if(this.files.size() == 0) return;
        this.files.remove(this.files.size()-1);
    }
    @Override
    public void printDetails() {
        System.out.println("The Folder name is: " + this.name);
        System.out.println("The Files inside this folder are as follows:");
        for (FileComponent file: files) {
            System.out.print("| ");
            file.printDetails();
        }
    }
}

public class Composite {
    public static void main(String[] args) {
        Folder folder1 = new Folder("Parent 1");
        FileComponent file1 = new File("File 1");
        FileComponent file2 = new File("File 2");

        folder1.addFile(file1);
        folder1.addFile(file2);

        Folder folder2 = new Folder("Parent 2");
        FileComponent file3 = new File("File 3");
        FileComponent file4 = new File("File 4");

        folder2.addFile(file3);
        folder2.addFile(file4);

        folder1.addFile(folder2);

        folder1.printDetails();
    }
}
