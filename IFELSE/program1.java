
// Take positive integer input and tell if it is odd or even
import java.util.Scanner;
public class program1{
    public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
        System.out.println(" Enter The Number  : ");
        int a = sc.nextInt();
        if(a%2 == 0){
        System.out.println("The Number is Even : " + a);
        }
    else
        System.out.println(" The Number is Odd ");
    
    }
}
//output The Number is Even : 4
//       The Number is Odd : 7