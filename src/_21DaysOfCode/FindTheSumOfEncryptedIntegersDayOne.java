package _21DaysOfCode;

public class FindTheSumOfEncryptedIntegersDayOne {

    public static int sumOfEncryptedIntegers(int[] inputtedArray) {
        encrypting(inputtedArray);
        int result = 0 ;
        for (int count : inputtedArray){
            result+=count;
        }
        return result;
    }

    private static void encrypting(int[] inputtedArray) {

        for (int eachElement = 0; eachElement < inputtedArray.length; eachElement++){
            inputtedArray[eachElement] = changingAllToMaximum(inputtedArray[eachElement]);
        }
    }

    private static int changingAllToMaximum(int element) {
        String value = String.valueOf(element);
        int countingWhenItsTheHighest = 0;
        int countingWhenItsTheHighestToo = 0;
        String gettingElement = "";
        for (int count = 0 ; count < value.length();count++){
            for (int counter = 0; counter < value.length(); counter++){
                if (value.charAt(count) >= value.charAt(counter)){
                    countingWhenItsTheHighest++;
                }
            }
            if (countingWhenItsTheHighest > countingWhenItsTheHighestToo){
                gettingElement = String.valueOf(value.charAt(count));
            }
            countingWhenItsTheHighestToo = countingWhenItsTheHighest;
            countingWhenItsTheHighest = 0;
        }
        return element(Integer.parseInt(gettingElement),value.length());
    }

    private static int element(int gettingElement, int length) {
        return Integer.parseInt((String.valueOf(gettingElement).repeat(Math.max(0, length))));
    }
}
