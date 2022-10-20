package Collections;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class CollectionDriver {
    public static void main(String[] args){
        //features of list:
        //1. in order
        //2. not sorted
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

    }
}
