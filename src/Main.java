import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please put in two numbers");
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
//        Scanner scanner = new Scanner(System.in);
        String input2 = scanner.nextLine();

        System.out.println("Input1 is " + input1 + " and input2 is " + input2);

        double operand1 = Double.parseDouble(input1); //this is where the input comes from
        double operand2 = Double.parseDouble(input2); //this is where the input comes from


        double sum = operand1 + operand2;
        double diff = operand1 - operand2;
        double div = operand1 / operand2;
        double mult = operand1 * operand2;
        double remainder = operand1 % operand2;

        showResult(sum, diff, div, mult, remainder);

    }

    private static void showResult(double sum, double diff, double div, double mult, double remainder){
        System.out.println("the sum is" + sum);
        System.out.println("the difference is " + diff);
        System.out.println("the two numbers divided are " + div);
        System.out.println("the quotient is" + mult);
        System.out.println("the reaminder is" + remainder);
    }
}
