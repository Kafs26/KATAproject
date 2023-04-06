package testCalc;

public class CalculatorFactoty {
    public Calculator chooseCalculatorType(String xInut) {
        if (xInut == null || xInut.isEmpty()) return null;
        Converter checkInputData = new Converter();
        if (checkInputData.isRoman(xInut)) {
            return (new RomanCalculator());
        } else  return (new ArabicCalculator());
    }
}
