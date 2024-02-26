import java.util.*;

public class NumberGame{
    public static void main(String[] args)
     {
        System.out.println("*-*-*-*-*-*-*-*-*-Number Game-*-*-*-*-*-*-*-*-*-*");
        Random rd = new Random();
        int minimum = 1;
        int maximum = 100;
        System.out.println("Guess a number between " + minimum + " to " + maximum);
        Scanner sc = new Scanner(System.in);
        int randomNumber = rd.nextInt(100) + 1;
        int num = 0;
        int trails = 8;

        while (trails > 0) 
        {
            System.out.println("Enter your guess: ");
            num = sc.nextInt();

            if (num == randomNumber)
            {
                System.out.println("You guessed the correct number.");
                break;
            } else if (num < randomNumber)
            {
                System.out.println("Too low! Try again.");
            } else
            {
                System.out.println("Too high! Try again.");
            }
            trails--; 
        }

        if (trails == 0)
        {
            System.out.println("You've used all your attempts!");
            System.out.println("The correct number was:" + randomNumber);
        }
        sc.close();
    }
}

    
            

