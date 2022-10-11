package PrimeOrNot;

public class PrimeOrNot {
    public static void main(String[] args){
        int n = 100;
        for(int i = 1; i <= n; i++){
            int divisible = 0;
            for(int j = 2; j < i; j++) {
                if (i % j == 0)
                    ++divisible;
            }
        }
    }
}
