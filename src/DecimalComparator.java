public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
        if ((int) firstNumber * 1000 ==  (int) secondNumber * 1000) {
            return true;
        } else {
            return false;

    }
}

public static void main(String[] args){
    areEqualByThreeDecimalPlaces(-3.1756, -3.175);
    areEqualByThreeDecimalPlaces(3.175, 3.176);
    areEqualByThreeDecimalPlaces(3.0, 3.0);
    areEqualByThreeDecimalPlaces(-3.123, 3.123);

}}