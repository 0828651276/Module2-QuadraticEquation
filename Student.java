import java.time.LocalDate;

public class Student {
    String name;
    LocalDate date;
    String email;

    public Student(String name, String email, LocalDate date) {
        this.name = name;
        this.email = email;
        this.date = date;
    }

    public void action(String subject) {
        System.out.println(subject);
    }

    public void showStudent() {
        System.out.println("Name: " + name);
        System.out.println("Date: " + date);
        System.out.println("Email: " + email);
    }
}