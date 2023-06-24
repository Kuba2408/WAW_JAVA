import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentList {
    public static List<Student> StudentsImport() {
        List<Student> studentList = new ArrayList<>();
        try {

            FileInputStream fis = new FileInputStream("src/Student.txt");
            Scanner sc = new Scanner(fis);
            String l;
            String[] a;
            String name;
            String surname;
            String group;
            int index;
            while (sc.hasNext()) {
                l = sc.nextLine().trim();
                a = l.split(";");
                index = Integer.parseInt(a[0].trim());
                name = a[1].trim();
                surname = a[2].trim();
                group = a[3].trim();
                System.out.println("indeks: " + a[0] + "  imię: " + name + " nazwisko: " + surname + " grupa: " + group);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found -> " + e);
        }
        return studentList;
    }

    public static void StudentSearch(Scanner sc2) {
        List<Student> studentList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("src/Student.txt");
            Scanner sc = new Scanner(fis);
            sc2 = new Scanner(System.in);
            String l;
            String[] a;
            String name;
            String surname;
            String group;
            int b;
            String c;
            int index;
            boolean loop = true;
            do {
                System.out.println("1. wyszukiwanie po indeksie\n2. wyszukiwanie po imieniu\n3. wyszukiwanie po nazwisku\n4. wyszukiwanie po grupie");
                switch (sc2.nextLine()) {
                    case "1":
                        System.out.println("Podaj szukane: ");
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
                            }
                        }
                        loop = false;
                        break;
                    case "2":
                        System.out.println("Podaj szukane: ");
                        c = sc2.nextLine().trim();
                        while (sc.hasNext()) {
                            l = sc.nextLine().trim();
                            a = l.split(";");
                            index = Integer.parseInt(a[0].trim());
                            name = a[1].trim();
                            surname = a[2].trim();
                            group = a[3].trim();
                            if (name.equalsIgnoreCase(c)) {
                                System.out.println("indeks: " + a[0] + "  imię: " + name + " nazwisko: " + surname + " grupa: " + group);
                            }
                        }
                        loop = false;
                        break;

                    case "3":
                        System.out.println("Podaj szukane: ");
                        c = sc2.nextLine().trim();
                        while (sc.hasNext()) {
                            l = sc.nextLine().trim();
                            a = l.split(";");
                            index = Integer.parseInt(a[0].trim());
                            name = a[1].trim();
                            surname = a[2].trim();
                            group = a[3].trim();
                            if (surname.equalsIgnoreCase(c)) {
                                System.out.println("indeks: " + a[0] + "  imię: " + name + " nazwisko: " + surname + " grupa: " + group);
                            }
                        }
                        loop = false;
                        break;

                    case "4":
                        System.out.println("Podaj szukane: ");
                        c = sc2.nextLine().trim();
                        while (sc.hasNext()) {
                            l = sc.nextLine().trim();
                            a = l.split(";");
                            index = Integer.parseInt(a[0].trim());
                            name = a[1].trim();
                            surname = a[2].trim();
                            group = a[3].trim();
                            if (group.equalsIgnoreCase(c)) {
                                System.out.println("indeks: " + a[0] + "  imię: " + name + " nazwisko: " + surname + " grupa: " + group);
                            }
                        }
                        loop = false;
                        break;

                    default:
                        continue;
                }

            } while (loop);
            sc.close();

        } catch (Exception e) {
            System.out.println("Error -> " + e);
        }
    }
}
