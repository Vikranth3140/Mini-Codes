import java.util.Scanner;
public class if_Else {
    public static void main(String[] args) {
        System.out.print("Enter website:");
        Scanner sc= new Scanner(System.in);

        String website=sc.nextLine();
        if (website.endsWith(".com")){
            System.out.println("commercial website");
        }
        else if (website.endsWith(".org")){
            System.out.println("oragnizational website");
        }
        else if (website.endsWith(".in")){
            System.out.println("Indian website");
        }
        else{
            System.out.println("Error");
        }
    }
}
