package P01BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class EX11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        if (n>10){
            int result = n * num;
            System.out.printf("%d X %d = %d%n", num, n, result);

        }
        for (int i = n; i <=10 ; i++) {
            int result = i*num;
            System.out.printf("%d X %d = %d%n", num, i, result);
        }

    }
}
