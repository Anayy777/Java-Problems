import java.util.Scanner;

public class questionSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER MARKS (OUT OF 100) ; ");
        int marks = sc.nextInt();
        if(marks > 100){
            System.out.println("BE FOR REAL");
        }
        else if(marks > 80 && marks <= 100){
            System.out.println("GRADE : A");
        }
        else if(marks > 60 && marks <= 80){
            System.out.println("GRADE : B");
        }
        else if(marks > 40 && marks <= 60){
            System.out.println("GRADE : C");
        }
        else if(marks > 30 && marks <= 40){
            System.out.println("GRADE : D");
        }
        else{
            System.out.println("FAILED");
        }
    }
    
}
