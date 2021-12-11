mport java.util.*;
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
    int random = rand.nextInt(upperbound);// 0 1

    if (random==0) {
        stake--;    // decrement s--
        System.out.print("The current stake is :"+stake);  //150
    } else if (random==1){
        stake++;   // increment s++ 
        System.out.print("The current stake is :"+stake);  //150
    }

    }
}
