package testCalc;

class ArabicCalculator implements Calculator {

    @Override
    public String getData(String xInput, String operator, String yInput) {
        int x = Integer.parseInt(xInput);
        int y = Integer.parseInt(yInput);
        if (x < 0 || x > 10 || y < 0 || y > 10) {
            throw new IllegalArgumentException("Введенные данные не соовтетствуют требуемому диапазону");
        }

        switch (operator) {
            case "+":
                return Integer.toString(x + y);
            case "-":
                return Integer.toString(x - y);
            case "*":
                return Integer.toString(x * y);
            case "/":
                if (y == 0) {
                    throw new IllegalArgumentException("Делить на 0 нельзя");
                }
                return Integer.toString(x / y);
            default:
                throw new IllegalArgumentException("Неизвестный оператор" + operator);
        }
    }
}