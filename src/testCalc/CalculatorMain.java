package testCalc;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        System.out.print(calc(input1));
    }

    public static String calc(String input1) {
        CalculatorFactoty сalculatorFactoty = new CalculatorFactoty();
        String[] split = input1.split(" ");
        return сalculatorFactoty.chooseCalculatorType(input1).getData(split[0], split[1], split[2]);
    }
}
