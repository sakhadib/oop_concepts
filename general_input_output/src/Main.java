import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //for printing something directly
        System.out.println("Printing this line directly");  //println = print line

        //taking string and printing it directly
        String s1 = "This is a static string";
        System.out.println(s1);

        //Appending a string with direct "" in println
        String s2 = "This string is gonna be appended with  -";
        System.out.println(s2+" this appending direct string");

        //Appending 2 strings and adding them to create a third string
        String s3 = "ami 1 number ";
        String s4 = "ami 2 number";
        String s5 = s3 + s4;
        System.out.println(s5);

        //Taking a string input and appending it with another to print a hello messege
        Scanner scanner = new Scanner(System.in);   // there is no builtin console_readline for JAVA. we have to use scanner
        System.out.println("what is your name...");
        //String s6 = scanner.nextLine();
        //System.out.println("Welcome onboard. You are, " + s6);

        //Taking two integer and adding them.
        int i1 = 10;
        int i2 = 20;
        int result_1 = i1 + i2;
        System.out.println("Result is " + result_1);
    }
}