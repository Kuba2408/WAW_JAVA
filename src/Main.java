import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boolean loop = true; //var for loop
        Scanner scanner = new Scanner(System.in);
        int cs; // var for swich
        //the program in a loop, after the operation is completed, it returns to the menu
        while (loop) {
            System.out.println("1. dodaj studenta\n2. wyświetl listę studentów\n3. wyszukaj studenta\n4. dodaj ocenę\n5. wyszukaj oceny studenta\n6. zakończ");
                try {
                    cs = Integer.parseInt(scanner.nextLine().trim()); //select in program menu

                    switch (cs) {
                        case 1:
                            Student.StudentAdd(scanner);//method to add new student to list
                            break;
                        case 2:
                            StudentList.StudentsImport();//method to show list of students
                            break;
                        case 3:
                            StudentList.StudentSearch(scanner);//method to search students in list
                            break;
                        case 4:
                            Grades.gradeAdd(scanner);//method to add a grade for a student
                            break;
                        case 5:
                            Grades.studentGrade(scanner);//method to search grades for student
                            break;
                        case 6:
                            loop = false;//end of the program
                            break;
                        default:
                            System.out.println("Nieprawidłowa opcja, podaj inną wartość");//if select is different than available, it prints a message and starts a new loop
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