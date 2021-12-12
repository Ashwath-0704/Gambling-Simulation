
import java.util.*;
import  java.util.Random;

public class UC5Gambler {
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

        System.out.print("Enter the number months : ");  
        int months=sc.nextInt();

        int upperbound = 2;

        int profit=0;// 1
        int lose=0;// -1
        
        Random rand = new Random();

        int stop_value=30; // 1 Month // 29 --
        int End_Value =0;//0
        
        

// using For loop to check the months
        for (int i = 1; i <=months ; i++) { // 1
            
    // using while loop to check the condtions
            while ((stop_value>End_Value)) {
                int random = rand.nextInt(upperbound);

                if (random==0) {
                    stake--; 
                    lose--;   // decrement s--
                } 
                else if (random==1){
                    stake++;
                    profit++;   // increment s++ 
                }
                stop_value--;
            }// end while loop

// displaying current Stake value
            System.out.print("\n"+i+")");  
            System.out.print("\n The current profit value is :"+profit);  // profit++
            System.out.print(" ");  
            System.out.print("\n The current lose value is :"+lose);  // profit++
            System.out.print(" ");  
            System.out.print("\n The current stake value  is :"+stake);  // Stake
        
        //Re-initzating the values for every iteration 
        stop_value+=30;
        }// end fo For loop

        if ((stake+profit)>(stake-lose)) { // ((100+200)>(100-(-250)))
            System.out.println("\nYou are in Profit");
        } else {
            System.out.println("\nYou are in Lose");
        }
    }
    
}
