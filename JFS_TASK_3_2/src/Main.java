import model.Employee;
import model.Product;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee(101, "John Doe", 55000.0);
        Product product = new Product(1001, 25.50, 10);

        System.out.println(product);
    }
}