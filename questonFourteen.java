import java.util.Scanner;
public class questonFourteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Selling Price (in rs)");
        int sp = sc.nextInt();
        System.out.print("Enter Cost price (in rs)");
        int cp = sc.nextInt();

        if(sp > cp){
            System.out.println("PROFIT : " + (sp - cp));

        }
        else if(cp > sp){
            System.out.println("LOSS : " + (cp - sp));
        }
        else{
            System.out.println("break even point");
        }
    }
}

// Write a program to input selling price, cost price and print profit, loss or no profit no loss.
