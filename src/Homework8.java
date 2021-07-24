import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNum = scanner.nextInt();
        System.out.println("Choose your operator: ");
        String str = scanner.next();

        char operator = str.charAt(0);

        switch (operator){
            case '+':
                System.out.println("Sum of elements " + (firstNum + secondNum));
                break;
            case '-':
                System.out.println("Subtraction of elements " + (firstNum - secondNum));
                break;
            case '/':
                System.out.println("Division of elements " + (firstNum / secondNum));
                break;
            case '*':
                System.out.println("Multiplication of elements " + (firstNum * secondNum));
                break;
            case '%':
                System.out.println("Division with reminder " + (firstNum % secondNum));
                break;
            case 'p':
                System.out.println("Both elements are " + firstNum + ", " + secondNum);
                break;
            case 'b':
                if (firstNum > secondNum){
                    System.out.println("First number is bigger than second");
                }else if (secondNum > firstNum){
                    System.out.println("Second number is bigger than first");
                }else{
                    System.out.println("Numbers are equal");
                }
                break;
            case 's':
                if (firstNum < secondNum){
                    System.out.println("First number is smaller than second");
                }else if (secondNum < firstNum){
                    System.out.println("Second number is smaller than first");
                }else{
                    System.out.println("Numbers are equal");
                }
                break;
            default:
                System.out.println("No such operator! Try again!");
        }

    }
}
