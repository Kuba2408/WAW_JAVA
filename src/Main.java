import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boolean loop = true;
        Scanner sc = new Scanner(System.in);
        while (loop){
            System.out.println("1. dodaj studenta\n2. wyświetl listę studentów\n3. wyszukaj studenta\n4. zakończ");
            int cs = Integer.parseInt(sc.nextLine().trim());
            try {
                switch(cs){
                    case 1:
                        Student student = new Student();
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
                }
            } catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
