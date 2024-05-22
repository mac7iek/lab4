
public class Student {

  private String Name;
  private String Surname;
  private int Age;
  private int DayOfBirth;
  private int MonthOfBirth;
  private int YearOfBirth;

  public Student(String name, String surname, int age, int dayOfBirth, int monthOfBirth, int yearOfBirth) {
    Name = name;
    Surname = surname;
    Age = age;
    DayOfBirth = dayOfBirth;
    MonthOfBirth = monthOfBirth;
    YearOfBirth = yearOfBirth;
  }

  public String GetName() {
    return Name;
  }

  public String GetSurname() {
    return Surname;
  }

  public int GetAge() {
    return Age;
  }

  public int GetDayOfBirth() {
    return DayOfBirth;
  }

  public int GetMonthOfBirth() {
    return MonthOfBirth;
  }

  public int GetYearOfBirth() {
    return YearOfBirth;
  }

  public String ToString() {
    return Name + " " + Surname + " " + Age + " " + DayOfBirth + " " + MonthOfBirth + " " + YearOfBirth;
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if (data.length != 6)
      return new Student("Parse Error", "Parse Error", -1, -1, -1, -1);
    return new Student(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]));
  }
}