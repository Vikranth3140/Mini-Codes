import java.util.Scanner;

public class refresher_1_q2 {
    public static double calculate(){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextInt();
        double b=sc.nextInt();
        int m= sc.nextInt();
        double c=(Math.pow(a,b))%m;

        return c;
    }
    public static void main(String[] args) {
        System.out.println("Result: "+calculate());
    }
}
