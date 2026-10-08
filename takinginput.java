import java.util.Scanner;

public class takinginput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name ");
        String name = sc.nextLine();  // NEXTLINE is used to take input of string with space , it will take the whole line as input for example 
        //  if you enter "Tony Stark" it will take the whole line as input otherwise if you use next() it will only take "Tony" as input 
        // and ignore the rest of the line


        System.out.println("Your name is: " + name);
        // System.out.println("Enter your number ");
        // int num_1 = sc.nextInt();
        // System.out.println("Your Number is: " + num_1);
        
    }
}