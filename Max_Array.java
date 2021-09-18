import java.util.Scanner;

public class Max_Array {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= scn.nextInt();
        }
        int ans=maxOf(arr, 0);
        System.out.println(ans);
    }
    static int maxOf(int []arr,int idx){
        if (idx==arr.length-1){
            return arr[idx];
        }
        int max=maxOf(arr,idx+1);
        if(max>arr[idx]){
            return max;
        }else {
            return arr[idx];
        }


    }
}
