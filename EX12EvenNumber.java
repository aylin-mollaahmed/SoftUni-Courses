package P01BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class EX12EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        boolean isEven  = num % 2 ==0;
        while (!isEven) {
            System.out.println("Please write an even number.");
            num = Integer.parseInt(scanner.nextLine());
             isEven  = num % 2 ==0;
        }

            System.out.printf("The number is: %d", Math.abs(num));

    }
}
