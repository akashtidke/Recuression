import java.util.Scanner;

public class Print_increasin_Deacrsing {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
incrANDdecr(n);
    }
    static void incrANDdecr(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        incrANDdecr(n-1);
        System.out.println(n);
    }
}
