import java.util.Scanner;

public class first {
    public static void printmin(int arr[],int n) {
        int minN=arr[0];
        for(int i=0;i<n;i++){
            if (arr[i]<minN) {
                minN=arr[i];
            }
        }
        System.out.println(minN);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        printmin(arr,n);
    }


}