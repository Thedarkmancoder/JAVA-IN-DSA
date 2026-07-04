
// Take Integer input and print the absolute value of that integer
import java.util.Scanner;
public class AbsoluteValue {
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Number : ");
    int num = sc.nextInt();
    if(num>=0){
        System.out.println(" number " + num);
    }else
        System.out.println("number " + -num);
   } 
}
//output Enter The Number : -88 //88
