import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        int cs;
        while (loop) {
            System.out.println("1. dodaj studenta\n2. wyświetl listę studentów\n3. wyszukaj studenta\n4. dodaj ocenę\n5. wyszukaj oceny studenta\n6. zakończ");
                try {
                    cs = -1;
                    cs = Integer.parseInt(scanner.nextLine().trim());

                    switch (cs) {
                        case 1:
                            Student.StudentAdd(scanner);
                            break;
                        case 2:
                            StudentList.StudentsImport();
                            break;
                        case 3:
                            StudentList.StudentSearch(scanner);
                            break;
                        case 4:
                            Grades.gradeAdd(scanner);
                            break;
                        case 5:
                            Grades.studentGrade(scanner);
                            break;
                        case 6:
                            loop = false;
                            break;
                        default:
                            System.out.println("Nieprawidłowa opcja, podaj inną wartość");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid option.");
                } catch (Exception e) {
                    System.out.println(e);
                }
        }
        scanner.close();
    }
}