import java.util.Scanner;

public class simpleinterst {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        float p= sc.nextFloat();
        System.out.println("Enter the rate of interest: ");
        float r= sc.nextFloat();
        System.out.println("Enter the time: ");
        float t= sc.nextFloat();
        float si= (p*r*t)/100;
        
        System.out.println("The principal amount is: " + p);
        System.out.println("The rate of interest is: " + r);
        System.out.println("The time is: " + t);
        System.out.println("The simple interest is: " + si);


    }
}
