import java.util.Scanner;

public class pyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r= sc.nextInt();
        int c= sc.nextInt();

        for(int i=1; i<=r; i++){ // traversing through rows

            // how many spaces to print before the stars in each row 
            //r-i spaces in each row
            for(int j=i; j<r; j++){
                System.out.print(" ");
            }

            // print 2*i-1 stars in each row
            for(int k=1; k<=(2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
