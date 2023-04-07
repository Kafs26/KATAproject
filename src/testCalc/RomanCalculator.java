package testCalc;

 class RomanCalculator implements Calculator {
    @Override
    public String getData(String xIn, String arithOperator, String yIn) {
        Converter convertetToRoman = new Converter();
        int x = convertetToRoman.romanToInt(xIn);
        int y = convertetToRoman.romanToInt(yIn);

        if (x < 0 || x > 10 || y < 0 || y > 10) {
            throw new IllegalArgumentException("Введенные данные не соовтетствуют требуемому диапазону");
        }
        String result = "";
        switch (arithOperator) {
            case "+":
                return result = convertetToRoman.arabicToRoman(x + y);
                    case "-":
                if (x < y) throw new IllegalArgumentException("В римском исчислении невозможен отрицательный результат!");
                return result = convertetToRoman.arabicToRoman(x - y);
            case "*":
                return result = convertetToRoman.arabicToRoman(x * y);
            case "/":
                if (y == 0) {
                    throw new IllegalArgumentException("Делить на 0 нельзя");
                }
                return result = convertetToRoman.arabicToRoman(x / y);
            default: new IllegalArgumentException("Неизвестный оператор" + arithOperator);
        }
        return result;
    }

}