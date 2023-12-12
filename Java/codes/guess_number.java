/*
create a class game which allows a user to play guess the number game once.
1. constructor to generate random number
2. takeUserInput() to take input from user
3. isCorrectNumber() to check if the number entered by the user is true
4. getter and setter for number of guesses
use properties such as numberOfGuesses(int) to get the task done.
 */

import java.util.Random;
import java.util.Scanner;
class game{
    private int myNum;
    private int compNum;
    private int numGuess=0;

    public int getNum(){
        return numGuess;
    }
    public void setNum(){
        numGuess=++numGuess;
    }
    public int game(){
        Random rand=new Random();
        System.out.print("Enter number: ");
        int upperbound= rand.nextInt(100);
        return rand.nextInt(upperbound);
    }
    public int user(){
        Scanner sc=new Scanner(System.in);
        int myNum=sc.nextInt();
        return myNum;
    }
}
public class guess_number {
    public static void main(String[] args) {
        game gn=new game();
        int compNum=gn.game();
        int myNum=gn.user();

//        System.out.println(myNum);
//        System.out.println(compNum);
        while(compNum!=myNum){
            if (myNum>compNum){
                System.out.println("Your number is greater.");
                gn.setNum();
            }
            else if(myNum<compNum){
                System.out.println("Your number is smaller.");
                gn.setNum();
            }
            if(myNum==compNum){
                int numGuess=gn.getNum();
                gn.setNum();
//                System.out.println(gn.getNum());
                break;

            }
            myNum=gn.user();
//            gn.setNum();

//            int numGuess=gn.getNum();
//            System.out.println(gn.getNum());
        }
        int numGuess=gn.getNum() +1;
        System.out.println("You win!");
        System.out.println("Number of guesses: "+numGuess);
    }
}
