import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grades extends Student {
    public static void gradeAdd(Scanner sc2){//the method of adding a grade for a student
        List<Student> studentList = new ArrayList<>();//list for data from the student's txt file
        try {
            FileInputStream fis = new FileInputStream("src/Student.txt");//read file Student.txt
            Scanner sc = new Scanner(fis);
            sc2 = new Scanner(System.in);
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
                        b = Integer.parseInt(sc2.nextLine().trim());//the user enters the search index
                        while (sc.hasNext()) {
                            l = sc.nextLine().trim();
                            a = l.split(";");
                            index = Integer.parseInt(a[0].trim());
                            name = a[1].trim();
                            surname = a[2].trim();
                            group = a[3].trim();
                            if (index == b) {//checking if the data and search are equal
                                System.out.println("indeks: " + a[0] + "  imię: " + name + " nazwisko: " + surname + " grupa: " + group);
                                System.out.println("Podaj przedmiot: ");
                                sb = sc2.nextLine();//the user enters the subject name
                                System.out.println("Podaj ocenę: ");
                                grade = Integer.parseInt(sc2.nextLine());//the user enters the grade
                                try {//saving student grade to a file
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

        } catch (Exception e) {
            System.out.println("Error -> " + e);
        }
    }
    public static void studentGrade(Scanner sc2){//method to search grades for student
        List<Student> studentList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("src/StudentGrade.txt");//read file Student.txt
            Scanner sc = new Scanner(fis);
            sc2 = new Scanner(System.in);
            String l;
            String[] a;
            String name;
            String surname;
            String group;
            String sb;
            int b;
            int index, grade;
                System.out.println("Podaj numer indeksu: ");
                        b = Integer.parseInt(sc2.nextLine().trim());////the user enters the search index
                        while (sc.hasNext()) {
                            l = sc.nextLine().trim();
                            a = l.split(";");
                            index = Integer.parseInt(a[0].trim());
                            name = a[1].trim();
                            surname = a[2].trim();
                            group = a[3].trim();
                            sb = a[4].trim();
                            grade = Integer.parseInt(a[5].trim());

                            if (index == b) {//checking if the data and search are equal
                                System.out.println("indeks: " + a[0] + "  imię: " + name + " nazwisko: " + surname + " grupa: " + group + " przedmiot: " + sb + " ocena: " + grade);//the program prints out all grades for that index
                            }
                        }
            sc.close();

        } catch (Exception e) {
            System.out.println("Error -> " + e);
        }
    }
}
