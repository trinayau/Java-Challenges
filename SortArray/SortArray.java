package SortArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.*;

/* Sort array in ascending/descending order*/
public class SortArray {
    public static void sortArrayAsc(int[] arr){
        Arrays.sort(arr);
        System.out.println("Ascending: " + Arrays.toString(arr));
    }
    public static void sortArrayDesc(int[] arr){
        ArrayList<Integer> intArr = new ArrayList<Integer>();
        for(int num: arr){
            intArr.add(num);
        }
        Collections.reverse(intArr);
        System.out.println("Descending:" + intArr.toString());
    }
    public static void main(String[] args) {
        int[] test = {5,20,3,19};
        sortArrayAsc(test);
        sortArrayDesc(test);
    }
}
