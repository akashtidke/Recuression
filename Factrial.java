import java.util.Scanner;

public class Factrial {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        System.out.println(fact(n));
    }
    static int fact(int n){
        if (n==0) {
            return 1;
        }

        int x=fact(n-1)*n;
return x;

    }
}
