public class bitwise {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        // Bitwise AND
        int andResult = a & b;
        System.out.println("Bitwise AND of " + a + " and " + b + " is: " + andResult);

        // Bitwise OR
        int orResult = a | b;
        System.out.println("Bitwise OR of " + a + " and " + b + " is: " + orResult);

        // Bitwise XOR
        int xorResult = a ^ b;
        System.out.println("Bitwise XOR of " + a + " and " + b + " is: " + xorResult);

        // Bitwise NOT
        int notResult = ~a;
        System.out.println("Bitwise NOT of " + a + " is: " + notResult);
    }
}