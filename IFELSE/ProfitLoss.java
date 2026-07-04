/*  if cost price and selling price of an item is input through the keyboard , write a 
program to determine whether the seller has made profit or incurred loss or no profit 
no loss. also determine how much profit he made or loss the incurred.
*/

import java.util.Scanner;
public class ProfitLoss {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Cost Price of item : " );
        int cp = sc.nextInt();
        System.out.println("Enter the Selling Price of item : ");
        int sp = sc.nextInt();
        if (sp > cp) {
            System.out.println(" Profit is : " +(sp-cp));
            if(cp>sp){
                System.out.println(" Loss is : " + (cp-sp));
            }
        if( sp ==cp){
            System.out.println(" No Profit No Loss ");
        }
    }
    }
}
/*
output Enter the Cost Price of Item : 10000 
       Enter the Sell Price of Item : 12000
       profit is 2000
output Enter the Cost Price of Item : 5000
       Enter the Sell Price of Item : 3000
       Loss is 2000
Output Enter the Cost Price of Item : 3000
       Enter the Sell Price of Item : 3000
       No Profit No Loss              
*/