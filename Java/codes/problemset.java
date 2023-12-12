import java.util.Scanner;

public class problemset {

    // question3
    // public static void main(String[] args) {
    //     Scanner sc =new Scanner(System.in);

    //     try{
    //         System.out.print("Enter name:");
    //         String name= sc.next();
    //         System.out.println("Hello "+name+" have a good day!");
    //     }
    //     finally{
    //         sc.close();
    //     }
    // }

    // question5
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try{
            System.out.print("Enter number: ");
            String num= sc.next();

            boolean isInteger=isInteger(num);

            if (isInteger){
                System.out.println("The number is a integer.");
            }
            else{
                System.out.println("The number is not an integer.");
            }
        }
        finally{
            sc.close();
        }
    }

    public static boolean isInteger(String input){
        try{
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }

}
