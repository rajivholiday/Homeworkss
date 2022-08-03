package Lesson8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfDigitsTest {
    SumOfDigits mySum;

    @BeforeEach
    public void setup(){
        this.mySum = new SumOfDigits();
    }
    @Test
    void sum1(){
        assertEquals(16,getSum(565));
    }

}