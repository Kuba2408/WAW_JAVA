import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        int cs;
        while (loop) {
            System.out.println("1. dodaj studenta\n2. wyświetl listę studentów\n3. wyszukaj studenta\n4. zakończ");
            if (scanner.hasNextLine()) {
                try {
                    cs = -1;
                    cs = Integer.parseInt(scanner.nextLine().trim());

                    switch (cs) {
                        case 1:
                            Student.StudentAdd();
                            break;
                        case 2:
                            StudentList.StudentsImport();
                            break;
                        case 3:
                            StudentList.StudentSearch();
                            break;
                        case 4:
                            loop = false;
                            break;
                        default:
                            System.out.println("Invalid input. Please enter a valid option.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid option.");
                } catch (Exception e) {
                    System.out.println(e);
                }
            } else {
                System.out.println("No input found. Exiting the program.");
                break;
            }
        }
    }
}