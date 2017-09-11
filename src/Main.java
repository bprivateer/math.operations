import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

    System.out.println("Please put in two numbers");
        double operand1 = Double.parseDouble(input1); //this is where the input comes from
        double operand2 = Double.parseDouble(input2); //this is where the input comes from


        double sum = operand1 + operand2;
        double difference = operand1 - operand2;
        double division = operand1 / operand2;
        double multiplication = operand1 * operand2;
        double remainder = operand1 % operand2;

//    showResults("the sum is", sum, "the difference is", difference, "the division is",  division, "the multipllication is",
//    multiplication, "the remainder is", remainder);

        showResults(sum, difference, division, multiplication, remainder);




    }

    public static void showResults( double sum, double difference, double division, double multiplication, double remainder){
        System.out.printf("the sum is", sum);
        System.out.printf("the difference is", difference);
        System.out.printf("the division is", division);
        System.out.printf("the multiplication is", multiplication);
        System.out.printf("the remainder is", remainder);

    }
}
