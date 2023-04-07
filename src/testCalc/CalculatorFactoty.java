package testCalc;

public class CalculatorFactoty {
    public Calculator chooseCalculatorType(String xInut) {
        if (xInut == null || xInut.isEmpty())
            throw new IllegalStateException("Нет калькулятора для выражения вида " + xInut);
        final Converter checkInputData = new Converter();
        String[] split = xInut.split(" ");
        if (split.length != 3)
            throw new IllegalArgumentException("Введенные данные не соовтетствуют требованиям ввода: аргумент - оператор - аргумент");
        if (checkInputData.isRoman(split[0]) == checkInputData.isRoman(split[2])) {
            if (checkInputData.isRoman(split[0])) {
                return (new RomanCalculator());
            } else return (new ArabicCalculator());
        }
        return null;
    }
}
