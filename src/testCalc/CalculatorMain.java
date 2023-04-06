package testCalc;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();


        Converter convertetToRoman = new Converter();
        CalculatorFactoty getNewCalculator = new CalculatorFactoty();
        String[] split = input1.split(" ");
        if (split.length !=3) throw new Exception();
        if (convertetToRoman.isRoman(split[0]) == convertetToRoman.isRoman(split[2])) {
            getNewCalculator.chooseCalculatorType(split[0]).getDataNum(split[0], split[1], split[2]);
        } else throw new Exception();

    }
}
