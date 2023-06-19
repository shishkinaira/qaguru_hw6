package guru.qa;
import static java.lang.System.out;

public class Person {
    private String name;
    private String patronymic;
    private String surname;
    int age;

    public Person (String name, String patronymic, String surname, int age) {
            System.out.println("Person is: "
                    + name + " "
                    + patronymic + " "
                    + surname + ". Age is "
                    + age);

    }
}
