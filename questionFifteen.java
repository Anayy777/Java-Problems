import java.util.Scanner;

// Write a program to input a number and check whether it is divisible by 5 and 3 or not.
public class questionFifteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        if(number % 5 == 0 && number % 3 == 0){
            System.out.println(number + " is divisible by both 5 and 3 ");
            
        }
        else{
            System.out.println(number + " is not divisble by 5 and 3");
        }
    }    
}
