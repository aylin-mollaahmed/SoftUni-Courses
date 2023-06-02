package P01BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class EX4BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int minutesAfter = minutes + 30;
        if (minutesAfter>=60){
            hours++;
            minutesAfter-=60;
        }
        if (hours==24){
            System.out.printf("00:%d",minutesAfter);
        } else {
            System.out.printf("%d:%d",hours,minutesAfter);
        }
    }
}
