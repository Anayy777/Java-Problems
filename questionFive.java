import java.util.Scanner;

public class questionFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Month Number : ");
        int month = sc.nextInt();
    
        if(month == 1 || month == 3 || month == 5 ||  month == 7 || month == 8 || month == 9 || month == 12){
            System.out.println("The month has 31 days");
        }
        
        else if(month == 2){
            System.out.println("The month has 28 days");
        } // might also consider leap year using a year variable but question didnt ask
        
        else{
            System.out.println("the month has 30 days");
        }

        sc.close();
    }
}
