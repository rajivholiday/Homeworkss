import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTraining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println(" Hello, welcome to app!");
            System.out.println("""
                    1. Create a file
                    2. Write to a file
                    3. Read from file 
                    4. Delete a file""");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    try {
                        System.out.println("Write file name:");
                        String fileName = scanner.next();
                        fileName.toUpperCase();
                        File obj = new File(fileName);
                        if (obj.createNewFile()) {
                            System.out.println("File " + fileName + " was created!");
                        } else {
                            System.out.println("File " + fileName + " was not created!");
                        }

                    } catch (IOException e) {
                        e.getMessage();
                    }
                    break;

                case 2:
                    try {
                        System.out.println("Input a name of file:");
                        String fileName = scanner.next();
                        File obj = new File(fileName.toUpperCase());
                        FileWriter writer = new FileWriter(fileName);
                        if (obj.exists()) {
                            System.out.println("File exists.");
                            System.out.println("Input a message:");
                            String input = scanner.nextLine();
                            writer.write(input);
                            System.out.println("Message was written in file!");
                        } else {
                            System.out.println("File does not exist.");
                        }
                        writer.close();
                    } catch (IOException e) {
                        e.getMessage();
                    }
                    break;

                case 3:
                    try {
                        System.out.println("Input a name of file:");
                        String fileName = scanner.next();
                        File obj2 = new File(fileName.toUpperCase());
                        if (obj2.exists()) {
                            System.out.println("File exists.");
                            Scanner myScanner = new Scanner(obj2);
                            String data = "";
                            while (myScanner.hasNextLine()) {
                                data = scanner.nextLine();
                            }
                            myScanner.close();
                            System.out.println("Your message: " + data);
                        } else {
                            System.out.println("File does not exist.");
                        }

                    } catch (FileNotFoundException e) {

                        e.getMessage();
                    }
                    break;

                case 4:
                    System.out.println("Write file name:");
                    String fileName = scanner.next();
                    File obj3 = new File(fileName.toUpperCase());
                    if (obj3.delete()) {
                        System.out.println("File " + fileName + " was deleted!");
                    } else {
                        System.out.println("File " + fileName + " was not deleted!");
                    }
                    break;
            }
        }
    }
}