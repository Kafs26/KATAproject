package testCalc;

class RomanCalculator implements Calculator {
    @Override
    public String getData(String xIn, String operator, String yIn) {
        Converter convertToRoman = new Converter();
        int x = convertToRoman.romanToInt(xIn);
        int y = convertToRoman.romanToInt(yIn);

        if (x < 0 || x > 10 || y < 0 || y > 10) {
            throw new IllegalArgumentException("Введенные данные не соовтетствуют требуемому диапазону");
        }
        String result ="";
        switch (operator) {
            case "+":
                 return result= convertToRoman.arabicToRoman(x + y);
            case "-":
                if (x < y) {
                    throw new IllegalArgumentException("В римском исчислении невозможен отрицательный результат!");
                }
                return result = convertToRoman.arabicToRoman(x - y);
            case "*":
                return result = convertToRoman.arabicToRoman(x * y);
            case "/":
                if (y == 0) {
                    throw new IllegalArgumentException("Делить на 0 нельзя");
                }
                return result = convertToRoman.arabicToRoman(x / y);
            default:
                new IllegalArgumentException("Неизвестный оператор" + operator);
        }
        return result;
    }

}