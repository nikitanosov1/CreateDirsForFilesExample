import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File directory = new File("Папка1/Папка2/Папка3");
        File file1 = new File("Папка1/Папка2/Папка3/A1.txt");
        File file2 = new File("Папка1/Папка2/Папка3/B2.txt");
        File file3 = new File("Папка1/Папка2/Папка3/A3.txt");

        try {
            directory.mkdirs();
            file1.createNewFile();
            file2.createNewFile();
            file3.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File[] files = directory.listFiles(((dir, name) -> name.startsWith("A")));
        for (File f : files){
            System.out.println(f.getAbsolutePath());
        }

        /*
        File directory = new File("f1/f2/f3");
        File file = new File("f1/f2/f3/file1.txt");
        File file2 = new File("f1/f2/f3/file2.txt");
        try {
            //directory.mkdir();  // создаёт ТОЛЬКО одну папку
            directory.mkdirs(); // создаёт целую иерархию папок
            file.createNewFile();
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file.getName());
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());

        File[] files = directory.listFiles((dir, name) -> name.contains("1"));
        for (File f : files){
            System.out.println(f.getName());
        }

        */
    }
}
