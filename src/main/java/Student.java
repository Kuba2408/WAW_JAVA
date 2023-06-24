import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Student {
    private int index; //student index
    private String name; //student name
    private String surname; //student surname
    private String group; //student group

    public static void StudentAdd(Scanner sc) {
         int index; //var student index in method
         String name; //var student name in method
         String surname; //var student surname in method
         String group; //var student group in method
        //a loop that runs until the input index is correct
        while(true) {
            try {
                System.out.println("Podaj numer indeksu");
                index = Integer.parseInt(sc.nextLine().trim());
                break;
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        }
        //a loop that runs until the input name is correct
        while(true) {
            try {
                System.out.println("Podaj imię");
                name = sc.nextLine().trim();
                break;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        //a loop that runs until the input surname is correct
        while(true) {
            try {
                System.out.println("Podaj nazwisko");
                surname = sc.nextLine().trim();
                break;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        //a loop that runs until the input student group is correct
        while(true) {
            try {
                System.out.println("Podaj grupę");
                group = sc.nextLine().trim();
                break;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        //saving student data to a file
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/Student.txt", true));
            writer.append(index + ";" + name + ";" + surname + ";" + group + "\n");
            System.out.println("Zapisano Studenta");
            writer.close();
        } catch (Exception e){
            System.out.println(e);
        }

    }


}
