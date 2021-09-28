import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @org.junit.jupiter.api.Test
    void getFizzBuzzTranslate() {
        int a = 15;
        String expected = "FIZZBUZZ";
        String result = FizzBuzzTranslate.getFizzBuzzTranslate(a);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    void getFizzBuzzTranslate1() {
        int a = 25;
        String expected = "BUZZ";
        String result = FizzBuzzTranslate.getFizzBuzzTranslate(a);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    void getFizzBuzzTranslate2() {
        int a = 12;
        String expected = "FIZZ";
        String result = FizzBuzzTranslate.getFizzBuzzTranslate(a);
        assertEquals(expected, result);
    }
}