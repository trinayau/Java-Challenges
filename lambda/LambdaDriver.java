package lambda;

import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaDriver {
    public static void main(String[] args) {
        Demo demo = (n) -> n * n;
        System.out.println(demo.fun(5));
        //Built in functional interfaces

        //Supplier
        Supplier<String> companyName = () -> "Ford";
        System.out.println(companyName.get());
        Supplier<Employee> empSupplier = () -> new Employee(1, "Ford", 15000.0);
        System.out.println(empSupplier.get());

        //Consumer
        Consumer<Double> doubleConsumer = (d) -> System.out.println(d);
        doubleConsumer.accept(4500.0);
        Consumer<Employee> employeeConsumer = (e) -> System.out.println(e);
        employeeConsumer.accept(new Employee(1, "Ford", 15000.0));

        //Function apply()
        Function<String, Integer> stringFunction = (str) -> str.length();
        System.out.println(stringFunction.apply("Ford"));

        //write a lambda square a number
        Function<Integer, Integer> sqr = (n) -> n * n;
        System.out.println(sqr.apply(5));
        Function<Employee, String> getEmployeeName = (e) -> e.getName(); //function takes employee and returns string
        System.out.println(getEmployeeName.apply(new Employee(2, "Oracle", 1302.0)));

        //Lambda Uppercase
        Function<String, String> getUpperCase = (s) -> s.toUpperCase();
        System.out.println(getUpperCase.apply("hello i am a turtle"));

        //Lambda lowercase
        Function<String, String> getLowerCase = (s) -> s.toLowerCase();
        System.out.println(getLowerCase.apply("HELO i am a turtle"));

        //Lambda function to hike all employees salary by 10%
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(5, "DD", 5000.0));
        empList.add(new Employee(1, "FF", 3000.0));
        empList.add(new Employee(7, "JJ", 1000.0));
        empList.add(new Employee(3, "EE", 2000.0));

        Function<List<Employee>, List<Employee>> hikeAllEmployeeSalary = (emps) -> {
            for(Employee emp: emps){
                emp.setSalary(emp.getSalary()*1.1);
            }
            return emps;
        };

        System.out.println(hikeAllEmployeeSalary.apply(empList));


    }
}