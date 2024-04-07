import java.util.Scanner;
/**
 * @brief checking prime or not
 * @param n size of array
 * @param printprime check whether the n is prime and print
 */
public class task3 {
    public static void printprime(int n) {
        if (n==2){
            System.out.println("prime");
        } else if (n%2!=0) {
            System.out.println("prime");

        }

        else{
            System.out.println("composite");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printprime(n);
    }


}