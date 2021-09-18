import java.util.Scanner;

public class FirsIdx {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scn.nextInt();
        }
        int target= scn.nextInt();
        int ans=FirsIdx(arr,0,target);
        System.out.println(ans);
    }
    static int FirsIdx(int []arr,int idx,int target){
        if (idx==arr.length){
            return -1;
        }
         int a=FirsIdx(arr, idx+1, target);

        if (arr[idx]==target){
            return idx;
        }else {
            return a;
        }

    }

}
