import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Print_Decreasing {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        decreasing(n);
    }
    static void decreasing(int n){
        if (n==0)return;
        System.out.println(n);
        decreasing(n-1);

    }

}
