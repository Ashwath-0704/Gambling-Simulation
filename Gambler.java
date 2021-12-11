import java.util.*;
import  java.util.Random;

public class UC3Gambler {
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
        int random = rand.nextInt(upperbound);// 0 1

        int stop_value=stake/2 + stake;//150
        int End_Value =stake/2;//50

// using while loop to check the condtions
        while ((stop_value>stake) && (stake>End_Value)) {
            if (random==0) {
                stake--;    // decrement s--
            } else if (random==1){
                stake++;   // increment s++ 
            }
        }
// displaying current Stake value
        if (stop_value>=stake) {
            System.out.print("The current stake is :"+stake);  //150
            
        } else if (stake>=End_Value){
            System.out.print("The current stake is :"+stake);//50
        }
    }
    
}
