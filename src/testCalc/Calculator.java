package testCalc;

public interface Calculator {
    default void getDataNum(String firstData, String arithOperator, String secondData) throws Exception {
    }
}
