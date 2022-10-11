/* The Fibonacci series is a series of elements where, the previous two elements are added to get the next element,
* starting with 0 and 1.
 */

/* Given a number N, we need to find the Fibonacci Series up to the N term.*/
public class Fibonacci{
    public static void fib(int finalNum){
        int num1 = 0, num2 = 1, num3;
        System.out.println(num1);
        System.out.println(num2);
        for(num3=2; num3 < finalNum; num3++){
            num3=num1+num2;
            System.out.println(num3);
            num1=num2;
            num2=num3;
        }
    }
    public static void main(String[] args) {
        fib(20);
    }
}