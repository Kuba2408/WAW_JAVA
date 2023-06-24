import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grades extends Student {
    public static void gradeAdd(){
        List<Student> studentList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("src/Student.txt");
            Scanner sc = new Scanner(fis);
            Scanner sc2 = new Scanner(System.in);
            String l;
            String[] a;
            String name;
            String surname;
            String group;
            int b;
            int grade;
            String sb;
            int index;
                System.out.println("Wpisz numer indeksu: ");
                        b = Integer.parseInt(sc2.nextLine().trim());
                        while (sc.hasNext()) {
                            l = sc.nextLine().trim();
                            a = l.split(";");
                            index = Integer.parseInt(a[0].trim());
                            name = a[1].trim();
                            surname = a[2].trim();
                            group = a[3].trim();
                            if (index == b) {
                                System.out.println("indeks: " + a[0] + "  imię: " + name + " nazwisko: " + surname + " grupa: " + group);
                                System.out.println("Podaj przedmiot: ");
                                sb = sc2.nextLine();
                                System.out.println("Podaj ocenę: ");
                                grade = Integer.parseInt(sc2.nextLine());
                                try {
                                    BufferedWriter writer = new BufferedWriter(new FileWriter("src/StudentGrade.txt", true));
                                    writer.append(index + ";" + name + ";" + surname + ";" + group + ";" + sb + ";" + grade +"\n");
                                    System.out.println("Zapisano ocenę");
                                    writer.close();
                                } catch (Exception e){
                                    System.out.println(e);
                                }
                            }
                        }

            sc.close();
            sc2.close();

        } catch (Exception e) {
            System.out.println("Error -> " + e);
        }
    }
    public static void studentGrade(){
        List<Student> studentList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("src/StudentGrade.txt");
            Scanner sc = new Scanner(fis);
            Scanner sc2 = new Scanner(System.in);
            String l;
            String[] a;
            String name;
            String surname;
            String group;
            String sb;
            int b;
            int index, grade;
                System.out.println("Podaj numer indeksu: ");
                        b = Integer.parseInt(sc2.nextLine().trim());
                        while (sc.hasNext()) {
                            l = sc.nextLine().trim();
                            a = l.split(";");
                            index = Integer.parseInt(a[0].trim());
                            name = a[1].trim();
                            surname = a[2].trim();
                            group = a[3].trim();
                            sb = a[4].trim();
                            grade = Integer.parseInt(a[5].trim());

                            if (index == b) {
                                System.out.println("indeks: " + a[0] + "  imię: " + name + " nazwisko: " + surname + " grupa: " + group + " przedmiot: " + sb + " ocena: " + grade);
                            }
                        }
            sc.close();
            sc2.close();

        } catch (Exception e) {
            System.out.println("Error -> " + e);
        }
    }
}
