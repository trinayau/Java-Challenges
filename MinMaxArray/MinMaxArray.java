package MinMaxArray;
import java.util.*;

public class MinMaxArray {
    public static void minMax(ArrayList<Integer> array){
        int min, max;
        Collections.sort(array);
        min = array.get(0);
        max = array.get(array.size()-1);
        System.out.println("Min: " + min + " Max: " + max);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        minMax(list);
    }
}
