package P01BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class EX9SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int num =1;
        int printedNumbers = 0;
        int sum = 0;
        while (printedNumbers<n){
            printedNumbers++;
            System.out.println(num);
            sum+=num;
            num+=2;
        }
        System.out.printf("Sum: %d", sum);
    }
}
