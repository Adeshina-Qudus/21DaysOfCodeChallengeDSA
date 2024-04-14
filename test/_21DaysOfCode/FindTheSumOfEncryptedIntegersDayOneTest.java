package _21DaysOfCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheSumOfEncryptedIntegersDayOneTest {
    @Test
    public void test(){
        int [] inputtedArray = {1,2,3};
        int output = 6 ;
        assertEquals(output,FindTheSumOfEncryptedIntegersDayOne.sumOfEncryptedIntegers(inputtedArray));
    }
    @Test
    public void secondTest(){
        int [] inputtedArray = {10,21,31};
        int output = 66 ;
        assertEquals(output,FindTheSumOfEncryptedIntegersDayOne.sumOfEncryptedIntegers(inputtedArray));
    }

}