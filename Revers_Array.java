import java.util.Scanner;

public class Revers_Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        revers(arr,0);
    }
static void revers(int []arr,int idx){
if (idx== arr.length)return;
        revers(arr,idx+1);
    System.out.println(arr[idx]);
}
}
