package testCalc;

class ArabicCalculator implements Calculator {

    @Override
    public String getData(String xInput, String arithOperator, String yInput) {
        int x = Integer.parseInt(xInput);
        int y = Integer.parseInt(yInput);
        if (x < 0 || x > 10 || y < 0 || y > 10) {
            throw new IllegalArgumentException("Введенные данные не соовтетствуют требуемому диапазону");
        }
        String result;
        switch (arithOperator) {
            case "+":
                return result = Integer.toString(x + y);
            case "-":
                return result = Integer.toString(x - y);
            case "*":
                return result = Integer.toString(x * y);
            case "/":
                if (y == 0) {
                    throw new IllegalArgumentException("Делить на 0 нельзя");
                }
                return result = Integer.toString(x / y);
            default:
                throw new IllegalArgumentException("Неизвестный оператор" + arithOperator);
        }
     }
}