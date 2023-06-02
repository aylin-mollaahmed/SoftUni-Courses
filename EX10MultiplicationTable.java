package P01BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class EX10MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=10 ; i++) {
            int result = i*num;
            System.out.printf("%d X %d = %d%n", num, i, result);
        }
    }
}
