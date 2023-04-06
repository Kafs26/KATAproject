package testCalc;

public class ArabicCalculator implements Calculator {

    @Override
    public void getDataNum(String xInput, String arithOperator, String yInput) throws Exception {
        int x = Integer.parseInt(xInput);
        int y = Integer.parseInt(yInput);
        if (x < 0 ^ x > 10 ^ y < 0 ^ y > 10) {
            throw new Exception();
        }
        switch (arithOperator) {
            case "+":
                System.out.println(x + y);
                break;
            case "-":
                System.out.println(x - y);
                break;
            case "*":
                System.out.println(x * y);
                break;
            case "/":
                if (y == 0) {
                    throw new Exception();
                }
                System.out.println(x / y);
                break;
            default: throw new Exception();
        }

    }
}