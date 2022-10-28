package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDriver {
    public static void main(String[] args) {
        //Map
        List<String> nameList = new ArrayList<>();
        nameList.add("Moulika");
        nameList.add("Chandana");
        nameList.add("Abnaya");
        nameList.add("Iswarya");
        nameList.add("Kamal");
        //convert all names to uppercase
        nameList.stream().map((n) -> n.toUpperCase()).forEach((n) -> System.out.println(n)); //returns stream of string values
        System.out.println("emp data source:" + nameList);

        //find length of names
        nameList.stream().map((n) -> n.length()).forEach((n)-> System.out.println(n));
        List<Integer> lengthList = nameList.stream().map((n) -> n.length()).collect(Collectors.toList());
        System.out.println(lengthList);

        //Filter
        //get numbers <= 8
        lengthList.stream().filter((n) -> n <= 7).forEach((n) -> System.out.println(n));

        //get names with len >= 7
        nameList.stream().filter((n) -> n.length() <7).forEach((n) -> System.out.println(n));

        //reduce
//        nameList.stream().map((n) -> n.length()).reduce();

        //Sorted
        nameList.stream().sorted().forEach((n) -> System.out.println(n));

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(5, "DD", 5000.0));
        empList.add(new Employee(1, "FF", 3000.0));
        empList.add(new Employee(7, "JJ", 1000.0));
        empList.add(new Employee(3, "EE", 2000.0));
        System.out.println("emp data source:" + empList);

        //increase emp by 10%
        List<Employee> salaryHikedEmployees = empList.stream().map((e)->{
            e.setSalary(e.getSalary()*1.1);
            return e;
        }).collect(Collectors.toList());
        System.out.println("Salary hiked emps:" + salaryHikedEmployees);
        System.out.println("emp data source:" + empList);

        //find sum of all salaries?
        Optional<Double> optSalarySum = empList.stream().map((e) -> e.getSalary()).reduce((s1, s2) -> s1+s2);
        if(optSalarySum.isPresent()) System.out.println("Total sal=" + optSalarySum.get());
        //sort emp by name
//        empList.stream().sorted.forEach((e) -> e1.getSalary().compareTo(e2.getSalary())).forEach((e)-> System.out.println(e));

    }
}
