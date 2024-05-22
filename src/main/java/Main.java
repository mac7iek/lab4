import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

      while (true) {
        System.out.println("Wybierz opcję:");
        System.out.println("1. Dodaj nowego studenta");
        System.out.println("2. Wyświetl wszystkich studentów");
        System.out.println("0. Wyjdź");

        int choice = Integer.parseInt(reader.readLine());

        switch (choice) {
          case 1:
            System.out.println("Podaj imię studenta:");
            String name = reader.readLine();
            if (!Student.validateName(name)) {
              System.out.println("Niepoprawne imię.");
              break;
            }
            System.out.println("Podaj nazwisko studenta:");
            String surname = reader.readLine();
            if (!Student.validateSurname(surname)) {
              System.out.println("Niepoprawne nazwisko.");
              break;
            }
            System.out.println("Podaj wiek studenta:");
            int age = Integer.parseInt(reader.readLine());
            if (!Student.validateAge(age)) {
              System.out.println("Niepoprawny wiek.");
              break;
            }
            System.out.println("Podaj dzień urodzenia studenta:");
            int dayOfBirth = Integer.parseInt(reader.readLine());
            System.out.println("Podaj miesiąc urodzenia studenta:");
            int monthOfBirth = Integer.parseInt(reader.readLine());
            System.out.println("Podaj rok urodzenia studenta:");
            int yearOfBirth = Integer.parseInt(reader.readLine());
            if (!Student.validateDateOfBirth(dayOfBirth, monthOfBirth, yearOfBirth)) {
              System.out.println("Niepoprawna data urodzenia.");
              break;
            }
            s.addStudent(new Student(name, surname, age, dayOfBirth, monthOfBirth, yearOfBirth));
            System.out.println("Nowy student został dodany do bazy danych.");
            break;
          case 2:
            System.out.println("Lista wszystkich studentów:");
            var students = s.getStudents();
            for (Student student : students) {
              System.out.println(student.ToString());
            }
            break;
          case 0:
            System.out.println("Koniec programu.");
            return;
          default:
            System.out.println("Niepoprawny wybór. Wybierz ponownie.");
            break;
        }
      }
    } catch (IOException e) {
      System.out.println("I/O ERROR: " + e.getMessage());
    } catch (NumberFormatException e) {
      System.out.println("INVALID TYPE ERROR");
    }
  }
}