import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // taking int x and y as input. if x is greater than y then print x else print y
        Scanner scanner = new Scanner(System.in);
        System.out.println("input x");
        int x = scanner.nextInt();
        System.out.println("input y");
        int y = scanner.nextInt();

        if(x > y){
            System.out.println("x is big - " + x);
        }
        else{
            System.out.println("y is big - " + y);
        }

        //Looping and printing from min to max on x, y
        int min = 0;
        int max = 0;
        boolean flag = true;

        if(x>y){
            min = y;
            max = x;
        }
        else if(y>x){
            min = x;
            max = y;
        }
        else{
            System.out.println("you have given same number");
            flag = false;
        }

        if(flag){
            for(int i = min; i<=max; i++){
                System.out.println(i);
            }
        }

        // using a while loop
        System.out.println("\nusing while loop\n");
        while(min != 0){
            System.out.println(min);
            min--;
        }
    }
}