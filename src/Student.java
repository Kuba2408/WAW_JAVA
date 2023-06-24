import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Student {
    private int index;
    private String name;
    private String surname;
    private String group;

    public static void StudentAdd(Scanner sc) {
         int index;
         String name;
         String surname;
         String group;

        while(true) {
            try {
                System.out.println("Podaj numer indeksu");
                index = Integer.parseInt(sc.nextLine().trim());
                break;
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        }
        while(true) {
            try {
                System.out.println("Podaj imię");
                name = sc.nextLine().trim();
                break;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        while(true) {
            try {
                System.out.println("Podaj nazwisko");
                surname = sc.nextLine().trim();
                break;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        while(true) {
            try {
                System.out.println("Podaj grupę");
                group = sc.nextLine().trim();
                break;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
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
