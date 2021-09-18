import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        System.out.println(fab(n));
    }
    static int fab(int x){
     if (x<2){
         return x;
     }

       return fab(x-1)+fab(x-2);
    }
}
