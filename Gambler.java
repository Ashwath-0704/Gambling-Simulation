import java.util.*;
import  java.util.Random;

public class UC7Gambler {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n;
        System.out.print("Enter the stake you want : ");  
        n=sc.nextInt(); 
        int stake  = n;
        int fixed_stake =n;

        int k;
        System.out.print("Enter the bet : ");  
        k=sc.nextInt();
        int bets = k;

        System.out.print("Enter the number months : ");  
        int months=sc.nextInt();

        int upperbound = 2;
        
        Random rand = new Random();

        int stop_value=30; // 1 Month // 29 --
        int End_Value =0;//0

// using For loop to check the months
        for (int i = 1; i <=months ; i++) { // 1
            
    // using while loop to check the condtions
            while ((stop_value>End_Value))
            {
                int random = rand.nextInt(upperbound);
                
                //inner IF Statement
                if (random==0) 
                    stake--; 
                else if (random==1)
                    stake++;
                stop_value--;
            }// end while loop

// displaying current Stake value  
    System.out.print("\nThe current stake value  is :"+stake+"\n"); 

        //Re-initzating the values for every iteration 
            stop_value+=30;
            // OUtter loop
            if (stake>fixed_stake) {

                    System.out.print("\nYOU WON!...\n\nWould like to continue playing next month \n1. yes\n2. No\n");  
                    int next_month=sc.nextInt();

                    //inner IF Statement
                    if(next_month==1) {
                        continue;
                    }else 
                     System.out.print("\nTHANK YOU\n\n****GAME OVER****\n\n");  
                    break;

            }else 
            System.out.print("\nYOU LOST\n\n****GAME OVER****\n\n");  
            break;
            
        }// end Of For loop
    }
    
}
