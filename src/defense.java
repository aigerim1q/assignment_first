import java.util.Scanner;

public class defense{
    public static int count(int n ,int[] arr, int number) {
        int counnt = 0;
        if (n==1){
            return 1;
        }
        if (arr[n-1]==number) {
            counnt=1;
        }

        return counnt+ count(n-1,arr,number);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for (int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        int number=sc.nextInt();

        int result=count(n,arr,number);
        System.out.println(result);

        }



}

