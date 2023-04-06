package testCalc;

public class RomanCalculator implements Calculator {
    @Override
    public void getDataNum(String xIn, String arithOperator, String yIn) throws Exception {
        Converter convertetToRoman = new Converter();
        int x = convertetToRoman.romanToInt(xIn);
        int y = convertetToRoman.romanToInt(yIn);

        if (x < 0 ^ x > 10 ^ y < 0 ^ y > 10) {
            throw new Exception();
        }

        switch (arithOperator) {
            case "+":
                System.out.println(convertetToRoman.arabicToRoman(x + y));
                break;
            case "-":
                if (x < y) throw new Exception();
                System.out.println(convertetToRoman.arabicToRoman(x - y));
                break;
            case "*":
                System.out.println(convertetToRoman.arabicToRoman(x * y));
                break;
            case "/":
                if (y == 0) {
                    throw new Exception();
                }
                System.out.println(convertetToRoman.arabicToRoman(x / y));
                break;
            default: throw new Exception();
        }

    }

}