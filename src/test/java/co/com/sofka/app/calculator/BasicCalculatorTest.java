package co.com.sofka.app.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @DisplayName("Testing several subs")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "3,    1,   2",
            "5,    2,   3",
            "100,  51, 49",
            "101,  100, 1"
    })
    public void severalSubs(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sub(first, second),
                () -> first + " - " + second + " should equal " + expectedResult);
    }

    @DisplayName("Testing several muls")
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "3,    1,   3",
            "5,    2,   10",
            "10,  51,  510",
            "101,  100, 10100"
    })
    public void severalMuls(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.mul(first, second),
                () -> first + " * " + second + " should equal " + expectedResult);
    }

    @DisplayName("Testing several divs")
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "3,    1,   3",
            "10,    2,   5",
            "510,  51,  10",
            "10100,  100, 101"
    })
    public void severalDivs(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.div(first, second),
                () -> first + " / " + second + " should equal " + expectedResult);
    }

}