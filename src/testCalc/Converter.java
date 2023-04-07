package testCalc;

import java.util.List;
import java.util.TreeMap;

class Converter {
    TreeMap<String, Integer> romanNumber = new TreeMap<>();

    public Converter() {
        romanNumber.put("I", 1);
        romanNumber.put("II", 2);
        romanNumber.put("III", 3);
        romanNumber.put("IV", 4);
        romanNumber.put("V", 5);
        romanNumber.put("VI", 6);
        romanNumber.put("VII", 7);
        romanNumber.put("VIII", 8);
        romanNumber.put("IX", 9);
        romanNumber.put("X", 10);
    }

    public boolean isRoman(String number) {
        return romanNumber.containsKey(number);
    }

    public String arabicToRoman(int number) {
        List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while ((number > 0) && (i < romanNumerals.size())) {
            RomanNumeral currentSymbol = romanNumerals.get(i);
            if (currentSymbol.getValue() <= number) {
                sb.append(currentSymbol.name());
                number -= currentSymbol.getValue();
            } else {
                i++;
            }
        }
        return sb.toString();
    }

    public int romanToInt(String s) {
        String romanNumeral = s;
        int result = 0;

        List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();

        int i = 0;

        while ((romanNumeral.length() > 0) && (i < romanNumerals.size())) {
            RomanNumeral symbol = romanNumerals.get(i);
            if (romanNumeral.startsWith(symbol.name())) {
                result += symbol.getValue();
                romanNumeral = romanNumeral.substring(symbol.name().length());
            } else {
                i++;
            }
        }
        return result;

    }
}
