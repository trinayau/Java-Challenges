package SumOfArray;

public class SumOfArray {

    public static void sumArray(int[] arr){
        int sum = 0;
        for(int num:arr){
            sum+= num;
        }
        System.out.println("Total: " + sum);
    }
    public static void main(String[] args) {
        int test[] = {1,2,5,20,28};
        sumArray(test);


    }
}
