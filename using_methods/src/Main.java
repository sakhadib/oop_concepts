// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Calling add method to perform addition of two numbers
        int a = 10;
        int b = 20;
        int c = add(a, b);
        System.out.println("Addition of " + a + " and " + b + " is " + c);

        //Calling multiply method to perform multiplication of three numbers
        int q = multiply(a, b, c);
        System.out.println("Multiplication of " + a + ", " + b + " and " + c + " is " + q);

        //Calling gcd method to calculate GCD of two numbers
        int gcd = gcd(a, b);
        System.out.println("GCD of " + a + " and " + b + " is " + gcd);
    }


    // Creating Add method for adding two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // create a function to multiply 3 numbers
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    //create a function to calculate GCD of two numbers
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }
}