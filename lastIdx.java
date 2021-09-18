import java.util.Scanner;

public class lastIdx {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scn.nextInt();
        }
        int target= scn.nextInt();
        int ans=lastIdxOf(arr,0,target);
        System.out.println(ans);
    }
    static int lastIdxOf(int[]arr,int idx,int target){
        if (idx==arr.length){
            return -1;
        }

       int ans=lastIdxOf(arr,idx+1,target);

        if (ans==-1) {
            if (target == arr[idx]) {
                return idx;
            } else {
                return -1;
            }
        }else {
            return ans;
        }


        }
    }

