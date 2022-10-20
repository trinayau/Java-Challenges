package Collections;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDriver {
    public static void main(String[] args){
        //features of list:
        //1. in order
        //2. not sorted

        //CRUD operations on List:

        List<Integer> intList = new ArrayList<>();
        intList.add(2);
        intList.add(14);
        intList.add(11);
        intList.add(-11);

        System.out.println(intList);
        System.out.println(intList.size());
        System.out.println("element at index 3:"+intList.get(3));
        System.out.println("index of element 14: "+intList.indexOf(14));

        for(int i = 0; i < intList.size(); i++){
            System.out.println(intList.get(i));
        }

        for(Integer data:intList){
            System.out.println(data);
        }

        //Update
        intList.add(1, 7);
        System.out.println(intList);
        System.out.println("replace 14 at index 2" + intList.set(2, 15));
        System.out.println(intList);

        //Delete
        System.out.println("Delete element at index 4"+ intList.remove(4));
        System.out.println(intList);
        Integer delData = 15;
        System.out.println("Remove element 15 "+ intList.remove(delData)); //if can't be found, will return false
        System.out.println(intList);
        intList.clear();
        System.out.println("clear"+intList);
        System.out.println("is empty:" + intList.isEmpty());

        //concat of list
        List<Integer> intList2 = new ArrayList<>();
        intList2.add(1);
        intList2.add(2);
        intList2.add(3);
        intList.addAll(intList2);
        System.out.println("list 1 = 1 list 1 + list 2:" + intList);
        intList.addAll(1, intList2);
        System.out.println("list1="+intList);
        System.out.println("l1 contains 5:" + intList.contains(5));
        System.out.println("L1 contains all 12:"+ intList.containsAll(intList2));

        System.out.println("L1 hash code: " + intList.hashCode());
        System.out.println("L2 hash code: " + intList2.hashCode());
        List<Integer> tempList = intList;
        System.out.println("templist hash code:" + tempList.hashCode());

        System.out.println("remove all L1 from L2" + intList2.removeAll(intList));
        System.out.println(("L2: " + intList2));

        //retain all
        intList2.add(2);
        System.out.println("list1:" + intList );
        System.out.println("list 2: " + intList2);
        System.out.println("remove all L1 from L2" + intList.retainAll(intList2));

        //sort
        Collections.sort(intList2);
        System.out.println("after sort: " + intList2);

        List<String> stringList = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();

        //List of user defined data
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "n1", 100.0));
        employeeList.add(new Employee(5, "n5", 500.0));
        System.out.println(employeeList);
        System.out.println("employee at index 1: " + employeeList.get(1));
        employeeList.add(1, new Employee(3, "n3", 300.0));
        System.out.println(employeeList);
        employeeList.set(0, new Employee(11, "n11", 1100.0));
        System.out.println(employeeList);

        //update id 3 name = "new name"
        for(Employee emp:employeeList){
            if(emp.getId()==3){
                emp.setName("New name");
                break;
            }
        }

        System.out.println(employeeList);
        employeeList.remove(1);
        System.out.println(employeeList.toString());

        Employee findEmp = new Employee(11, "n11", 1100.0);
        System.out.println("emp id found: " + employeeList.indexOf(findEmp));
        employeeList.remove(findEmp);
        System.out.println("emp id not found: " + employeeList.indexOf(findEmp));
    }
}
