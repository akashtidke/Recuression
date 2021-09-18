import java.util.Scanner;

public class PowerLinear {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int x= scn.nextInt();
        int n= scn.nextInt();
        System.out.println(Power(x,n));
    }
    static int Power(int x,int n){
        if (n==0){
            return 1;
        }
        int m=Power(x,n-1);
        int z=m*x;
        return z;
    }
}
