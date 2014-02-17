import com.practical_java.lesson6.Contractor;
import com.practical_java.lesson6.Employee;
import com.practical_java.lesson6.Person;

/**
 * Created with IntelliJ IDEA.
 * User: maksym.tashchuk
 * Date: 2/17/14
 * Time: 10:09 AM
 * To change this template use File | Settings | File Templates.
 */
public class TestPayIncrease {
    public static void main(String[] args) {
        Person workers[] = new Person[3];
        workers[0] = new Employee("Maxim");
        workers[1] = new Contractor("Nadya");
        workers[2] = new Employee("Andrey");
        Employee currentEmployee;
        Contractor currentContractor;

        for (Person person : workers) {
            if (person instanceof Employee) {
                currentEmployee = (Employee) person;
                currentEmployee.increasePay(30);
            } else if (person instanceof Contractor) {
                currentContractor = (Contractor) person;
                currentContractor.increasePay(25);
            }
        }
    }
}
