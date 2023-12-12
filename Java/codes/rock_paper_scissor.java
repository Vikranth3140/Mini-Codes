import java.util.Random;
import java.util.Scanner;
public class rock_paper_scissor {
    public static void main(String[] args) {
        int hcnt=0; int ccnt=0;
        for (int i = 0; i < 5; i++) {
            Random rand = new Random();
            int upperbound=2;
            int comp = rand.nextInt(upperbound);

            // System.out.println(comp);

            // 0=rock, 1=paper, 2=scissors

            System.out.print("Enter a number from 0 for rock, 1 for paper and 2 for scissors:");
            Scanner sc = new Scanner(System.in);
            int human=sc.nextInt();

            // System.out.println("\n");
            System.out.println("Number entered by computer: "+comp);
            System.out.println("Number entered by you: "+human);

            if (human!=0 && human!=1 && human!=2){
                System.out.println("Error!");
            }
            else if (comp==human){
                System.out.println("Its a tie");
            }
            else if (comp==0 && human==1){
                System.out.println("You Win!");
                hcnt++;
            }
            else if (comp==0 && human==2){
                System.out.println("You Lose!");
                ccnt++;
            }
            else if (comp==1 && human==0){
                System.out.println("You Lose!");
                ccnt++;
            }
            else if (comp==1 && human==2){
                System.out.println("You Win!");
                hcnt++;
            }
            else if (comp==2 && human==0){
                System.out.println("You Win!");
                hcnt++;
            }
            else if (comp==2 && human==1){
                System.out.println("You Lose!");
                ccnt++;
            }
            else{
                System.out.println("Error!");
            }
        }

        if (hcnt>ccnt){
            System.out.println("You Win!");
        }
        else if (hcnt==ccnt){
            System.out.println("Its a tie!");
        }
        else{
            System.out.println("You Lose!");
        }
    }

}
