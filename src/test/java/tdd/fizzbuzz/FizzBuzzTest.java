package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzTest {
//multiplesOf3
// multiplesOf5
//MultiplesOf7
    @Test
    void should_return_order_number_when_count_off_given_normal_case_order_number(){
        int orderNumber = 1;
        FizzBuzz fizzbuzz = new FizzBuzz();
        String result = fizzbuzz.countOff(orderNumber);
        assertThat(result).isEqualTo("1");
    }





}


