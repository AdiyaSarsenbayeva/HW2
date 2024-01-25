import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Employee("Damon", "Salvadore", 92965.55));
        people.add(new Employee("Stefan", "Salvadore", 79878.89));
        people.add(new Employee("Nicklaus", "Mikaelson", 89093.33));
        people.add(new Student("Elena", "Gilbert", 3.5));
        people.add(new Student("Caroline", "Forbes", 2.5));

        Collections.sort(people);

        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}
