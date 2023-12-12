import java.util.Arrays;
import java.util.Scanner;

public class refresher_1_q3 {
    public static boolean check(String a, String b){
        char []array_a=a.toCharArray();
        char []array_b=b.toCharArray();

        Arrays.sort(array_a);
        Arrays.sort(array_b);

        boolean c= Arrays.equals(array_a, array_b);
        return c;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first string: ");
        String one=sc.nextLine();
        System.out.print("Enter second string: ");
        String two= sc.nextLine();

        boolean res=check(one, two);
        if (res==false){
            System.out.println("Strings are not equal.");
        }
        else{
            System.out.println("Strings are equal.");
        }
    }
}
