import java.util.Scanner;

public class Print_incresing {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        increasing(n);
    }
    static void increasing(int n){
        if(n==0)return;

        increasing(n-1);
        System.out.println(n);
    }
}
