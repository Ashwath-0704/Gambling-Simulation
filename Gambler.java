import java.util.*;
import  java.util.Random;

public class Gambler {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in); 
        int n;
        System.out.print("Enter the stake you want : ");  
        n=sc.nextInt(); 
        int stake  = n;
        int k;
        System.out.print("Enter the bet : ");  
        k=sc.nextInt();
        int bets = k;

        int upperbound = 2;

        Random rand = new Random();

        // 0 1

        int stop_value=20;
        int End_Value =0;//50

// using while loop to check the condtions
        while ((stop_value>End_Value)) {
            int random = rand.nextInt(upperbound);

            if (random==0) {
                stake--;    // decrement s--
            } 
            else if (random==1){
                stake++;   // increment s++ 
            }
            stop_value--;
            System.out.print("\n The current stake is :"+stake);  //150

        }
// displaying current Stake value
    
    }
    
}
