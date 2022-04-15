import java.util.Random;
import java.util.Scanner;
class Game1
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Rock,Paper,Scissors");
        //0 for Rock
        //1 for Scissors
        //2 for Paper
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 0 for Rock , 1 for Scissors , 2 for Paper:");
        int ui=sc.nextInt();
        Random ra=new Random();
        int ci=ra.nextInt(3);
        if(ui==ci)
        {
            System.out.println("MATCH DRAW");
        }
        else if(ui==0 && ci==1 || ui==1 && ci==2 || ui==2 && ci==0)
        {
            System.out.println("YOU WIN :)");
        }
        else
        {
            System.out.println("COMPUTER WINS :(");
        }
        System.out.println("Computer's Choice:"+ci);
    }
}