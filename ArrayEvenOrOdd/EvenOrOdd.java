package ArrayEvenOrOdd;
import java.util.*;

/* Find even or odd numbers from given array elements*/
public class EvenOrOdd {

    public static void findEvenOdd(ArrayList<Integer> givenArray) {
        ArrayList<Integer> oddArray = new ArrayList<Integer>();
        ArrayList<Integer> evenArray = new ArrayList<Integer>();
        for (int number:givenArray) {
            if(number%2 != 0 ){
            evenArray.add(number);}
            else {
                oddArray.add(number);
            }
        }
        System.out.println("Odd Array: " + oddArray.toString());
        System.out.println("Even Array: " + evenArray.toString());
    }

    /* This function causes issues as there are empty values*/
//    public static void evenOrOdd(int a[]){
//        int odd[] = new int[a.length];
//        int even[] = new int[a.length];
//        for(int i = 0; i < a.length; i++){
//            if(a[i]%2 != 0){
//                odd[i] = a[i];
//            } else {
//                even[i] = a[i];
//            }
//        }
//        System.out.println("Odd numbers: "+ Arrays.toString(odd));
//        System.out.println("Even numbers: "+ Arrays.toString(even));
//
//    }

    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(2);
        arrList.add(7);
        arrList.add(12);

        findEvenOdd(arrList);

    }
}
