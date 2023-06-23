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

    public Student() {
        Scanner sc = new Scanner(System.in);

        while(true) {
            try {
                System.out.println("Podaj numer indeksu");
                this.index = Integer.parseInt(sc.nextLine().trim());
                break;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        while(true) {
            try {
                System.out.println("Podaj imię");
                this.name = sc.nextLine().trim();
                break;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        while(true) {
            try {
                System.out.println("Podaj nazwisko");
                this.surname = sc.nextLine().trim();
                break;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        while(true) {
            try {
                System.out.println("Podaj grupę");
                this.group = sc.nextLine().trim();
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
        sc.close();
    }


}
