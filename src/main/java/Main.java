import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();
      Scanner scanner = new Scanner(System.in);

      boolean running = true;
      while (running) {
        System.out.println("Wybierz opcję:");
        System.out.println("1. Dodaj nowego studenta");
        System.out.println("2. Wyświetl listę studentów");
        System.out.println("3. Wyjdź");

        int option = Integer.parseInt(scanner.nextLine());

        switch (option) {
          case 1:

            System.out.println("Dodawanie nowego studenta:");
            System.out.println("Podaj imię studenta:");
            String name = scanner.nextLine();
            System.out.println("Podaj wiek studenta:");
            int age = Integer.parseInt(scanner.nextLine());
            s.addStudent(new Student(name, age));
            break;
          case 2:

            System.out.println("Lista studentów:");
            var students = s.getStudents();
            for(Student current : students) {
              System.out.println(current.ToString());
            }
            break;
          case 3:
     
            System.out.println("Zakończono program.");
            running = false;
            break;
          default:
            System.out.println("Niepoprawna opcja. Spróbuj ponownie.");
        }
      }

      scanner.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}