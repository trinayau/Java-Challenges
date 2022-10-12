package ArrayEvenOrOdd;

/* Find even or odd numbers from given array elements*/
public class EvenOrOdd {

    public static void evenOrOdd(int a[]){
        System.out.println("Odd Numbers: ");
        for(int i = 0; i < a.length; i++){
            if(a[i]%2 != 0){
                System.out.println(a[i]);
            }
        }
        System.out.println("Even Numbers:");
        for(int i=0;i<a.length;i++){
            if(a[i]%2 == 0){
                System.out.println(a[i]);
            }

        }

    }


    public static void main(String[] args) {
        int test[] = {1,2,5,6,2};
        evenOrOdd(test);


    }
}
