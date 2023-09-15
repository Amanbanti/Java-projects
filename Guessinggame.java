/*

Number Guessing Game
This is a simple game that can help you get your feet wet with Java. 
The game is relatively simple — the computer generates a random number, and the user must guess the number.
The computer will then let the user know that their guess is too high, too low, or correct.
This can be free-form, allowing an unlimited number of guesses, 
or give the user a set number of guesses before the game ends.

Number guessing games involve some Java programming basics like accepting inputs from the user, 
creating classes, and using conditional statements. 
*/

import java.util.Scanner;
class Moter{

    public int guessingnum1;
    int count=0;
    public void doit(int guessingnum, int userinput){
        
        if(count<4){
            if(userinput==guessingnum){
                System.out.println("Congrats...You WIN! You Gussed Correctly.");
                
            }
            else if (userinput>guessingnum){
                System.out.println("The Scecret number is less than "+userinput+". Try again! ");
                 count++;
                userinputmethod();
               
            }
            else if (userinput<guessingnum){
                System.out.println("The Scecret number is greather than "+userinput+". Try again! ");
                 count++;
                userinputmethod();
               
            }
            
        }
        else{
            System.out.println("You are out of Guesses. You loss!");
        }
        
       

    }

    public void userinputmethod(){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the guess numer between 10 up to 99 again:");
         int userinput=sc.nextInt();
        doit(guessingnum1, userinput);
       
    }
}


public class Guessinggame{
    public static void main(String[] args){
        int i=1;
        while(i==1){
             int guessingnum=(int)(Math.random()*100);
            System.out.println("Enter the guess numer between 10 up to 99:");
            System.out.println("You have only 5 Guesses!:");
            Moter obj=new Moter();
            Scanner sc=new Scanner(System.in);
            int userinput=sc.nextInt();
            obj.guessingnum1=guessingnum;
            obj.doit(guessingnum, userinput);

            Scanner loop =new Scanner(System.in);
            System.out.println("Enter 1 to Play again! 0 to Exit!");
            int lp=loop.nextInt();
            i=lp;

        }
    }
}