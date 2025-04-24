import java.util.Scanner;

public class questionThirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        if(number % 5 == 0 & number % 7 == 0){
            System.out.println(number + " is divisible by both 5 and 7 ");
            
        }
        else if(number % 5 == 0 ){
            System.out.println(number + " is divisible by 5");

        }
        else if(number % 7 == 0 ){
            System.out.println(number + " is divisible by 7");

        }
        else{
            System.out.println(number + " is neither divisble by 5 nor by 7");
        }
    }
}
