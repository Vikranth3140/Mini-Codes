import java.util.Scanner;
public class refresher_1_q1 {
    public static String compress(String user) {
        String new_string = "";
        char current = user.charAt(0);
        int cnt = 1;

        for (int i = 1; i < user.length(); i++) {
            if (user.charAt(i) == current) {
                cnt++;
            } else {
                new_string += current + String.valueOf(cnt);
                current = user.charAt(i);
                cnt = 1;
            }
        }
        new_string+=current +(cnt>1?String.valueOf(cnt):"1");
        return new_string;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String input: ");
        String user_input = sc.nextLine();

        System.out.println("compressed string: "+compress(user_input));
    }

}
